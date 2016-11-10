package com.hhit.base;

import java.lang.reflect.ParameterizedType;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.hhit.service.ITestService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 基础Action类
 * @author bob
 *
 * @param <T>
 */
@SuppressWarnings("serial")
public abstract class BaseAction<T> extends ActionSupport implements
		ModelDriven<T> {

	// =============== ModelDriven的支持 ==================
	protected T model;

	
	/*public BaseAction() {
		try {
			// 通过反射获取model的真实类型
			ParameterizedType pt = (ParameterizedType) this.getClass()
					.getGenericSuperclass();
			Class<T> clazz = (Class<T>) pt.getActualTypeArguments()[0];
			// 通过反射创建model的实例
			model = clazz.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
*/
	public T getModel() {
		return model;
	}

	// =============== Service实例的声明 ==================
	@Resource
	protected ITestService testService;// 测试
	
	
	
	 private HttpServletRequest getRequest()
		{
			 return ServletActionContext.getRequest();
		}
	 public String getClientRealIp() {
		HttpServletRequest req = getRequest();
		/* 131 */     String ip = req.getHeader("X-Forwarded-For");
		/*     */ 
		/* 133 */     if (ip != null) {
		/* 134 */       if (ip.indexOf(',') == -1) {
		/* 135 */         return ip;
		/*     */       }
		/* 137 */       return ip.split(",")[0];
		/*     */     }
		/*     */ 
		/* 140 */     if ((ip == null) || (ip.length() == 0) || ("unknown".equalsIgnoreCase(ip))) {
		/* 141 */       ip = req.getHeader("Proxy-Client-IP");
		/*     */     }
		/* 143 */     if ((ip == null) || (ip.length() == 0) || ("unknown".equalsIgnoreCase(ip))) {
		/* 144 */       ip = req.getHeader("WL-Proxy-Client-IP");
		/*     */     }
		/* 146 */     if ((ip == null) || (ip.length() == 0) || ("unknown".equalsIgnoreCase(ip))) {
		/* 147 */       ip = req.getRemoteAddr();
		/*     */     }
		/*     */ 
		/* 150 */     return ip;
		   }
	  
	
	

	/**
	 * 获取当前登录的用户
	 */
//	protected User getCurrentUser() {
//		return (User) ActionContext.getContext().getSession().get("user");
//	}
	
	// ============== 分页用的参数 =============
	
	protected int pageNum=1;
	protected int pageSize=10;

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}
