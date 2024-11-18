package com.spring.ex01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("mainController") // 이 클래스가 Spring의 컨트롤러라는 것을 나타냄
@RequestMapping("/test") // 이 컨트롤러의 기본 URL 패턴을 /test로 설정
public class MainController {
	@RequestMapping(value = "/main1.do", method = RequestMethod.GET)
	public ModelAndView main1(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "main1");
		mav.setViewName("main");
		return mav;
	}

	@RequestMapping(value = "/main2.do", method = RequestMethod.GET)
	public ModelAndView main2(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "main2");
		mav.setViewName("main");
		return mav;
	}
}