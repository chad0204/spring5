package com.pc.transaction.service;

import com.pc.transaction.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

/**
 *
 * @author pengchao
 * @date 17:46 2020-05-23
 */
@Component("firstService")
public class FirstService /*extends JdbcDaoSupport*/ {

	@Autowired
	private SecondService secondService;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setSecondService(SecondService secondService) {
		this.secondService = secondService;
	}

//	@Transactional(propagation = Propagation.NEVER)
	public void firstAdd(Demo demo) {

		demo.setName("a");
		String sql1 = "insert into t_transaction (name) values(?)";
		jdbcTemplate.update(sql1, demo.getName());

//		int a = 1/0;

		demo.setName("b");
		String sql2 = "insert into t_transaction (name) values(?)";
		jdbcTemplate.update(sql2, demo.getName());



		secondService.secondAdd(demo);

	}
}
