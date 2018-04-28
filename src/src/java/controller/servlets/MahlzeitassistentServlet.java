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

//TODO: Try-catch und Logger hinzufuegen um exceptions abzufangen.

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
    	String kategorienZuruecksetzen=(String) request.getParameter("kategorienZuruecksetzen");
    	String naehrstoffeZuruecksetzen=(String) request.getParameter("naehrstoffeZuruecksetzen");	
    	if (auswahl==null){
    		getLeerenAssistent(request, response);
    	}if (auswahlkontext==null){
    		getLeerenAssistent(request, response);
    	}if (kategorienZuruecksetzen==null){
    		if (naehrstoffeZuruecksetzen==null) {
    			getLeerenAssistent(request, response);
    		}
    		if (naehrstoffeZuruecksetzen.equals("Zurücksetzen")) {
    			setzeNaehrStoffeZurueck(request, response);
    		}    		
    	}if (naehrstoffeZuruecksetzen==null){
    		if (kategorienZuruecksetzen==null){
    			getLeerenAssistent(request, response);
    		}
    		if (kategorienZuruecksetzen.equals("Zurücksetzen")) {
    			setzeKategorienZurueck(request, response);
    		}      
    	}else{
             String nextJSP = "/jsp/mahlzeitassistent.jsp";
             RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
             dispatcher.forward(request, response);
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
    	
    	/**
    	 * To get an empty Mahlzeitassistent
    	 * 
    	 * @param request
    	 * @param response
    	 * @throws ServletException
    	 * @throws IOException
    	 */
    	protected void getLeerenAssistent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		String nextJSP = "/jsp/mahlzeitassistent.jsp";
   		 	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
            dispatcher.forward(request, response);
 	        return;
    	}
    	/**
    	 * To Setze Kategorien Zuruck
    	 * 
    	 * @param request
    	 * @param response
    	 * @throws ServletException
    	 * @throws IOException
    	 */
    	protected void setzeKategorienZurueck(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		HttpSession session = request.getSession(true);
    		session.setAttribute("auswahl1", "reset");
    		session.setAttribute("auswahl2", "reset");
    		session.setAttribute("auswahl3", "reset");
    		String nextJSP = "/jsp/mahlzeitassistent.jsp";
    		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
            dispatcher.forward(request, response);
            return;
    	}
    	
    	/**
    	 * To Setze Naehrstoffe Zuruck
    	 * 
    	 * @param request
    	 * @param response
    	 * @throws ServletException
    	 * @throws IOException
    	 */
    	protected void setzeNaehrStoffeZurueck(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		HttpSession session = request.getSession(true);
    		session.setAttribute("auswahl4", "reset");
    		session.setAttribute("auswahl5", "reset");
    		session.setAttribute("auswahl6", "reset");
    		String nextJSP = "/jsp/mahlzeitassistent.jsp";
    		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
            dispatcher.forward(request, response);
 	        return;
    	}
}
