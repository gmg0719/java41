package com.byzx.service;

import java.util.List;
import java.util.Map;

import com.byzx.model.UserInfo;

/**@文件名: StudentInfoService.java
 * @类功能说明: 实现登录接口
 * @作者: GuoMingGang
 * @Email: 1191619897@qq.com
 * @日期: 2019年11月17日下午4:38:46
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者:GuoMingGang</li> 
 * 	 <li>日期: 2019年11月17日下午4:38:46</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface UserService {

	public UserInfo login(UserInfo userInfo);
	
	public List<UserInfo> findAllUser();

	public int addUserInfo(UserInfo userInfo);

	public int updateUserInfo(UserInfo userInfo);
	
	public UserInfo findAllBid(Integer user_id);
	
	public int deleteUserInfo(Integer user_id);
	
	public List<UserInfo> selectUserInfo(Map<Object,Object> map);
	
}
