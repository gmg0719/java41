package com.byzx.service;

import java.util.List;
import java.util.Map;

import com.byzx.model.UserInfo;

/**@�ļ���: StudentInfoService.java
 * @�๦��˵��: ʵ�ֵ�¼�ӿ�
 * @����: GuoMingGang
 * @Email: 1191619897@qq.com
 * @����: 2019��11��17������4:38:46
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����:GuoMingGang</li> 
 * 	 <li>����: 2019��11��17������4:38:46</li> 
 *	 <li>����: </li>
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
