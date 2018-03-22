package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datenbank.DatabaseConnector;

/**
 * Servlet implementation class HistarantiaServlet
 */
@WebServlet(description = "Main servlet for application", urlPatterns = { "/home" })

public class HistarantiaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private DatabaseConnector conn = new DatabaseConnector();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HistarantiaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nextJSP = "/home.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
         dispatcher.forward(request, response);
	}

}

