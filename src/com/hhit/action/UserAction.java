package com.hhit.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hhit.base.BaseAction;
import com.hhit.entity.UserModel;
import com.hhit.service.IUserService;
import com.hhit.util.SecurityMD5;
import com.hhit.util.Validator;


@Controller
@ParentPackage("json-default")
@Namespace("/")
@ExceptionMappings( { @org.apache.struts2.convention.annotation.ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") })
public class UserAction extends BaseAction
{
	private static final long serialVersionUID = 1L;
	private SessionFactory sessionFactory;
	
   public class userRegisterAction{
	private UserModel userModel;
    private String tip;
    @Autowired
    private SecurityMD5 security;
    @Autowired
    private IUserService userService;
    @Autowired
    private Validator validator;
	public void setUserModel(UserModel userModel)
	{
		this.userModel = userModel;
	}
	
	public UserModel getUserModel()
	{
		return userModel;
	}
	
	public void setTip(String tip)
	{
		this.tip = tip;
	}
	
	public String getTip()
	{
		return tip;
	}
	 public String execute(){
		 if ((this.validator.isBlank(getUserModel().getEmail())) || (this.validator.isBlank(getUserModel().getName())) || (this.validator.isBlank(getUserModel().getPassword())))
		 {
		  return "input";
		 }
		 System.out.println( "zhuceshi:注册时得到的ip地址：" + getClientRealIp() );
		 
		 if (getUserModel().getEmail().indexOf("@") <= 0) {
	        return "input";
		     }
		 UserModel newUser = this.userService.checkUserEmail(getUserModel());
		       if (this.validator.isPersistence(newUser)) {
		       setTip("isExist");
		       return "input";
		       }
		  UserModel checkModel = this.userService.queryByName(getUserModel());
		       if (this.validator.isPersistence(checkModel)) {
		       setTip("isExited");
	           return "input";
		       }
		       
		 String now =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		 getUserModel().setName(StringEscapeUtils.escapeSql(getUserModel().getName()));
		 getUserModel().setEmail(StringEscapeUtils.escapeSql(getUserModel().getEmail()));
		 getUserModel().setCreateDate(now);
         getUserModel().setLastLoginDate(now);
         String password = getUserModel().getPassword();
         getUserModel().setPassword(this.security.md5(password));
		 return "input";
	 }	
  }
   //登录
   public class userLoginAction{
	   String name=ServletActionContext.getRequest().getParameter("username");
		String pwd=ServletActionContext.getRequest().getParameter("password");	    
	    public String execute(UserModel user){	  
		user.setName(name);
		user.setPassword(pwd);
		Session session = sessionFactory.openSession();
		String sql="select * From t_user WHERE c_name=user.getName() and c_password=user.getPassword()";
		SQLQuery query = session.createSQLQuery(sql).addEntity(UserModel.class);
		List queryuser = query.list();		
		session.close();
		if(queryuser.isEmpty()){
		return "input";
		}
		HttpSession session1 = ServletActionContext.getRequest().getSession();
		session1.setAttribute("username", user.getName());
		session1.setAttribute("userId", user.getUuid());
		
		return SUCCESS;
	    }
   }
}
