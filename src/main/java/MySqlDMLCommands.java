import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlDMLCommands {

	public static void main(String[] args) throws SQLException {

		//1. create a connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root", "divi");
		
		//2.create a statement/query 
		Statement stmnt = con.createStatement();
		//String s = "insert into student values(21,'ovi')";
		//String s = "update student set sname = 'Divi' where sno = 21";
		  String s  = "delete from student where sno=20";
		
		//3.excute the query
		stmnt.execute(s);
				
		//4.close the connection
		con.close();
		
		System.out.println("Query Executed");

	}

}
