package com.yuntong.repository.jdbc.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.yuntong.model.User;
import com.yuntong.repository.jdbc.FoundationJdbc;

/**
 * Created by mylover on 7/22/15.
 */
@SuppressWarnings("deprecation")
@Repository
public class FoundationJdbcImpl extends SqlMapClientDaoSupport implements FoundationJdbc {

	@SuppressWarnings("deprecation")
	@Autowired  
    public FoundationJdbcImpl(SqlMapClient sqlMapClient) {
        this.setSqlMapClient(sqlMapClient);
    }
	
	@Override
	public User getUserByUsername(String username) {
		List<User> userList = new ArrayList<User>();
		try {
			userList = this.getSqlMapClient().queryForList("Foundation.findUserByUsername", username);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (userList == null || userList.size() <= 0) {
			return null;
		} 
		return userList.get(0);
	}
	

//自动装配i的话那么客户端又是从哪里来装配的呢
//
//	@SuppressWarnings({ "deprecation", "unchecked" })
//	@Override
//	public User findUserByUsername(String username) {
//		User user = new User();
//		List<User> userList = new ArrayList<User>();
//			try {
//				userList = this.getSqlMapClient()
//						.queryForList("Foundation.findUserByUsername",username);
//				if (userList.size() > 0)
//					user = userList.get(0);
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//
//		return user;
//	}
//
//	@SuppressWarnings("deprecation")
//	@Override
//	public void addOneUser(User addOne) {
//		try {
//			this.getSqlMapClient().insert("Foundation.addOne", addOne);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@SuppressWarnings("deprecation")
//	@Override
//	public List<User> findAllUsers() {
//		List<User> userList = new ArrayList<User>();
//		try {
//			 userList = this.getSqlMapClient().queryForList("Foundation.findAllUsers");
//		} catch (Exception e) {
//		}
//		return userList;
//
//	}
//
//	@Override
//	public PageModel<User> findUsers(Map<String,Object> pageInfo){
//
//		int pageNum = (int)pageInfo.get("currentPage");
//		int pageLimit = (int)pageInfo.get("pageSize");
//
//		List<User> users = this.getSqlMapClientTemplate().queryForList("Foundation.findAllUser",pageNum);
//		Long total = (Long) this.getSqlMapClientTemplate().queryForObject("Foundation.findUserCount");
//		PageModel<User> pageInformation = new PageModel<User>();
//		pageInformation.setPageInfo(users);
//		pageInformation.setTotalElements(total);
//		pageInformation.setTotalPages((int)(total/pageLimit));
//		pageInformation.setNumber((pageNum+1));
//		pageInformation.setSize(pageLimit);
//		return pageInformation;
//	}

}
   