package com.byzx.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.byzx.model.UserInfo;
import com.byzx.service.UserService;

/**@�ļ���: StudentInfoController.java
 * @�๦��˵��: 
 * @����: GuoMingGang
 * @Email: 1191619897@qq.com
 * @����: 2019��11��17������4:40:03
 * @�޸�˵��:<br> 
 * <pre>
 * 	 <li>����:GuoMingGang</li> 
 * 	 <li>����: 2019��11��17������4:40:03</li> 
 *	 <li>����: </li>
 * </pre>
 */
@Controller
@RequestMapping("userInfo")
public class UserController {
	@Resource
	private UserService userService;
	@RequestMapping("/login")
	public String login(UserInfo userInfo,HttpServletRequest request){
		UserInfo resultUser=userService.login(userInfo);
		if(resultUser==null){
			request.setAttribute("userInfo", userInfo);
			request.setAttribute("errorMsg", "�û������������");
			return "forward:../index.jsp";

		}else{
			HttpSession session=request.getSession();
			session.setAttribute("currentUser", resultUser);
			return "success";
		}
			
	}
	@RequestMapping("/andList")
	public ModelAndView andList(){
		ModelAndView mav=new ModelAndView();
		List<UserInfo> resultUser=userService.findAllUser();
		mav.addObject("resultUser", resultUser);
		mav.setViewName("show");
		return mav;
		
	}
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request){
		HttpSession session=request.getSession();
		session.removeAttribute("currentUser");
		return "redirect:../userInfo/login.do";	
	}
	
	@RequestMapping("/addUserInfo")
	public ModelAndView addUserInfo(){
		ModelAndView mav=new ModelAndView();
		mav.addObject("agreed", "����û���Ϣ");
		mav.setViewName("saveUserInfo");
		return mav;
		
	}
	
	@RequestMapping("/updateUserInfo")
	public ModelAndView updateUserInfo(String user_id){
		ModelAndView mav=new ModelAndView();
		UserInfo userInfo=userService.findAllBid(Integer.parseInt(user_id));
		mav.addObject("agreed", "�޸��û���Ϣ");
		mav.addObject("userInfo", userInfo);
		mav.setViewName("saveUserInfo");
		return mav;
		
	}
	@RequestMapping("/saveUserInfo")
	public String saveUserInfo(UserInfo userInfo){
		int result=0;
		if(userInfo.getUser_id()==null){
			result=userService.addUserInfo(userInfo);
		}else{
			
			result=userService.updateUserInfo(userInfo);
		}
		if(result>0){
			return "redirect:../userInfo/andList.do";
		}else{
			return "redirect:../userInfo/andList.jsp";
		}		
	}
	
	@RequestMapping("/deleteUserInfo")
	public String deleteUserInfo(String user_id){
		userService.deleteUserInfo(Integer.parseInt(user_id));
		return "redirect:../userInfo/andList.do";
		
	}
	
	@RequestMapping("selectUserInfo")
	public ModelAndView selectUserInfo(String user_name){
		ModelAndView mav=new ModelAndView();
		Map<Object,Object> map=new HashMap<Object, Object>();
		map.put("user_name", user_name);
		mav.addObject("user_name", map);
		mav.setViewName("show");
		return mav;
		
	}
	
}
