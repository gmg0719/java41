package com.byzx.dao;

import java.util.List;
import java.util.Map;

import com.byzx.model.UserInfo;

/**@�ļ���: StudentInfoDao.java
 * @�๦��˵��: �������ݿ�
 * @����: GuoMingGang
 * @Email: 1191619897@qq.com
 * @����: 2019��11��17������4:37:49
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����:GuoMingGang</li> 
 * 	 <li>����: 2019��11��17������4:37:49</li> 
 *	 <li>����: </li>
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
