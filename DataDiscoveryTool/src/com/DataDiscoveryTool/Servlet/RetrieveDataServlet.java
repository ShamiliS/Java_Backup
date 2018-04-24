package com.DataDiscoveryTool.Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DataDiscoveryTool.beans.UserBean;

public class RetrieveDataServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ArrayList<String> user = new ArrayList<String>();

			user = UserDAO.login(request);

			if (user != null) {
				request.setAttribute("TableNames", user);
				UserBean.setTable(user);
				getServletConfig().getServletContext().getRequestDispatcher("/Frames.jsp").forward(request, response);

			} else
				response.sendRedirect("invalidLogin.jsp"); // error page
		} catch (Throwable theException) {
			System.out.println(theException);
		}
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

	}

}
