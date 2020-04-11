 /*package controller;
 
 import java.io.IOException;

 import javax.servlet.RequestDispatcher;
 import javax.servlet.ServletException;
 import javax.servlet.annotation.WebServlet;
 import javax.servlet.http.HttpServlet;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;

import businesslogic.ValidateUser;
 import dao.UserDAO;
 import model.User;
 
 	protected void doPost(HttpServletRequest request, HttpServletResponse response)
 		
 	    user.setPassword(password);
 		UserDAO userdao = new UserDAO();
 		
		boolean validateUser = false;
		try {
		    validateUser = userdao.loginUser(user);
		} catch (ClassNotFoundException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		} catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
 	
		if(validateUser) {
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/blogView.jsp");
			rd.forward(request, response);
		}
*/