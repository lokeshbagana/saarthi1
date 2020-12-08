package pack1;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/displayservlet")
public class displayservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 String url=request.getParameter("url");
		 String data=Urlreader.setUrl(url);
		if(urldao.putData(url, data)==true)
		{	
			request.setAttribute("data", data);
			request.getRequestDispatcher("display.jsp").forward(request, response); 
		}
		
	}

	

}
