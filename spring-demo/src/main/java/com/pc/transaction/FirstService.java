package com.pc.transaction;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *
 * @author pengchao
 * @date 17:46 2020-05-23
 */
public class FirstService extends JdbcDaoSupport {

	private SecondService secondService;

	public void setSecondService(SecondService secondService) {
		this.secondService = secondService;
	}

	public void addUser(Demo demo) {
		String sql = "insert into t_transaction (name) values(?)";
		this.getJdbcTemplate().update(sql, demo.getName());
		demo.setName("second-"+demo.getName());
		System.out.println("FirstService addUser");
		secondService.addUser(demo);

	}
}
