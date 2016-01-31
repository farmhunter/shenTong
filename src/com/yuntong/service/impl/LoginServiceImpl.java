package com.yuntong.service.impl;

import com.yuntong.model.User;
import com.yuntong.repository.jdbc.FoundationJdbc;
import com.yuntong.service.LoginService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mylover on 7/22/15.
 */
@Service
public class LoginServiceImpl implements LoginService {

    private static Logger logger = LogManager.getLogger(LoginServiceImpl.class.getName());

    @Autowired
    private  FoundationJdbc foundationJdbc;
    
//    @Autowired
//    private UserRepository userRepository;



	@Override
	public boolean checkUser(User user) {
		logger.info("@Service");
		
//		User checkUser = userRepository.findByUsername(user.getUsername());
		User checkUser2 = foundationJdbc.getUserByUsername(user.getUsername());
		
		if (checkUser2.getPassword().equals(user.getPassword())) {
			return true;
		}
		
		
		return false;
	}
}
