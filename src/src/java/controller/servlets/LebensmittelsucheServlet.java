package controller.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
* Servlet implementation class LebensmittelsucheServlet
*/
@WebServlet(description = "Servlet fuer die Lebensmittelsuche", urlPatterns = { "/lebensmittelsuche/" })

public class LebensmittelsucheServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LebensmittelsucheServlet() {
        super();
    }
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextJSP = "/jsp/suche.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
         dispatcher.forward(request, response);
	}

}
