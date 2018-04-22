package controller.servlets;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
* Servlet implementation class MahlzeitassistentServlet
*/
@WebServlet(description = "Servlet fuer den Mahlzeitassistent", urlPatterns = { "/mahlzeitassistent/" })

public class MahlzeitassistentServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(MahlzeitassistentServlet.class.getName());
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MahlzeitassistentServlet() {
        super();
    }
    
    /** Das Servlet ruft standardmaessig den Mahlzeitassistent auf, um ihn zu oeffnen.
     *  Sollte der Benutzer auf eine Auswahl klicken, wird Mahlzeitassistentenauswahl geoeffnet
     *  Mit einer auswahl in Mahlzeitassisten kehrt der Benutzer wieder zu Mahlzeitassistent zurueck
     *  Else, falls kein richtiger Paramter gefunden wurde, kehre zur Home-Seite zurueck.  
     * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
    	String auswahl=(String) session.getAttribute("auswahl");
    	String auswahlkontext=(String) session.getAttribute("auswahlkontext");
    	
    	
    	if (auswahl==null || auswahlkontext==null){
    		 String nextJSP = "/jsp/mahlzeitassistent.jsp";
    		 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
             dispatcher.forward(request, response);
             LOGGER.log(Level.CONFIG, "Leerer Mahlzeitassistent");
  	         return;
  	         
    	}if (auswahl.equals(findeAuswahl(request, response)) && auswahlkontext != null) {
	   		 String nextJSP = "/jsp/mahlzeitassistent.jsp";
	   		 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
	         dispatcher.forward(request, response);
	         return;
    
    	}else{
             String nextJSP = "/jsp/mahlzeitassistent.jsp";
             RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
             dispatcher.forward(request, response);
             LOGGER.log(Level.CONFIG, "Exit Mahlzeitassistent");
             return;
    	}
	}
    	
    	/** 
    	 * Diese Methode schaut, welches Lebensmittel in der Tabelle ausgewaehlt wurde und gleicht dieses
    	 * mit dem Attribut in der gleichen Session ab. Auswahl ist dabei ein Lebensmittelname, welcher zu einen
    	 * in der Lebensmittelliste vorkommt und zu anderen als Parameter weitergegeben wird.
    	 * 
    	 * @param request
    	 * @param response
    	 * @return
    	 */
    	protected Object findeAuswahl(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		HttpSession session = request.getSession(true);
    		Object auswahl = session.getAttribute("auswahl");
	    	try {
	            auswahl = request.getSession().getAttribute("auswahl");
	        } catch (Exception ex) {
	        	LOGGER.log(Level.SEVERE, null, ex);
	        }
	    	return auswahl;
	}
}
