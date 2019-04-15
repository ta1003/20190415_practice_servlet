package com.min.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.min.dto.Jobs_DTO;
import com.min.mybatis.SqlSessionFactoryManager;

public class Jobs_DAO {
	
	public List<Jobs_DTO> selectAllJobs(){
		System.out.println("Jobs_DAO selectAllJobs");
		SqlSessionFactory factory = SqlSessionFactoryManager.getSqlSessionFactory();
		SqlSession session =   factory.openSession(true);
		return session.selectList("jobs.selectAllJobs");
	}
	
	public Jobs_DTO selectOneJob(String id) {
		System.out.println("Jobs_DAO selectOneJob");
		SqlSessionFactory factory = SqlSessionFactoryManager.getSqlSessionFactory();
		SqlSession session =   factory.openSession(true);
		return session.selectOne("jobs.selectOneJob", id);
	}
}
