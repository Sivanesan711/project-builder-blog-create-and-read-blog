/*package controller;

 import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
 import java.time.LocalDate;

 import javax.servlet.RequestDispatcher;
 import javax.servlet.ServletException;
 import javax.servlet.annotation.WebServlet;
 import javax.servlet.http.HttpServlet;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;

 import dao.UserDAO;
 import model.User;
 import utility.ConnectionManager;
 
 @WebServlet(urlPatterns= {"/signup"})
 public class SignUpController extends HttpServlet {
 	private static final long serialVersionUID = 1L;
       
 
     public SignUpController() {
         super();
        
     }
 
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Sign up Controller");
//		Connection con=null;
//		con=ConnectionManager.getConnection();
//		if(con!=null) {
//			System.out.println("Database connection established");
//		}
//		else
//		{
//			System.out.println("Check your connection");
//		}
		System.out.println("Sign up Controller");
		Connection con=null;
		try {
		    con=ConnectionManager.getConnection();
		} catch (ClassNotFoundException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		} catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		} catch (SQLException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(con!=null) {
			System.out.println("Database connection established");
		}
		else
		{
			System.out.println("Check your connection");
		}
 		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/signupView.jsp");
 		rd.forward(request,response);
 	}
 }*/
 
