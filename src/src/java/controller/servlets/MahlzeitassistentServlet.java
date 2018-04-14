package controller.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
* Servlet implementation class MahlzeitassistentServlet
*/
@WebServlet(description = "Servlet für den Mahlzeitassistent", urlPatterns = { "/mahlzeitassistent/" })

public class MahlzeitassistentServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private String auswahl;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MahlzeitassistentServlet() {
        super();
    }
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextJSP = "/jsp/mahlzeitassistent.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
         dispatcher.forward(request, response);
	}

	public String getAuswahl() {
		return auswahl;
	}

	public void setAuswahl(String auswahl) {
		this.auswahl = auswahl;
	}

}
