package com.hhit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hhit.entity.LoveProjectModel;
@Repository("com.hhit.dao.loveproject")
public class LoveProjectDao {
     	 
	   @Autowired
	   private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	
//	  public List<Object> queryByProjectStatement(String lvProjectStatement){
//	    	List<Object> list = list(newQueryBuilder().where("o.lvProjectStatement=? "),
//					new Object[]{lvProjectStatement},20);
//	    	return list;
//		}
	
	public List<LoveProjectModel> queryByProjectStatement(String lvProjectStatement){
		 
		 Session session = sessionFactory.openSession();
		 
		 String hql = "from LoveProjectModel loveProjectModel where loveProjectModel.lvProjectStatement  = '"+lvProjectStatement+"'";		
		 Query query = session.createQuery(hql);
		  
			List<LoveProjectModel> list = query.list();
			list.get(0).getLvProjectName();
			System.out.println(list);
			System.out.println(list.get(0).getLvProjectName());
			session.close();
			if (list.isEmpty()) {
				return null;
			} else {
				return  list;
			}
					
}



	protected Class<LoveProjectDao> getModelClass() {
		// TODO Auto-generated method stub
		return LoveProjectDao.class;
	}
    public void save(LoveProjectModel loveProject) {
      Session session = sessionFactory.openSession();
      session.save(loveProject);
	}
   

	
	
}
