

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet2
 */
public class LoginServlet2 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wtl","root","scm@1405");
			String n = request.getParameter("username");
			String p = request.getParameter("pass");
		    PreparedStatement ps = con.prepareStatement("select uname from login where uname = ? and  pass = ?");
		    ps.setString(1, n);
		    ps.setString(2, p);
		    ResultSet rs = ps.executeQuery();
		    if(rs.next()) {
		    	RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
		    	rd.forward(request, response);
		    }else {
		    	RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		    	rd.forward(request, response);
		    }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
