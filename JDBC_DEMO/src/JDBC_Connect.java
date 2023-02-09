import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Connect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String username="system",password="Oracle_1";
			String URL="jdbc:oracle:thin:@localhost:1521:orcl";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(URL,username,password);
			
			Statement smt= con.createStatement();
			smt.executeUpdate("create table emp(eno number,ename varchar(20),esal number)");
			
			System.out.println("Table created successfully");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
