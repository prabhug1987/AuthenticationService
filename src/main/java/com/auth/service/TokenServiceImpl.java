package com.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.model.Token;
import com.auth.repository.TokenRepository;

@Service
public class TokenServiceImpl implements TokenService {
	@Autowired
	private TokenRepository tokenRepository;
	
	@Override
	public void findToken() {
		//tokenRepository.find
	}

	@Override
	public void createToken() {
		Token token = new Token();
		
		tokenRepository.save(token);
	}

	@Override
	public int updateToken() {

		return 0;
	}

	@Override
	public int deleteToken() {

		return 0;
	}

}
