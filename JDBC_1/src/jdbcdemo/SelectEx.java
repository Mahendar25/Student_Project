package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "arise");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from teacher");
		ResultSetMetaData rm = rs.getMetaData();
		int n=rm.getColumnCount();
		for (int i = 1; i <= n; i++) {
			System.out.print(rm.getColumnName(i)+"	\t");
		}
		System.out.println();
		while (rs.next())
		{
			for (int i=1;i<=n;i++) 
			{
				System.out.print(rs.getString(i)+"	\t");
			}
			System.out.println();
		}
	}

}
