package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

	String server="DANIEL10";
	int port=1433;
	String user="Daniel";
	String password="thcd5";
	String database="fajrant";
	String jdbcurl;
	Connection conn;
	 
	public Connect() { 
		jdbcurl="jdbc:sqlserver://"+server+":"+port+";databasename="+database+";integrated Security=true";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn=DriverManager.getConnection(jdbcurl,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
