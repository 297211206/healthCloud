package com.hhit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("entity.project")
@Entity(name="entity.LoveProject")
@Table(name="t_love_project")
public class LoveProjectModel {
	
	private static final long serialVersionUID = 1L;
	private long lvProjectId;
	private String lvProjectName;
	private Long lvProjectNeedTotalNum;
	private String lvReceiver;
	private String lvProjectStatement;
	private java.util.Date createDate;
		
	@Column(name = "c_lvProjectId")
	public long getLvProjectId() {
		return lvProjectId;
	}
	public void setLvProjectId(long lvProjectId) {
		this.lvProjectId = lvProjectId;
	}
	
	@Column(name = "c_create_date")
	public java.util.Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(java.util.Date createDate) {
		this.createDate = createDate;
	}
	
	@Column(name ="c_loveproject_name")
	public String getLvProjectName() {
		return lvProjectName;
	}
	public void setLvProjectName(String lvProjectName) {
		this.lvProjectName = lvProjectName;
	}
		
	@Column(name ="c_need_totalnum")
	public Long getLvProjectNeedTotalNum() {
		return lvProjectNeedTotalNum;
	}
	public void setLvProjectNeedTotalNum(Long lvProjectNeedTotalNum) {
		this.lvProjectNeedTotalNum = lvProjectNeedTotalNum;
	}
		
	@Column(name ="c_love_receiver")
	public String getLvReceiver() {
		return lvReceiver;
	}
	public void setLvReceiver(String lvReceiver) {
		this.lvReceiver = lvReceiver;
	}
		
	@Column(name ="c_loveproject_statement")
	public String getLvProjectStatement() {
		return lvProjectStatement;
	}
	public void setLvProjectStatement(String lvProjectStatement) {
		this.lvProjectStatement = lvProjectStatement;
	}
}
