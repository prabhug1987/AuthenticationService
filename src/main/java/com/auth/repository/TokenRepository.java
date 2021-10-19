package com.auth.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auth.model.Token;

@Repository
public interface TokenRepository extends JpaRepository<Token, Long> {
	
	

}
