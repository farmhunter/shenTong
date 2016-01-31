package com.yuntong.repository.jdbc;

import org.springframework.stereotype.Repository;

import com.yuntong.model.User;

/**
 * Created by mylover on 7/22/15.
 */
@Repository
public interface FoundationJdbc {

	User getUserByUsername(String username);

}
