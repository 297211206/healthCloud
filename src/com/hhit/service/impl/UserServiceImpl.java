package com.hhit.service.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import com.hhit.dao.IUserDao;
import com.hhit.entity.PageBean;
import com.hhit.entity.UserModel;
import com.hhit.service.IUserService;
@Service("com.hhit.service.userService")
public class UserServiceImpl implements IUserService
{
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
	private IUserDao userDao;
	
	public IUserDao getUserDao()
	{
		return userDao;
	}

	public void setUserDao(IUserDao userDao)
	{
		this.userDao = userDao;
	}
	@Override
	public void addUser(UserModel user)
	{
		 this.userDao.addUser(user);
		
	}

	@Override
	public void deleteUserById(int id)
	{
		this.userDao.deleteUserById(id);
		
	}

	@Override
	public void editUser(UserModel user)
	{
		this.userDao.updateUser(user);
	}

	@Override
	public UserModel getUserById(int id)
	{
		return this.userDao.getUserById(id);
	}

	@Override
	public UserModel checkUserEmail(UserModel user)
	{
		Session session = sessionFactory.openSession();
		String sql="select * From t_user WHERE c_email=user.getEmail()";
		SQLQuery query = session.createSQLQuery(sql).addEntity(UserModel.class);
		List queryuser = query.list();		
		session.close();
		if(queryuser.isEmpty()){
			return null;
		}
		return user;		
	}

	@Override
	public UserModel queryByName(UserModel user)
	{

		Session session = sessionFactory.openSession();
		String sql="select * From t_user WHERE c_name=user.getName()";
		SQLQuery query = session.createSQLQuery(sql).addEntity(UserModel.class);
		List queryuser = query.list();		
		session.close();
		if(queryuser.isEmpty()){
			return null;
		}
		return user;
	}

	
	

//	@Override
//	public PageBean getUserList(int page)
//	{
//		
//	}


}
