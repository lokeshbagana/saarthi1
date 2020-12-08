package pack1;

import java.sql.*;

public class urldao {
	public static boolean putData(String s1,String s2){  
		boolean b= false; 
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/saarthidb","root","");  
		      
		PreparedStatement ps=con.prepareStatement("insert into urldata"
		 		+ "(url,urldata)"
		 		+ " values(?,?)"); 
		ps.setString(1,s1) ;
		ps.setString(2,s2);
		ps.executeUpdate();
        con.close();
        b=true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return b;
	}

}
