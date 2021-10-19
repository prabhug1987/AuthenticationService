package com.auth.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.config.URLConfig;

@RestController
public class IndexController implements ErrorController {

	@RequestMapping(value = URLConfig.ERROR_CONTROLLER_PATH)
	public String error() {
		return "Your server works fine";
	}
}
