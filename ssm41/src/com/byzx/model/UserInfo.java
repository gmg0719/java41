package com.byzx.model;

import org.springframework.stereotype.Component;

/**@�ļ���: StudentInfo.java
 * @�๦��˵��: 
 * @����: GuoMingGang
 * @Email: 1191619897@qq.com
 * @����: 2019��11��17������4:36:21
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����:GuoMingGang</li> 
 * 	 <li>����: 2019��11��17������4:36:21</li> 
 *	 <li>����: </li>
 * </pre>
 */
@Component
public class UserInfo {
	
	private Integer user_id;	//����
	private String user_name;	//�˺�	
	private String user_password; 	//����
	private int state;	//Ȩ��
	
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
