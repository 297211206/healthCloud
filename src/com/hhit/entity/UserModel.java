package com.hhit.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;




@Component  
@Entity 
@Table(name="t_user")
public class UserModel {
	private static final long serialVersionUID = 1L;
	private String name;
	private long uuid;
	private String accessToken;
	private String openId;
	private Integer resource;
	private String password;
	private String realName;
	private String email;
	private String picName;
//	private Integer sex;
//	private String birthday;
	private String createDate;
	private String lastLoginDate;
//	private String phone;
//	private String qq;
//	private String address;
//	private String expireTime;
//	private String zhifubao;
//	private UserModel recommendUsername;
//	private Integer isAuthen;
//	private String cardNo;
//	private Date phoneCodeDate;
//	private String ip;
//	private Integer errorNum;
//	private List<Object> balanceList;
//	private String userUrl;
//	private String userUrlBig;
//	private String livenow;
//	private String homwtown;
//	private String income;
//	private String signature;
//	private String phones;
//	private String synchstate;
//	private String weiXinOpenId;
//	private String formName;
//	private int version;
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	@Column(name ="c_name")
	public String getName() {
		return name;
	}
	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(long uuid) {
		this.uuid = uuid;
	}
	@Column(name ="c_uid")
	public long getUuid() {
		return uuid;
	}
	/**
	 * @param accessToken the accessToken to set
	 */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	@Column(name ="c_access_token")
	public String getAccessToken() {
		return accessToken;
	}
	/**
	 * @param openId the openId to set
	 */
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	@Column(name ="c_openid")
	public String getOpenId() {
		return openId;
	}
	/**
	 * @param resource the resource to set
	 */
	public void setResource(Integer resource) {
		this.resource = resource;
	}
	@Column(name ="c_resource")
	public Integer getResource() {
		return resource;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name ="c_password")
	public String getPassword() {
		return password;
	}
	/**
	 * @param realName the realName to set
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}
	@Column(name ="c_realName")
	public String getRealName() {
		return realName;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name ="c_email")
	public String getEmail() {
		return email;
	}
	/**
	 * @param picName the picName to set
	 */
	public void setPicName(String picName) {
		this.picName = picName;
	}
	@Column(name ="c_picName")
	public String getPicName() {
		return picName;
	}
	/**
	 * @param sex the sex to set
	 */
//	public void setSex(Integer sex) {
//		this.sex = sex;
//	}
//	/**
//	 * @return the sex
//	 */
//	public Integer getSex() {
//		return sex;
//	}
//	/**
//	 * @param birthday the birthday to set
//	 */
//	public void setBirthday(String birthday) {
//		this.birthday = birthday;
//	}
//	/**
//	 * @return the birthday
//	 */
//	public String getBirthday() {
//		return birthday;
//	}
 
 	public void setCreateDate(String createDate) {
 		this.createDate = createDate;
 	}

 	public String getCreateDate() {
 		return createDate;
 	}
 
 	public void setLastLoginDate(String lastLoginDate) {
 		this.lastLoginDate = lastLoginDate;
 	}
 
 	public String getLastLoginDate() {
 		return lastLoginDate;
 	}
//	/**
//	 * @param phone the phone to set
//	 */
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//	/**
//	 * @return the phone
//	 */
//	public String getPhone() {
//		return phone;
//	}
//	/**
//	 * @param qq the qq to set
//	 */
//	public void setQq(String qq) {
//		this.qq = qq;
//	}
//	/**
//	 * @return the qq
//	 */
//	public String getQq() {
//		return qq;
//	}
//	/**
//	 * @param address the address to set
//	 */
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	/**
//	 * @return the address
//	 */
//	public String getAddress() {
//		return address;
//	}
//	/**
//	 * @param expireTime the expireTime to set
//	 */
//	public void setExpireTime(String expireTime) {
//		this.expireTime = expireTime;
//	}
//	/**
//	 * @return the expireTime
//	 */
//	public String getExpireTime() {
//		return expireTime;
//	}
//	/**
//	 * @param zhifubao the zhifubao to set
//	 */
//	public void setZhifubao(String zhifubao) {
//		this.zhifubao = zhifubao;
//	}
//	/**
//	 * @return the zhifubao
//	 */
//	public String getZhifubao() {
//		return zhifubao;
//	}
//	/**
//	 * @param recommendUsername the recommendUsername to set
//	 */
//	public void setRecommendUsername(UserModel recommendUsername) {
//		this.recommendUsername = recommendUsername;
//	}
//	/**
//	 * @return the recommendUsername
//	 */
//	public UserModel getRecommendUsername() {
//		return recommendUsername;
//	}
//	/**
//	 * @param isAuthen the isAuthen to set
//	 */
//	public void setIsAuthen(Integer isAuthen) {
//		this.isAuthen = isAuthen;
//	}
//	/**
//	 * @return the isAuthen
//	 */
//	public Integer getIsAuthen() {
//		return isAuthen;
//	}
//	/**
//	 * @param cardNo the cardNo to set
//	 */
//	public void setCardNo(String cardNo) {
//		this.cardNo = cardNo;
//	}
//	/**
//	 * @return the cardNo
//	 */
//	public String getCardNo() {
//		return cardNo;
//	}
//	/**
//	 * @param phoneCodeDate the phoneCodeDate to set
//	 */
//	public void setPhoneCodeDate(Date phoneCodeDate) {
//		this.phoneCodeDate = phoneCodeDate;
//	}
//	/**
//	 * @return the phoneCodeDate
//	 */
//	public Date getPhoneCodeDate() {
//		return phoneCodeDate;
//	}
//	/**
//	 * @param ip the ip to set
//	 */
//	public void setIp(String ip) {
//		this.ip = ip;
//	}
//	/**
//	 * @return the ip
//	 */
//	public String getIp() {
//		return ip;
//	}
//	/**
//	 * @param errorNum the errorNum to set
//	 */
//	public void setErrorNum(Integer errorNum) {
//		this.errorNum = errorNum;
//	}
//	/**
//	 * @return the errorNum
//	 */
//	public Integer getErrorNum() {
//		return errorNum;
//	}
//	/**
//	 * @param balanceList the balanceList to set
//	 */
//	public void setBalanceList(List<Object> balanceList) {
//		this.balanceList = balanceList;
//	}
//	/**
//	 * @return the balanceList
//	 */
//	public List<Object> getBalanceList() {
//		return balanceList;
//	}
//	/**
//	 * @param userUrl the userUrl to set
//	 */
//	public void setUserUrl(String userUrl) {
//		this.userUrl = userUrl;
//	}
//	/**
//	 * @return the userUrl
//	 */
//	public String getUserUrl() {
//		return userUrl;
//	}
//	/**
//	 * @param userUrlBig the userUrlBig to set
//	 */
//	public void setUserUrlBig(String userUrlBig) {
//		this.userUrlBig = userUrlBig;
//	}
//	/**
//	 * @return the userUrlBig
//	 */
//	public String getUserUrlBig() {
//		return userUrlBig;
//	}
//	/**
//	 * @param livenow the livenow to set
//	 */
//	public void setLivenow(String livenow) {
//		this.livenow = livenow;
//	}
//	/**
//	 * @return the livenow
//	 */
//	public String getLivenow() {
//		return livenow;
//	}
//	/**
//	 * @param homwtown the homwtown to set
//	 */
//	public void setHomwtown(String homwtown) {
//		this.homwtown = homwtown;
//	}
//	/**
//	 * @return the homwtown
//	 */
//	public String getHomwtown() {
//		return homwtown;
//	}
//	/**
//	 * @param income the income to set
//	 */
//	public void setIncome(String income) {
//		this.income = income;
//	}
//	/**
//	 * @return the income
//	 */
//	public String getIncome() {
//		return income;
//	}
//	/**
//	 * @param signature the signature to set
//	 */
//	public void setSignature(String signature) {
//		this.signature = signature;
//	}
//	/**
//	 * @return the signature
//	 */
//	public String getSignature() {
//		return signature;
//	}
//	/**
//	 * @param phones the phones to set
//	 */
//	public void setPhones(String phones) {
//		this.phones = phones;
//	}
//	/**
//	 * @return the phones
//	 */
//	public String getPhones() {
//		return phones;
//	}
//	/**
//	 * @param synchstate the synchstate to set
//	 */
//	public void setSynchstate(String synchstate) {
//		this.synchstate = synchstate;
//	}
//	/**
//	 * @return the synchstate
//	 */
//	public String getSynchstate() {
//		return synchstate;
//	}
//	/**
//	 * @param weiXinOpenId the weiXinOpenId to set
//	 */
//	public void setWeiXinOpenId(String weiXinOpenId) {
//		this.weiXinOpenId = weiXinOpenId;
//	}
//	/**
//	 * @return the weiXinOpenId
//	 */
//	public String getWeiXinOpenId() {
//		return weiXinOpenId;
//	}
//	/**
//	 * @param formName the formName to set
//	 */
//	public void setFormName(String formName) {
//		this.formName = formName;
//	}
//	/**
//	 * @return the formName
//	 */
//	public String getFormName() {
//		return formName;
//	}
//	/**
//	 * @param version the version to set
//	 */
//	public void setVersion(int version) {
//		this.version = version;
//	}
//	/**
//	 * @return the version
//	 */
//	public int getVersion() {
//		return version;
//	}

}
