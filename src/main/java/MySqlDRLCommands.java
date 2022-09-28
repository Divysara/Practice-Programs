import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlDRLCommands {

	public static void main(String[] args) throws SQLException {
		//1. create a connection
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root", "divi");
				
				//2.create a statement/query 
				Statement stmnt = con.createStatement();
				//String s = "insert into student values(21,'ovi')";
				//String s = "update student set sname = 'Divi' where sno = 21";
				  String s  = "select * from student";
				
				//3.excute the query  4. store the results
				ResultSet rs = stmnt.executeQuery(s);
				 
				while(rs.next()) {
					int no = rs.getInt("sno");
					String name = rs.getString("sname");
					System.out.println(no+"   "+name);
				}
				
				
				
				//5.close the connection
				con.close();
				
				System.out.println("Query Executed");
				
				//o/p:
				/*
				 * 21 Divi
				 *  20 dev 
				 *  22 mev 
				 *  Query Executed
				 */

	}

}
