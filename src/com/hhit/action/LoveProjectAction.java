package com.hhit.action;

import java.sql.ResultSet;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hhit.entity.LoveProjectModel;
import com.hhit.service.LvProjectService;

@Controller
@ParentPackage("json-default")
@Namespace("/")
@ExceptionMappings( { @org.apache.struts2.convention.annotation.ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") })
public class LoveProjectAction  {
	private static final long serialVersionUID = 1L;
	@Autowired
    private LvProjectService lvProjectService;   
	//private String isShow;//是否显示加载更多
	private LoveProjectModel loveProjectModelList;
	private LoveProjectModel loveProjectModel;	
	private String lvProjectStatement;
	/**
	 * @param list the loveProjectModelList to set
	 */
	public void setLoveProjectModelList(LoveProjectModel list) {
		this.loveProjectModelList = list;
	}

	public LoveProjectModel getLoveProjectModelList() {
		return loveProjectModelList;
	}

	/**
	 * @param loveProjectModel the loveProjectModel to set
	 */
	public void setLoveProjectModel(LoveProjectModel loveProjectModel) {
		this.loveProjectModel = loveProjectModel;
	}
	
	public LoveProjectModel getLoveProjectModel() {
		return loveProjectModel;
	}

	public void setLvProjectStatement(String lvProjectStatement) {
		this.lvProjectStatement = lvProjectStatement;
	}

	public String getLvProjectStatement() {
		return lvProjectStatement;
	}
	



	
	@Action(value = "/ingLoveProjects", results = { @org.apache.struts2.convention.annotation.Result(name = "success", type = "freemarker", location = "/WEB-INF/bootstrap/love_assistance.ftl") })
	public String ingLoveProjects(){
		//ResultSet result = lvProjectService.queryProjectByStatement();
		String lvProjectStatement = getLvProjectStatement();		
		System.out.println(lvProjectStatement);
		
		if(lvProjectStatement== null || "".equals(lvProjectStatement)){
			 lvProjectStatement="ing";
			 setLvProjectStatement(lvProjectStatement);
			 System.out.println(lvProjectStatement);
		}
		
			//查询loveproject
				List<LoveProjectModel> list =this.lvProjectService.queryByProjectStatement(lvProjectStatement);
				
			
				return "success";
		
	}

	
	
	
}
