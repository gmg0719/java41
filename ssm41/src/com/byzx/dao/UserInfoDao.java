package com.byzx.dao;

import java.util.List;
import java.util.Map;

import com.byzx.model.UserInfo;

/**@文件名: StudentInfoDao.java
 * @类功能说明: 操作数据库
 * @作者: GuoMingGang
 * @Email: 1191619897@qq.com
 * @日期: 2019年11月17日下午4:37:49
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者:GuoMingGang</li> 
 * 	 <li>日期: 2019年11月17日下午4:37:49</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public interface UserInfoDao {

	public UserInfo login(UserInfo userInfo);
	
	public List<UserInfo> findAllUser();

	public int updateUserInfo(UserInfo userInfo);

	public int addUserInfo(UserInfo userInfo);

	public UserInfo findAllBid(Integer user_id);

	public int deleteUserInfo(Integer user_id);

	public List<UserInfo> selectUserInfo(Map<Object, Object> map);

}
