package com.pc.transaction.service;

import com.pc.transaction.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author pengchao
 * @date 17:47 2020-05-23
 */
@Component("secondService")
public class SecondService /*extends JdbcDaoSupport*/ {


	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional
	public void addUser(Demo demo) {

		int a = 1/0;


		String sql = "insert into t_transaction (name) values(?)";
		jdbcTemplate.update(sql, demo.getName());

		System.out.println("SecondService addUser");
	}

}
