import java.util.Date;
import java.sql.*;  
public class Customer {
	String Name;
	String Surname;
	String Phone_Number;
	int numberof;
	String id;
	int Table_number;
	Table s;
	Reservation ne=null;
	
	public Customer(String name,String surname,String phone,int number,String id1,int table) {
		Name=name;
		Surname=surname;
		Phone_Number=phone;
		numberof=number;
		id=id1;
		Table_number=table;
	}
	public void Makes_Reservation(String date,int waiterid) {
		try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","ykaraman2002+2007");  
		Statement st=con.createStatement();
		st.executeUpdate("INSERT INTO Clients (name, surname, contact_number, reservation_datetime, client_id, numbers_of) VALUES "+"\n"+"('"+Name+"', '"+Surname+"', '"+Phone_Number+"', '"+date+"', "+id+", "+numberof+");");
		}catch(Exception e){ System.out.println(e);}
		
	}
   }

