package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bean.Login;

public class LoginDao {
	
	private String jdbcURL = "jdbc:mysql://localhost:3306/ecom?useSSL=false";
	private String jdbcUsername = "root";
	private String jdbcPassword = "Congo2020";
	
	private static final String INSERT_LOGIN_SQL = "INSERT INTO ecom" + "  (userName, password, loginAs) VALUES "
			+ " (?, ?, ?);";
	
	private static final String SELECT_LOGIN_BY_ID = "select userName,password,loginAs from login where userId  =?";
	private static final String SELECT_LOGIN_USERS = "select * from login";
	private static final String DELETE_LOGINS_SQL = "delete from login where id = ?;";
	private static final String UPDATE_LOGINS_SQL = "update login set userName = ?,password= ?, loginAs =? where userId = ?;";
	
	public LoginDao(){}
	
	protected Connection getConnection() {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection  = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		}catch (SQLException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
	
	public void insertLogin(Login login) throws SQLException {
		System.out.println(INSERT_LOGIN_SQL);
		
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_LOGIN_SQL)){
			preparedStatement.setString(1, login.getUserName());
			preparedStatement.setString(1, login.getPassword());
			preparedStatement.setString(1, login.getLoginAs());
			
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		}catch (SQLException e) {
			printSQLException(e);
		}
	}
	
	
	//public Login selectLgin()
	
	
	
	
	
	
	
	
	
	
	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}
}
