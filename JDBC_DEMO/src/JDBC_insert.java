import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String username="system",password="Oracle_1";
			String URL="jdbc:oracle:thin:@localhost:1521:orcl";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(URL,username,password);
			
			PreparedStatement psmt=con.prepareStatement("insert into emp values(?,?,?)");
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				System.out.println("Enter Emp ID: ");
				int eno=Integer.parseInt(br.readLine());

				System.out.println("Enter Emp Name: ");
				String ename=br.readLine();
				
				System.out.println("Enter Emp Salary: ");
				double esal=Double.parseDouble(br.readLine());

				psmt.setInt(1, eno);
				psmt.setString(2, ename);
				psmt.setDouble(3, esal);
				
				int count = psmt.executeUpdate();
				if(count>0) 
					System.out.println(count+" record inserted");
				else
					System.out.println("No record inserted");
				
				System.out.println("Do you want to insert moore records:");
				String ch=br.readLine();
				if(ch.equalsIgnoreCase("no"))
					break;
			}
					
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
