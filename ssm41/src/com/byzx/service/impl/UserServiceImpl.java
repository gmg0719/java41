package com.byzx.service.impl;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.byzx.dao.UserInfoDao;
import com.byzx.model.UserInfo;
import com.byzx.service.UserService;

/**@�ļ���: UserInfoServiceImpl.java
 * @�๦��˵��: 
 * @����: GuoMingGang
 * @Email: 1191619897@qq.com
 * @����: 2019��11��17������5:23:46
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����:GuoMingGang</li> 
 * 	 <li>����: 2019��11��17������5:23:46</li> 
 *	 <li>����: </li>
 * </pre>
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserInfoDao userInfoDao;
	
	@Override
	public UserInfo login(UserInfo userInfo) {
		
		return userInfoDao.login(userInfo);
	}

	@Override
	public List<UserInfo> findAllUser() {
		
		return userInfoDao.findAllUser();
	}

	@Override
	public int addUserInfo(UserInfo userInfo) {
		
		return userInfoDao.addUserInfo(userInfo);
	}

	
	@Override
	public UserInfo findAllBid(Integer user_id) {
		
		return userInfoDao.findAllBid(user_id);
	}

	@Override
	public int updateUserInfo(UserInfo userInfo) {
		
		return userInfoDao.updateUserInfo(userInfo);
	}

	@Override
	public int deleteUserInfo(Integer user_id) {
		
		return userInfoDao.deleteUserInfo(user_id);
	}

	@Override
	public List<UserInfo> selectUserInfo(Map<Object, Object> map) {
		
		return userInfoDao.selectUserInfo(map);
	}
}
