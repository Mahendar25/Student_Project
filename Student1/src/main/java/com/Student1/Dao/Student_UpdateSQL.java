package com.Student1.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Student_UpdateSQL {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","arise");
			PreparedStatement pstmt=con.prepareStatement("update student1 set name=?,branch=?,address=?,mobile=? where id=?");
			pstmt.setString(1, "Minto");
			pstmt.setString(2, "MCA");
			pstmt.setString(3, "HYD");
			pstmt.setLong(4, 9825463259l);
			pstmt.setInt(5, 10);
			int n=pstmt.executeUpdate();
			System.out.println(n+" Record updated successfully..");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
