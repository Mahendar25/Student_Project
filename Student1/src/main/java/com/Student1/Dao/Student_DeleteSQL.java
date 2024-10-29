package com.Student1.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Student_DeleteSQL {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "arise");
			
			PreparedStatement pstmt =con.prepareStatement("delete from student1 where id=?");
			pstmt.setInt(1, 11);
			
			int i=pstmt.executeUpdate();	
			System.out.println(i+" Record deleted successfully..");
			
			pstmt.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
