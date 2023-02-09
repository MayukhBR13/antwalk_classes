import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String username="system",password="Oracle_1";
			String URL="jdbc:oracle:thin:@localhost:1521:orcl";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(URL,username,password);
			
			Statement smt= con.createStatement();
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				System.out.println("ENter Deletion Emp Id: ");
				int eno = Integer.parseInt(br.readLine());
				
				int count = smt.executeUpdate("delete from emp where eno="+eno);
				if(count>0)
					System.out.println(count+" record deleted");
				else
					System.out.println("No record deleded");
				
				System.out.println("Do you want to delete more records");
				String ch=br.readLine();
				if(ch.equalsIgnoreCase("no"))
					break;
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
