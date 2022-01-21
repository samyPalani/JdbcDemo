package tutorial.jdbc;

import java.sql.Connection;
import java.sql.SQLException;


public class ConnectionUtils {
	public static Connection getMyConnection() throws SQLException,ClassNotFoundException{
		return MySQLConnUtils.getMySQLConnection();
	}
	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		System.out.println("Get Connection....");
		
		Connection conn= ConnectionUtils.getMyConnection();
		System.out.println("Get Connection"+ conn);
		System.out.println("Done!");
	}
	
}
