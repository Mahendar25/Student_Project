package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "arise");
			PreparedStatement pstmt =con.prepareStatement("insert into teacher values(?,?,?)");
			Scanner sc=new Scanner(System.in);
			while(true)
			{
				System.out.println("Enter student name: ");
				String a=sc.next();
				System.out.println("Enter ID: ");
				int b=sc.nextInt();
				System.out.println("Enter branch: ");
				String c=sc.next();
				pstmt.setString(1, a);
				pstmt.setInt(2, b);
				pstmt.setString(3, c);
				int i=pstmt.executeUpdate();
				System.out.println(i+" record inserted successfully");
				System.out.println("do you want insert another record (y/n)?");
				String op=sc.next();
				if(op.equals("n"))
				{
					break;
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
