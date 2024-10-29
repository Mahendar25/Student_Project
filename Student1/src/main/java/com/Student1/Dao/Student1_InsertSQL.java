package com.Student1.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Student1_InsertSQL {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "arise");
			PreparedStatement pstmt =con.prepareStatement("insert into student1 values(?,?,?,?,?)");
			pstmt.setString(1, "Itachi");
			pstmt.setInt(2, 11);
			pstmt.setString(3, "BCA");
			pstmt.setString(4, "Wrl");
			pstmt.setLong(5, 9682564471L);
			int r=0;
			r=pstmt.executeUpdate();
			System.out.println(r+" Record inserted seccessfully..");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
