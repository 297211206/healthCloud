package com.hhit.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.hhit.dao.IUserDao;
import com.hhit.entity.UserModel;
@Repository("com.hhit.dao.userDao")
public class UserDaoImpl implements IUserDao
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
	
	@Override
	public void addUser(UserModel user)
	{
		Session session = sessionFactory.openSession();
		session.save(user);
		session.flush();
		session.close();
	}

	@Override
	public void deleteUserById(int id)
	{
		Session session = sessionFactory.openSession();
		String sql = "DELETE *FROM t_user where c_uid='" + id + "'";
		SQLQuery query = session.createSQLQuery(sql); 
		//Query query = session.createQuery(hql);
		query.addEntity(UserModel.class);
		query.executeUpdate();
		session.close();
	}

	@Override
	public UserModel getUserById(int id)
	{
		Session session = sessionFactory.openSession();
	   String hql = "from UserModel user where user.id='" + id + "'";
	   Query query = session.createQuery(hql);
	   List list = query.list();
	   session.close();
	   if (list.isEmpty()) {
		return null;
	   } else {
		return (UserModel) list.get(0);
	   }
	}

	
	@Override
	public void updateUser(UserModel user)
	{
		Session session = sessionFactory.openSession();
		session.update(user);
		session.flush();
		session.close();

	}

	

}
