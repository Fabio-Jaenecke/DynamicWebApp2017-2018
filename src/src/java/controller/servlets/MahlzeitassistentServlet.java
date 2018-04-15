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
@WebServlet(description = "Servlet für den Mahlzeitassistent", urlPatterns = { "/mahlzeitassistent/" })

public class MahlzeitassistentServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MahlzeitassistentServlet() {
        super();
    }
    
    /** Das Servlet ruft standardmässig den Mahlzeitassistent auf, um ihn zu öffnen.
     *  Sollte der Benutzer auf eine Auswahl klicken, wird Mahlzeitassistentenauswahl geöffnet
     *  Mit einer auswahl in Mahlzeitassisten kehrt der Benutzer wieder zu Mahlzeitassistent zurück
     *  Else, falls kein richtiger Paramter gefunden wurde, kehre zur Home-Seite zurück.  
     * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
    	String auswahl=(String) session.getAttribute("auswahl");
    	String auswahlkontext=(String) session.getAttribute("auswahlkontext");
    	
    	
    	if (auswahl==null){
    		 String nextJSP = "/jsp/mahlzeitassistent.jsp";
    		 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
             dispatcher.forward(request, response);
             System.out.print("kontext:");
             System.out.println(request.getSession().getAttribute("auswahlkontext"));
             System.out.print("Auswahl:");
             System.out.println(request.getSession().getAttribute("auswahl"));
  	         return;
  	         
    	} if (auswahlkontext==null){
      		 String nextJSP = "/jsp/mahlzeitassistent.jsp";
      		 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
               dispatcher.forward(request, response);
               System.out.print("kontext:");
               System.out.println(request.getSession().getAttribute("auswahlkontext"));
               System.out.print("Auswahlkontextnull:");
               System.out.println(request.getSession().getAttribute("auswahl"));
    	         return;
    	         
  	         
    	}if (auswahl.equals(findeAuswahl(request, response)) && auswahlkontext.equals("kategorie1")) {
	   		 String nextJSP = "/jsp/mahlzeitassistent.jsp";
	   		 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
	         dispatcher.forward(request, response);
	         System.out.print("kontext:");
             System.out.println(request.getSession().getAttribute("auswahlkontext"));
             System.out.print("Auswahl11413412:");
             System.out.println(request.getSession().getAttribute("auswahl1"));
	         return;
	     
    	}if (auswahlkontext.equals("kategorie1")) {
	   		 String nextJSP = "/jsp/mahlzeitassistent.jsp";
	   		 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
	         dispatcher.forward(request, response);
	         System.out.print("kontext:");
            System.out.println(request.getSession().getAttribute("auswahlkontext"));
            System.out.print("Auswahlok:");
            System.out.println(request.getSession().getAttribute("auswahl"));
            System.out.print("Auswahlok1:");
            System.out.println(session.getAttribute("auswahl1"));
	         return;
	         
 	        
    	}if (auswahl.equals(findeAuswahl(request, response)) && auswahlkontext.equals("kategorie2")) {
	   		 String nextJSP = "/jsp/mahlzeitassistent.jsp";
	   		 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
	         dispatcher.forward(request, response);
	         System.out.print("kontext:");
             System.out.println(request.getSession().getAttribute("auswahlkontext"));
             System.out.print("Auswahl:");
             System.out.println(request.getSession().getAttribute("auswahl"));
	         return;  
	         
    	}if (auswahl.equals(findeAuswahl(request, response)) && auswahlkontext.equals("kategorie3")) {
	   		 String nextJSP = "/jsp/mahlzeitassistent.jsp";
	   		 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
	         dispatcher.forward(request, response);
	         System.out.print("kontext:");
             System.out.println(request.getSession().getAttribute("auswahlkontext"));
             System.out.print("Auswahl:");
             System.out.println(request.getSession().getAttribute("auswahl"));
	         return;  
	    
    	}if (auswahl.equals(findeAuswahl(request, response)) && auswahlkontext.equals("kategorie4")) {
	   		 String nextJSP = "/jsp/mahlzeitassistent.jsp";
	   		 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
	         dispatcher.forward(request, response);
	         System.out.print("kontext:");
             System.out.println(request.getSession().getAttribute("auswahlkontext"));
             System.out.print("Auswahl:");
             System.out.println(request.getSession().getAttribute("auswahl"));
	         return;  
	        
    	}if (auswahl.equals(findeAuswahl(request, response)) && auswahlkontext.equals("kategorie5")) {
	   		 String nextJSP = "/jsp/mahlzeitassistent.jsp";
	   		 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
	         dispatcher.forward(request, response);
	         System.out.print("kontext:");
             System.out.println(request.getSession().getAttribute("auswahlkontext"));
             System.out.print("Auswahl:");
             System.out.println(request.getSession().getAttribute("auswahl"));
	         return;  
	         
    	}if (auswahl.equals(findeAuswahl(request, response)) && auswahlkontext.equals("kategorie6")) {
	   		 String nextJSP = "/jsp/mahlzeitassistent.jsp";
	   		 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
	         dispatcher.forward(request, response);
	         System.out.print("kontext:");
             System.out.println(request.getSession().getAttribute("auswahlkontext"));
             System.out.print("Auswahl:");
             System.out.println(request.getSession().getAttribute("auswahl"));
	         return;      
	    /*
    	}if (auswahl.equals("gehezurauswahl")) {
    		
   		 String nextJSP = "/jsp/mahlzeitassistentauswahl.jsp";
   		 System.out.println(request.getSession().getAttribute("auswahl"));
   		 RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
            dispatcher.forward(request, response);
            System.out.print("kontext:");
            System.out.println(request.getSession().getAttribute("auswahlkontext"));
            System.out.print("Auswahl:");
            System.out.println(request.getSession().getAttribute("auswahl"));
	         return;     
	     */    
    	}else{
    		/*error - something went wrong */
             String nextJSP = "/home.jsp";
             RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
             dispatcher.forward(request, response);
             System.out.print("kontext:");
             System.out.println(request.getSession().getAttribute("auswahlkontext"));
             System.out.print("Auswahl:");
             System.out.println(request.getSession().getAttribute("auswahl"));
             return;
    	}
	}
    	
    	/** 
    	 * Diese Methode schaut, welches Lebensmittel in der Tabelle ausgewählt wurde und gleicht dieses
    	 * mit dem Attribut in der gleichen Session ab. Auswahl ist dabei ein Lebensmittelname, welcher zu einen
    	 * in der Lebensmittelliste vorkommt und zu anderen als Parameter weitergegeben wird.
    	 * 
    	 * @param request
    	 * @param response
    	 * @return
    	 */
    	protected Object findeAuswahl(HttpServletRequest request, HttpServletResponse response) {
    		HttpSession session = request.getSession(true);
    		Object auswahl = session.getAttribute("auswahl");
	    	try {
	            auswahl = request.getSession().getAttribute("auswahl");
	        } catch (Exception ex) {
	            Logger.getLogger(MahlzeitassistentServlet.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    	return auswahl;
	}
}
