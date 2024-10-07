import java.util.Date;
import java.text.*;
import java.sql.*;
public class Reservation {
	
	Date date;
	Time Hour;
	SimpleDateFormat dateformat = new SimpleDateFormat("dd/M/yyyy HH:MM:SS");
	Table S;
	public Reservation(Date Date1) {
	this.date=Date1;
	}
	
	public Table Set_Table(int number,int chair_n) {
		S= new Table(number,chair_n);
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","ykaraman2002+2007");  
			Statement st=con.createStatement();
			st.executeUpdate("instert into Reservation values("+Hour+", "+date+", "+S+";");
		    }catch(Exception e){ System.out.println(e);}
		return S;
	}
	public void Cancel_Table() {
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","ykaraman2002+2007");  
			Statement st=con.createStatement();
			st.executeUpdate("delete from Reservation where (date="+date+",Table="+S+";");
		    }catch(Exception e){ System.out.println(e);}
	}
	}

