package com.byzx.model;

import org.springframework.stereotype.Component;

/**@文件名: StudentInfo.java
 * @类功能说明: 
 * @作者: GuoMingGang
 * @Email: 1191619897@qq.com
 * @日期: 2019年11月17日下午4:36:21
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者:GuoMingGang</li> 
 * 	 <li>日期: 2019年11月17日下午4:36:21</li> 
 *	 <li>内容: </li>
 * </pre>
 */
@Component
public class UserInfo {
	
	private Integer user_id;	//序列
	private String user_name;	//账号	
	private String user_password; 	//密码
	private int state;	//权限
	
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
}
