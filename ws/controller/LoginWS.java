package com.aartek.ws.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.loginVO.LoginVO;

@Controller
public class LoginWS {
	
//@RequestMapping(value = "/login", method = RequestMethod.GET)
//public ModelAndView getLogin(@RequestParam(required = false) String id,ModelMap model){
//	String Id=id;
//	 System.out.println("ID is : "+Id);
//
//	LoginVO l=new LoginVO();
//	l.setEmail_id("abc");
//	l.setPassword("123");
//	System.out.println("l is "+l);
//		return new ModelAndView("login","object",l);	
//}

@RequestMapping(value = "/login", method = RequestMethod.POST)
public ResponseEntity <LoginVO> getStudentLogin(@RequestBody LoginVO l,
				HttpServletResponse response)
{
	String email=l.getEmail_id();
	String pass=l.getPassword();
	System.out.println("Email is : "+email);
	System.out.println("Pass is : "+pass);
return null;
}
}