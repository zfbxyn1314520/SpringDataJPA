package com.yanan.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yanan.core.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/getuser")
	@ResponseBody
	public String getUser(Integer id,String name) {
		return this.userService.getUser(id, name).toString();
	}
	
	@RequestMapping("/getuser2")
	@ResponseBody
	public Map<String, Object> getUser2(Integer id,String name){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("state", "success");
		map.put("data", this.userService.getUser(id, name));
		return map;
	}
	
	
}
