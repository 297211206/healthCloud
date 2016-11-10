package com.hhit.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.struts2.json.annotations.JSON;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("entity.payments")
@Scope("prototype")
@Entity(name="entity.payment")
@Table(name="t_love_payment")
public class LovePaymentModel  {
	private static final long serialVersionUID = 1L;
	private UserModel user;
	private Integer moneyNum;
	private java.util.Date createDate;
	private LoveProjectModel lvProjectId;
	
	@JSON(serialize = false)
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="c_user_id")
	public UserModel getUser() {
		return user;
	}
	public void setUser(UserModel user) {
		this.user = user;
	}
	@JSON(serialize = false)
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="c_loveproject_id")
	public LoveProjectModel getLvProjectId() {
		return lvProjectId;
	}
	public void setLvProjectId(LoveProjectModel lvProjectId) {
		this.lvProjectId = lvProjectId;
	}
	@Column(name = "c_num")
	public Integer getMoneyNum() {
		return moneyNum;
	}
	public void setMoneyNum(Integer moneyNum) {
		this.moneyNum = moneyNum;
	}
	@Column(name = "c_create_date")
	public java.util.Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(java.util.Date createDate) {
		this.createDate = createDate;
	}
	
}
