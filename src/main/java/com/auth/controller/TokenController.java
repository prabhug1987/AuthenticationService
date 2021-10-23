package com.auth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.auth.config.URLConfig;
import com.auth.controller.request.TokenRequest;
import com.auth.service.TokenService;
import com.google.common.net.MediaType;

@RestController
@RequestMapping(URLConfig.TOKEN_CONTROLLER_PATH)
public class TokenController {
	Logger logger = LoggerFactory.getLogger(TokenController.class);

	@Autowired
	private TokenService tokenServiceImpl;

	@RequestMapping(method = RequestMethod.GET, value = URLConfig.CREATE_TOKEN_PATH)
	@ResponseBody
	public String createToken(@RequestBody TokenRequest request) {
		logger.info("inside create token");
		tokenServiceImpl.createToken();
		return "hello Prabhu";
	}

	@RequestMapping(method = RequestMethod.POST, value = URLConfig.FIND_TOKEN_PATH)
	@ResponseBody
	public String findToken(@RequestBody TokenRequest request) {
		logger.info("inside find token");
		tokenServiceImpl.findToken();
		return "i";
	}

	@RequestMapping(method = RequestMethod.PUT, value = URLConfig.UPDATE_TOKEN_PATH)
	public String updateToken(@RequestBody TokenRequest request) {
		logger.info("inside find token");
		return "i";
	}

	@RequestMapping(method = RequestMethod.DELETE, value = URLConfig.DELETE_TOKEN_PATH)
	public String deleteToken(@RequestBody TokenRequest request) {
		logger.info("inside delete token");
		return "i";
	}
}
