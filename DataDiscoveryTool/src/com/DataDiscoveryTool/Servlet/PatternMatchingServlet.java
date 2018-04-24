package com.DataDiscoveryTool.Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DataDiscoveryTool.beans.PatternBean;
import com.DataDiscoveryTool.beans.UserBean;

public class PatternMatchingServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PatternBean pbean = new PatternBean();
			UserBean ubean = new UserBean();
			String sqlQuery = "select Column_Name from all_tab_columns where owner='" + ubean.getUserName() + "'";

			String page = "";
			try {

			} catch (Exception e) {
				page = "invalidLogin.jsp";
			} finally {
				page = "/Result.jsp";
			}

			String P_ID = request.getParameter("id");
			pbean.setId(P_ID);
			String P_Name = request.getParameter("name");
			pbean.setName(P_Name);
			String P_Address = request.getParameter("address");
			pbean.setAddress(P_Address);
			String P_Telephone = request.getParameter("telephone");
			pbean.setTelephone(P_Telephone);
			String P_EMail = request.getParameter("email");
			pbean.setEmail(P_EMail);

			ArrayList<String> information = PatternDAO.patternInfo(sqlQuery);

			// if (user != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher(page);
			request.setAttribute("TableNames", information);
			UserBean.setColumnName(information);
			dispatcher.forward(request, response);

		} catch (Throwable theException) {
			System.out.println(theException);
		}
	}

}
