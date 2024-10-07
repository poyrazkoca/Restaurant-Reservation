import java.sql.*;
import java.util.Date;
public class Company {

	String Name;
	String Phone_Number;
	String Address;
	Time close_time;
	
	public void Set_close_time(Time clo){
		close_time=clo;
	}
	public Company(String name) {
		Name=name;
	}
	public int numbers_of_Customers() {
		   int d=0;
		   try{  
				Class.forName("com.mysql.cj.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","ykaraman2002+2007");  
				Statement st=con.createStatement();
				ResultSet f=st.executeQuery("select sum(numbers_of) as total from Clients;");
				if (f.next()) { 
				d=f.getInt("total");}
			    }catch(Exception e){ System.out.println(e);}
			return d;
	
}
	public int avg_numbers_of_Customers() {
		   int d=0;
		   try{  
				Class.forName("com.mysql.cj.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","ykaraman2002+2007");  
				Statement st=con.createStatement();
				ResultSet f=st.executeQuery("select avg(numbers_of) as total from Clients;");
				if (f.next()) { 
				d=f.getInt("total");}
			    }catch(Exception e){ System.out.println(e);}
			return d;
		}	
	public int count_Reservations() {
		int d=0;
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","ykaraman2002+2007");  
			Statement st=con.createStatement();
			ResultSet f=st.executeQuery("SELECT count(client_id)FROM Clients;");
			if (f.next()) {
			    int count = f.getInt("count(client_id)");}
			d=f.getInt("count(client_id)");
		    }catch(Exception e){ System.out.println(e);}
		return d;
	}
}
