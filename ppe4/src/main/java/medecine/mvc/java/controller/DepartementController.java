package medecine.mvc.java.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import medecine.mvc.java.dao.DepartementDAO;
import medecine.mvc.java.dao.DepartementDAOImpl;
import medecine.mvc.java.model.Departement;

/**
 * Servlet implementation class DepartementController
 */
@WebServlet("/DepartementController")
public class DepartementController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	RequestDispatcher dispatcher = null;
	
	DepartementDAO departementDAO = null;
	
  
	
	
	
	
	
    public DepartementController() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    
    
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
