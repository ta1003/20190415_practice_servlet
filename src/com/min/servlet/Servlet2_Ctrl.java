package com.min.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.min.mybatis.SqlSessionFactoryManager;

public class Servlet2_Ctrl extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6948111620037999106L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Mybatis 테스트
		SqlSessionFactory factory =  SqlSessionFactoryManager.getSqlSessionFactory();
		SqlSession session = factory.openSession(true);
		session.close();
		// redirect 이동  -> Container에 위치
		// forword 이동 -> request, response 객체를 가지고 이동함(scope 객체 사용가능)
		//response.sendRedirect("./content.jsp"); // or "content.jsp"\
		//response.sendRedirect("/WEB-INF/view/content_inf.jsp"); 앤 못감
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/view/content_inf.jsp");
		String str = request.getParameter("value"); // 전달 받은 값
		System.out.println(str);
		request.setAttribute("name","monday"); // 전송 scope 객체
		dispatcher.forward(request, response);
	}

	@Override
	public void destroy() {
		System.out.println("서블렛 회수");
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		System.out.println("서블렛 생성");
		super.init();
	}
	
}
