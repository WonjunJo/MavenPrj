package com.newlecture.web.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.newlecture.web.dao.UnitDao;
import com.newlecture.web.entity.Unit;

public class MyBatisUnitDao implements UnitDao {
	
	@Autowired
	private SqlSession sqlSession;

	
	@Override
	public List<Unit> getList() {
		UnitDao unitDao = sqlSession.getMapper(UnitDao.class);
		return unitDao.getList();
	}

	@Override
	public List<Unit> getList(int page, String field, String query) {
		UnitDao unitDao = sqlSession.getMapper(UnitDao.class);
		return unitDao.getList(page, field, query);
	}

	@Override
	public List<Unit> getList(int page) {
		UnitDao unitDao = sqlSession.getMapper(UnitDao.class);
		return unitDao.getList(page);
	}

	@Override
	public Unit get(String id) {
		UnitDao unitDao = sqlSession.getMapper(UnitDao.class);
		return unitDao.get(id);
	}

	@Override
	public int add(Unit unit) {
		UnitDao unitDao = sqlSession.getMapper(UnitDao.class);
		return unitDao.add(unit);
	}

	@Override
	public int update(Unit unit) {
		UnitDao unitDao = sqlSession.getMapper(UnitDao.class);
		return unitDao.update(unit);
	}

	@Override
	public int delete(String id) {
		UnitDao unitDao = sqlSession.getMapper(UnitDao.class);
		return unitDao.delete(id);
	}

	@Override
	public List<Unit> getList(String chapterId) {
		UnitDao unitDao = sqlSession.getMapper(UnitDao.class);
		return unitDao.getList(chapterId);
	}
	

}
