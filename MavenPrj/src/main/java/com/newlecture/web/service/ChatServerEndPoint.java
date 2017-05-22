package com.newlecture.web.service;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.websocket.EndpointConfig;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

//╪рдо : IP + Port + Web
@ServerEndpoint("/resource/chatserver")
public class ChatServerEndPoint {
	
	private static Set<Session> clients;
	
	static {
		clients = Collections.synchronizedSet(new HashSet<Session>());
	}
	
	@OnOpen
	public void onOpen(Session session, EndpointConfig config){
		clients.add(session);
		System.out.println("size : " + clients.size());
		System.out.println(session.toString() + ": connected");
	}
	
	@OnMessage
	public void onTextMessage(Session session, String data) throws IOException{
				
		ChatData chatData = new Gson().fromJson(data, ChatData.class);
		System.out.println(chatData.getMsg());
				
		for(Session s : clients)	
			s.getBasicRemote().sendText(data);
	}
	
	@OnClose
	public void onClose(Session session){
		clients.remove(session);
		System.out.println(session.toString() + ": disconnected");
	}
}


