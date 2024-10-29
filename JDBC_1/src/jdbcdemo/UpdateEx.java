package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateEx {

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "arise"); 
            if (con != null) {
                System.out.println("Connection established successfully!");
            } else {
                System.out.println("Failed to establish connection!");
                return;
            }
            PreparedStatement pstmt = con.prepareStatement("delete from teacher where id=?");        
            pstmt.setInt(1,420);
            
            int i = pstmt.executeUpdate();
            System.out.println(i + " record updated successfully");

            pstmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
