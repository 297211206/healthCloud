package com.hhit.service.impl;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hhit.dao.LoveProjectDao;
import com.hhit.entity.LoveProjectModel;
import com.hhit.service.LvProjectService;
@Service("com.hhit.service.love")
public class LvProjectServiceImpl implements LvProjectService {
	@Autowired
	private LoveProjectDao loveProjectDao;

	
	
	

	public void update(LoveProjectModel loveProject) {
		// TODO Auto-generated method stub

	}



	public ResultSet queryProjectByStatement() {
		// TODO Auto-generated method stub
		return null;
	}



	public List<LoveProjectModel> queryByProjectStatement(
			String lvProjectStatement) {
		// TODO Auto-generated method stub
		return this.loveProjectDao.queryByProjectStatement(lvProjectStatement);
	}



	public void save(LoveProjectModel loveProject) {
		this.loveProjectDao.save(loveProject);		
	}

	

}
