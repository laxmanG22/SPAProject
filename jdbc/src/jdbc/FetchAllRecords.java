package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchAllRecords {

	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost?useername:root&password:root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from student");
		rs.next();
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		rs.next();
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		rs.next();
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
		
	}catch(ClassNotFoundException | SQLException e){
		e.printStackTrace();
		
		
	}
		
	}

	

}
