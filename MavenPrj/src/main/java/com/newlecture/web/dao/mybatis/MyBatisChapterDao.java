package com.newlecture.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.newlecture.web.dao.ChapterDao;
import com.newlecture.web.entity.Chapter;

public class MyBatisChapterDao implements ChapterDao{
	
	@Autowired
	private SqlSession sqlSession;

	
	@Override
	public List<Chapter> getList() {
		ChapterDao chapterDao = sqlSession.getMapper(ChapterDao.class);
		return chapterDao.getList();
	}

	@Override
	public List<Chapter> getList(int page, String field, String query) {
		ChapterDao chapterDao = sqlSession.getMapper(ChapterDao.class);
		return chapterDao.getList(page, field, query);
	}

	@Override
	public List<Chapter> getList(int page) {
		ChapterDao chapterDao = sqlSession.getMapper(ChapterDao.class);
		return chapterDao.getList(page);
	}

	@Override
	public Chapter get(String id) {
		ChapterDao chapterDao = sqlSession.getMapper(ChapterDao.class);
		return chapterDao.get(id);
	}

	@Override
	public int add(Chapter chapter) {
		ChapterDao chapterDao = sqlSession.getMapper(ChapterDao.class);
		return chapterDao.add(chapter);
	}

	@Override
	public int update(Chapter chapter) {
		ChapterDao chapterDao = sqlSession.getMapper(ChapterDao.class);
		return chapterDao.update(chapter);
	}

	@Override
	public int delete(String id) {
		ChapterDao chapterDao = sqlSession.getMapper(ChapterDao.class);
		return chapterDao.delete(id);
	}

	@Override
	public List<Chapter> getList(String lectureId) {
		ChapterDao chapterDao = sqlSession.getMapper(ChapterDao.class);
		return chapterDao.getList(lectureId);
	}

}
