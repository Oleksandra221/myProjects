package recruitment.task;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list")
public class ListServlet  extends HttpServlet {
	    private static final long serialVersionUID = 1L;
	    
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        listValues(request, response);
	    }
	 
	    protected void listValues(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        ValuesDAO dao = new ValuesDAO();
	 
	        try {
	 
	            List<Values> rows_from_values_table = dao.getRowsFromValuesTable();
	        	
	        	request.setAttribute("rowsFromValuesTable", rows_from_values_table);
	 
	            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
	            dispatcher.forward(request, response);
	 
	        } catch (SQLException e) {
	            e.printStackTrace();
	            throw new ServletException(e);
	        }
	    }
	    
	    @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        //int valuesId = Integer.parseInt(request.getParameter("values"));
	     int valuesId=1;
	    	
	        request.setAttribute("selectedValuesId", valuesId);
	     
	        listValues(request, response);
	    }
	    
}

