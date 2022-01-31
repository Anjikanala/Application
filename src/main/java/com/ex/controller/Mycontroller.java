package com.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/abc")
public class Mycontroller {
	@RequestMapping(value = "/def")
	public String m1() {
		System.out.println("m1.........");
		return "app";
	}

}
