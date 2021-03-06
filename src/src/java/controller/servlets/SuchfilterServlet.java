package controller.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* Servlet-Implementation der Klasse SuchfilterServlet. 
*/
@WebServlet(description = "Servlet fuer den Suchfilter", urlPatterns = { "/suchfilter/" })

public class SuchfilterServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static String contextPath;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuchfilterServlet() {
        super();
    }
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		contextPath = request.getContextPath();
		String nextJSP = "/jsp/suchfilter.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request, response);
	}

	/**
	 * @return contextPath (current) 
	 */
	public static String getContextPath() {
		return contextPath;
	}
}
