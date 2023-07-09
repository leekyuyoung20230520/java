package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/contacts?serverTimezone=Asia/Seoul";
		Connection con = null;
		Statement stmt = null;
		ResultSet rst = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("database connecting......");
			con = DriverManager.getConnection(url, "root", "admin1234");
			System.out.println("success connection");
			
			stmt =con.createStatement();
			rst =  stmt.executeQuery("select * from person");
			while(rst.next()) {
				System.out.printf("%s %s %s \n", 
						rst.getString(1),rst.getString(2),rst.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
