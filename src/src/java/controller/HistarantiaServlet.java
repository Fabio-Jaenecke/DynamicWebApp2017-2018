package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datenbank.DatabaseConnector;
import datenbank.manager.DbManager;

/**
 * Servlet implementation class HistarantiaServlet
 */
@WebServlet(description = "Main servlet for application", urlPatterns = { "/home/" })

public class HistarantiaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	// TODO remove: private DatabaseConnector conn = new DatabaseConnector();
	private DbManager manager = new DbManager();
       
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
		String nextJSP = "/home.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
         dispatcher.forward(request, response);
	}

}

