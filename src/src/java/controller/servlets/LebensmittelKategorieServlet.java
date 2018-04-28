package controller.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
* Servlet implementation class lebensmittelkategorieServlet
*/
@WebServlet(description = "Servlet fuer die Lebensmittelrangliste", urlPatterns = { "/lebensmittel/" })

public class LebensmittelKategorieServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LebensmittelKategorieServlet() {
        super();
    }
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextJSP = "/jsp/lebensmittelkategorie.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
         dispatcher.forward(request, response);
	}

}
