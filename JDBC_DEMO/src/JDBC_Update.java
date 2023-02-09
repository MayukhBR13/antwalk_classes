import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Update {

	public static void main(String[] args) {
		try {
			String username="system",password="Oracle_1";
			String URL="jdbc:oracle:thin:@localhost:1521:orcl";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(URL,username,password);
			
			Statement smt=con.createStatement();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter Emp Id: ");
			int eid=Integer.parseInt(br.readLine());
			
			System.out.println("Enter new salary: ");
			double esal=Double.parseDouble(br.readLine());
			
			int count=smt.executeUpdate("update emp set esal="+esal+" where eno="+eid);
			if(count>0) 
				System.out.println(count+" row updated");
			else
				System.out.println(" No record found ");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
