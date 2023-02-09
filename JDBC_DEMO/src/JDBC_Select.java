import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String username="system",password="Oracle_1";
			String URL="jdbc:oracle:thin:@localhost:1521:orcl";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(URL,username,password);
			
			Statement smt = con.createStatement();
			ResultSet rs= smt.executeQuery( "select * from emp");
			
			while(rs.next()) {
				int eno=rs.getInt(1);
				String ename = rs.getString(2);
				double esal=rs.getDouble(3);
				
				System.out.println(" Emp Id: "+eno);
				System.out.println(" Emp name: " +ename);
				System.out.println(" Emp Salary: "+esal);
				
				System.out.println();
			}
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
