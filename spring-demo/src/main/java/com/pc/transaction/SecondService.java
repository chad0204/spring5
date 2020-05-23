package com.pc.transaction;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *
 * @author pengchao
 * @date 17:47 2020-05-23
 */
public class SecondService extends JdbcDaoSupport {


	public void addUser(Demo demo) {
		String sql = "insert into t_transaction (name) values(?)";
		this.getJdbcTemplate().update(sql, demo.getName());

		System.out.println("SecondService addUser");
	}

}
