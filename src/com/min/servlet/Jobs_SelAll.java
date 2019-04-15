package com.min.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.min.dto.Jobs_DTO;
import com.min.model.Jobs_DAO;

public class Jobs_SelAll extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4315479840553368602L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost 시작됨");
		Jobs_DAO dao = new Jobs_DAO();
		List<Jobs_DTO> lists = dao.selectAllJobs();
		req.setAttribute("lists", lists);
		forword(req, resp, "/WEB-INF/view/JobList.jsp");
		
	}
	
	private void forword(HttpServletRequest req , HttpServletResponse resp , String url) {
		System.out.println("이동할 페이지:"+url);
		RequestDispatcher dis = req.getRequestDispatcher(url);
		
		try {
			dis.forward(req, resp);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
