package com.aartek.controller;

import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.loginVO.LoginVO;
import com.aartek.service.LoginService;

/**
 * Servlet implementation class LoginController
 */
@Controller
public class LoginController {

	@RequestMapping("/login")
	public String showLogin(Map<String, Object> map) {
		map.put("AdminLogin", new LoginVO());

		return "login";

	}

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/userSignIn", method = RequestMethod.POST)
	public String signInAction(@ModelAttribute("AdminLogin") LoginVO login) {

		LoginVO vo = loginService.validate(login);
		System.out.println(vo.getEmail_id());
		if (vo != null) {
			System.out.println("valid user");
			return "welcome";
		} else {
			System.out.println("invalid user");
			return "login";
		}
	}
}
