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
               <link rel="apple-touch-icon" href="../${pageContext.request.contextPath}/imgs/apple-touch-icon.png">
               <link rel="stylesheet" href="../${pageContext.request.contextPath}/css/normalize.min.css">
               <link rel="stylesheet" href="../${pageContext.request.contextPath}/css/Main/main.css">
               <link rel="shortcut icon" href="../${pageContext.request.contextPath}/imgs/favicon.ico" type="image/x-icon">
               <link rel="icon" href="../${pageContext.request.contextPath}/imgs/favicon.ico" type="image/x-icon">
               <link rel="apple-touch-icon" href="${pageContext.request.contextPath}/imgs/apple-touch-icon.png">
			   <link rel="stylesheet" href="${pageContext.request.contextPath}/css/normalize.min.css">
			   <link rel="stylesheet" href="${pageContext.request.contextPath}/css/Main/main.css">
			   <link rel="stylesheet" href="${pageContext.request.contextPath}/css/Rest/lebensmittelkategorie.css">
			   <link rel="shortcut icon" href="${pageContext.request.contextPath}/imgs/favicon.ico" type="image/x-icon">
			   <link rel="icon" href="${pageContext.request.contextPath}/imgs/favicon.ico" type="image/x-icon">
               <script src="js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
               <style>
               	/* ==========================================================================
				   Breadcrumbs
				   ========================================================================== */

				ul.breadcrumb {
				    padding: 10px 16px;
				    list-style: none;
				    background-color: #eee;
				}
				ul.breadcrumb li {
				    display: inline;
				    font-size: 18px;
				}
				ul.breadcrumb li+li:before {
				    padding: 8px;
				    color: black;
				    content: ">";
				}
				ul.breadcrumb li a {
				    color: #6FA8DC;
				    text-decoration: none;
				}
				ul.breadcrumb li a:hover {
				    color: #01447e;
				    text-decoration: underline;
				}
               </style>
            </head>
            <body>
               <!--[if lt IE 8]>
               <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
               <![endif]-->
               <div class="header-container">
                  <header class="wrapper clearfix" style="max-height: 50px; padding-top: 15px;"><div class="flex-grid-thirds"><div class="col menugrid"><span onclick="openNav()">&#9776;<span class="menutext">&nbsp;Menu</span></div><div class="col titlegrid">Home</div><div class="col suchgrid"><a class="suchicon" href="${pageContext.request.contextPath}/suchfilter/">&#8981;</a></div></div>
                     <nav>
                        
                        <div id="mySidenav" class="sidenav side-nav">
                           <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&#9587;</a>
                            <a class="active" href="${pageContext.request.contextPath}/home/">Home</a>
                			<a href="${pageContext.request.contextPath}/lebensmittel/">Lebensmittel</a>
                			<a href="${pageContext.request.contextPath}/mahlzeitassistent/">Mahlzeitsassistent</a>
                			<a href="${pageContext.request.contextPath}/rezepte/">Rezepte</a>
                			<a href="${pageContext.request.contextPath}/zugriffsskala/">Zugriffsskala</a>
                			<a href="${pageContext.request.contextPath}/lebensmittelsuche/">Suche</a>
                			<a href="${pageContext.request.contextPath}/faq/">FAQ</a>
                        </div>
                     </nav>
                      
                  </header>
               </div>
               <div class="main-container">
                  <div class="main wrapper clearfix">
                  	<form method="get" action="${pageContext.request.contextPath}/home/">
                     <article>
                     <input type="submit" value="Zurück" onchange="history.back()">
                     	<ul class="breadcrumb">
                     	<li><a href="${pageContext.reqüst.contextPath}/home/">Home</a></li>
						 <li>Was ist Histamin?</li>
						</ul>
						                        	
                        <header>
                           <h2>Was ist Histamin?</h2>
                           
                    
                       		<article style="min-width: 100%">
							Histamin ist ein sogenanntes biogenes Amin und dient im Körper unter anderem als wichtiger Botenstoff. Unser Organismus produziert eigenständig Histamin, das in verschiedenen Abläufen des Körpers beteiligt ist. So spielt Histamin eine wichtige Rolle bei der Magensaftproduktion, der Regulierung des Blutdrucks und des Schlaf-Wach-Rhythmus oder ist bei der Appetitkontrolle beteiligt. Histamin ist aber auch „schuld“ an den juckenden Quaddeln nach einem Mückenstich oder an einer laufenden Nase. Dies sind nur einige Beispiele dafür, wie Histamin auf verschiedenste Art und Weise in hunderten Prozessen unseres Körpers mitwirkt. Da Histamin so eine große Rolle spielt, produziert unser Körper Histamin auf Vorrat und speichert es u.a. in den sogenannten Mastzellen. Bei Bedarf wird das Histamin dann freigesetzt. Unser Körper baut das Histamin über Enzyme auch wieder ab, er schafft sich sozusagen ein Histamingleichgewicht.
							
							<h3>Histamin in der Nahrung</h3>
							Histamin kann aber auch über die Nahrung aufgenommen werden, dann kann dieses System aus dem Gleichgewicht kommen. Dies passiert, wenn wir z.B. verdorbenen Fisch essen und eine Fischvergiftung haben. Bei Personen mit Histaminintoleranz wird dieses Gleichgewicht schneller bzw. durch weniger zugeführtes Histamin aus dem Gleichgewicht gebracht, bzw. könnte es sein, dass die Enzyme nicht richtig funktionieren oder zu wenig davon vorhanden sind.
							
							<h3>Wo kommt Histamin vor?</h3>
							Histamin kommt nicht nur in unserem Körper vor, sondern auch in allen anderen Tieren und Pflanzen. Wenn wir uns an Brennnesseln brennen, so wird der Juckreiz zum einen von unserem eigenen Histamin ausgelöst, aber auch von Histamin, das von der Brennnessel in unsere Haut injiziert wurde. Da die Brennnessel viel Histamin enthält, ist z.B. Brennnesseltee bei Histaminintoleranz nicht verträglich. Nur wenige frische Nahrungsmittel enthalten so viel Histamin, dass es bei einer Histaminintoleranz zu Problemen kommt. Hierzu gehören neben der Brennnessel z.B. Tomaten oder Auberginen (Melanzani). Eine Datenbank mit verträglichen und unverträglichen Nahrungsmitteln findest du auf der Webseite nmidb.de.
							
							Histamin wird aber auch durch mikrobiologischen Abbau gebildet, d.h. es gibt gewisse Bakterien (nicht alle!) die Histamin produzieren. Hierbei wird die Aminosäure Histidin, die ebenfalls in allen biologischen Organismen vorkommt, zu Histamin abgebaut. Das heißt Nahrungsmittel, die mit solchen Histamin bildenden Mikroorganismen in Berührung kommen, die z.B. reifender Käse, enthalten deutlich mehr Histamin (und andere biogene Amine). Somit gibt es leider doch viele Nahrungsmittel, die bei Histaminintoleranz nicht verträglich sind.
							</article>
                        </header>
                        
                     </article>
                     </form>
                  </div>
                  <!-- #main -->
               </div>
               <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
               <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.11.2.min.js"><\/script>')</script>
               <script src="${pageContext.request.contextPath}/js/main.js"></script>
               <script src="../${pageContext.request.contextPath}/js/main.js"></script>
               <!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->
               <script>
                  (function(b,o,i,l,e,r){b.GoogleAnalyticsObject=l;b[l]||(b[l]=
                  function(){(b[l].q=b[l].q||[]).push(arguments)});b[l].l=+new Date;
                  e=o.createElement(i);r=o.getElementsByTagName(i)[0];
                  e.src='//www.google-analytics.com/analytics.js';
                  r.parentNode.insertBefore(e,r)}(window,document,'script','ga'));
                  ga('create','UA-XXXXX-X','auto');ga('send','pageview');
               </script>
               </form>
            </body>
         </html>