/*package dao;
 
import java.io.IOException;
 import java.sql.Connection;
 import java.sql.PreparedStatement;
 import java.sql.ResultSet;

import model.User;
 
 public class UserDAO implements UserDaoInterface {
 
	public int signUp(User user) throws ClassNotFoundException, IOException {
		String INSERT_USERS_SQL = "INSERT INTO USERDETAILS(email, password)VALUES(?,?)";
 
 		int result = 0;
 		try
 		public int signUp(User user) {
 		return result;
 	}
 	
	public boolean loginUser(User user) throws ClassNotFoundException, IOException {
 		boolean status = false;
 		try{
 			Connection connection = ConnectionManager.getConnection();
	
		PreparedStatement preparedStatement = connection.prepareStatement("select * from userdetails where email = ? and  password = ?");
 		
 			preparedStatement.setString(1, user.getEmail());
 			preparedStatement.setString(2, user.getPassword());
 			public boolean loginUser(User user) {
 
 		} catch (SQLException e) {
 			
 		}
			System.out.println("THIS IS ERROR IN UD"+e);
 		}
		@Override
		public int signUp(User user) {
			// TODO Auto-generated method stub
			return 0;
		}
		@Override
		public boolean loginUser(User user) {
			// TODO Auto-generated method stub
			return false;
		}
 		return status;
 	}*/