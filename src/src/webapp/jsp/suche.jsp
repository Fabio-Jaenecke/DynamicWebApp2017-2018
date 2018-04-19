<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--[if lt IE 7]>
<html class="no-js lt-ie9 lt-ie8 lt-ie7" lang="">
<![endif]-->
<!--[if IE 7]>
<html class="no-js lt-ie9 lt-ie8" lang="">
<![endif]-->
<!--[if IE 8]>
<html class="no-js lt-ie9" lang="">
<![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js" lang="de">
<!--<![endif]-->
<head>
    <meta charset="utf-8">
    <title>Histarantia</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="apple-touch-icon" href="${pageContext.request.contextPath}/imgs/apple-touch-icon.png">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/normalize.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/Main/main.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/Rest/lebensmittelkategorie.css">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/imgs/favicon.ico" type="image/x-icon">
    <link rel="icon" href="${pageContext.request.contextPath}/imgs/favicon.ico" type="image/x-icon">
    <script src="${pageContext.request.contextPath}/js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
</head>
<body>
<!--[if lt IE 8]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade
    your browser</a> to improve your experience.</p>
<![endif]-->
<div class="header-container">
    <header class="wrapper clearfix" style="max-height: 50px; padding-top: 15px;"><div class="flex-grid-thirds"><div class="col menugrid"><span onclick="openNav()">&#9776;<span class="menutext">&nbsp;Menu</span></div><div class="col titlegrid">Lebensmittelsuche</div><div class="col suchgrid"><a class="suchicon" href="${pageContext.request.contextPath}/suchfilter/">&#8981;</a></div></div>
        <nav>

            <div id="mySidenav" class="sidenav side-nav">
                <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&#9587;</a>
                <a href="${pageContext.request.contextPath}/home/">Home</a>
       			<a href="${pageContext.request.contextPath}/lebensmittel/">Lebensmittel</a>
       			<a href="${pageContext.request.contextPath}/mahlzeitassistent/">Mahlzeitsassistent</a>
       			<a href="${pageContext.request.contextPath}/rezepte/">Rezepte</a>
       			<a href="${pageContext.request.contextPath}/zugriffsskala/">Zugriffsskala</a>
       			<a class="active" href="${pageContext.request.contextPath}/lebensmittelsuche/">Suche</a>
       			<a href="${pageContext.request.contextPath}/faq/">FAQ</a>
            </div>
        </nav>
         
    </header>
</div>
<div class="main-container">
    <div class="main wrapper clearfix">
            <section>
	            <form method="get" action="${pageContext.request.contextPath}/lebensmittelsuche/">
	            		<div>
	            		<h3>Suche nach Lebensmitteln</h3>
	            			<input type="text" name="sucheintrag" value="" />
	            			<input type="submit" value="Suche" />
			           		  <%@ page import ="suche.*" %>
			           		  <%
			           		    String lebensmittelname = "";
									if (request.getParameter("sucheintrag") == null) {
										//Technically, this is not required:
							        	        //out.println("input field could not be validated");
				                    
									}else{
										lebensmittelname = request.getParameter("sucheintrag");
										LebensmittelsucheDao suchauftrag = new LebensmittelsucheDao();
										suchauftrag.searchForString(lebensmittelname);
										
		                                                        //Print the Table if something is found:
				 					if (suchauftrag.getLebensmittel() != null && lebensmittelname != ""){
				 						out.println("<table class='table_lebensmittelkategorie' style='margin-top: 30px';>");
				 						out.println("<tr>");
				 						out.println("<th>Lebensmittel</th>");
				 						out.println("<th>Karenzphase</th>");
				 						out.println("<th>Dauerernaehrung</th>");
				 						out.println("</tr>");
				 						out.println("<tr>");
				 						out.println("<td>");
				 						out.println(suchauftrag.getLebensmittel().getLname());
				 						out.println("</td>");
				 						out.println("<td>");
				 						out.println(suchauftrag.getLebensmittel().getKarenzphase());
				 						out.println("</td>");
				 						out.println("<td>");
				 						out.println(suchauftrag.getLebensmittel().getDauerernaehrung());
				 						out.println("</td>");
				 						out.println("</tr>");
				 						out.println("</table>");
				 					//Else print a warning
				 					}else{
				 				      	out.println("<p><p>");
						            	out.println("Ihre Suche ergab keine Treffer, versuchen Sie die Kategorienauswahl."); 
						            	out.println("<p><p>");
					               }
								   }
					               %>
	            		</div>
	           		</form>
            </section>
            <section>
            <form method="get" action="${pageContext.request.contextPath}/lebensmittelsuche/">
				<h3>Suche nach Kategorien</h3>
						<%@ page import="datenbank.container.*" %>
						<%@ page import="suche.*" %>
						<%@ page import="java.util.ArrayList" %>
					<select onchange="this.form.submit()" name="kategorieauswahl">
								<option value="" disabled selected>Waehlen Sie eine Kategorie</option>
			           			<option <%if (request.getParameter("kategorieauswahl") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl").equals("Fleisch")){out.println("selected");} %> value="Fleisch">Fleisch</option>
			           			<option <%if (request.getParameter("kategorieauswahl") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl").equals("Obst")){out.println("selected");} %> value="Obst">Obst</option>
			           			<option <%if (request.getParameter("kategorieauswahl") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl").equals("Gemuese")){out.println("selected");} %> value="Gemuese">Gemuese</option>
			           			<option <%if (request.getParameter("kategorieauswahl") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl").equals("Huelsenfruechte")){out.println("selected");} %> value="Huelsenfruechte">Huelsenfruechte</option>
			           			<option <%if (request.getParameter("kategorieauswahl") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl").equals("Nuesse und Samen")){out.println("selected");} %> value="Nuesse und Samen">Nuesse und Samen</option>
			           			<option <%if (request.getParameter("kategorieauswahl") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl").equals("Fisch")){out.println("selected");} %> value="Fisch">Fisch</option>
			           			<option <%if (request.getParameter("kategorieauswahl") == null) {/*its not there*/} else if (request.getParameter("kategorieauswahl").equals("Milch und Milchprodukte")){out.println("selected");} %> value="Milch und Milchprodukte">Milch und Milchprodukte</option>
			        </select>
						<%
						String kategorienname = "";
			        if (request.getParameter("kategorieauswahl") == null) {
			        	//Technically, this is not required:
			        	//out.println("input field could not be validated");
                    
					}else{
						kategorienname = request.getParameter("kategorieauswahl");
						KategoriensucheDao kategorieauftrag = new KategoriensucheDao();
						kategorieauftrag.searchForString(kategorienname);
						ArrayList<LebensmittelDaten> daten = kategorieauftrag.getLebensmittel();
						
			        %>
			         <table class='table_lebensmittelkategorie' style='margin-top: 30px;'>
                             <thead>
                                 <tr>
                                    <th colspan="3">
                                       <%
                                          out.println(kategorienname);
                                          %>
                                    </th>
                                 </tr>
                                 <tr>
                                    <th>Lebensmittel</th>
                                    <th>Karenzphase</th>
                                    <th>Dauerernaehrung</th>
                                 </tr>
                              </thead>
                              <tbody>
				                
				                <%
				                for(LebensmittelDaten lebensmitteleintrag : daten){
				                		out.println("<tr>");
				                   		out.println("<td>");
				                		out.println(lebensmitteleintrag.getLname());
				                		out.println("</td>");
				                		out.println("<td>");
				                		out.println(lebensmitteleintrag.getKarenzphase());
				                		out.println("</td>");
				                		out.println("<td>");
				                		out.println(lebensmitteleintrag.getDauerernaehrung());
				                		out.println("</td>");
				                		out.println("</tr>");
									}
			        			// for the next category call we have to clear the arraylist of lebensmittel
			        			kategorieauftrag.clearLebensmittel();
			        			}
				                %>
				                </tbody>
			            </table>
            </form>
            
            </section>
            
    </div>
    <!-- #main -->
</div>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="${pageContext.request.contextPath}/js/vendor/jquery-1.11.2.min.js"><\/script>')</script>
<script src="${pageContext.request.contextPath}/js/main.js"></script>
<!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->
<script>
    (function (b, o, i, l, e, r) {
        b.GoogleAnalyticsObject = l;
        b[l] || (b[l] =
            function () {
                (b[l].q = b[l].q || []).push(arguments)
            });
        b[l].l = +new Date;
        e = o.createElement(i);
        r = o.getElementsByTagName(i)[0];
        e.src = '//www.google-analytics.com/analytics.js';
        r.parentNode.insertBefore(e, r)
    }(window, document, 'script', 'ga'));
    ga('create', 'UA-XXXXX-X', 'auto');
    ga('send', 'pageview');
</script>
</body>
</html>
