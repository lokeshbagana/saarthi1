package pack1;

import java.sql.*;
public class logindao {
	public static boolean validate(String username,String password){  
		boolean b= false; 
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/saarthidb","root","");  
		      
		PreparedStatement ps=con.prepareStatement(  
		"select * from logindetail where username=? and password=?");  
		ps.setString(1,username);  
		ps.setString(2,password);  
		      
		ResultSet rs=ps.executeQuery();  
		if(rs.isBeforeFirst())
            b = true;
        
        con.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return b;
	}
}
