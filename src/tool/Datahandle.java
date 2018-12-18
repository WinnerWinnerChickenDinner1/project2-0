package tool;


	//数据库
	import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

	public class Datahandle {
		private static Statement stat;
	private static void init() throws SQLException, ClassNotFoundException {
		  
		   // 注册 JDBC 驱动
		   Class.forName("com.mysql.jdbc.Driver");
		   System.out.println("服务器启动...");
	       Connection conn = DriverManager.getConnection("jdbc:mysql://119.29.203.202:3306/cinemabooking?useUnicode=true&characterEncoding=UTF-8&useSSL=false","root","951124");
	    // 执行查询
	         stat = conn.createStatement();
	       }
	       public static  Statement getStatement() throws SQLException, ClassNotFoundException{
	    	   if(stat==null)
	    		   init();
	    	   System.out.println("数据库已连接");
	    		   return stat;
	    	   
	       }
	       public static void main(String[] args) throws ClassNotFoundException, SQLException {
			ResultSet rs = Datahandle.getStatement().executeQuery("select * from film");
			while(rs.next()) {
				String name = rs.getString("cover");
				System.out.println(name);
			}
		}

	}
	   

