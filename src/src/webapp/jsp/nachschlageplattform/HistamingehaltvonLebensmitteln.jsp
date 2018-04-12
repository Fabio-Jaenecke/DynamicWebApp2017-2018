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
               <link rel="apple-touch-icon" href="../../imgs/apple-touch-icon.png">
               <link rel="stylesheet" href="../../css/normalize.min.css">
               <link rel="stylesheet" href="../../css/Main/main.css">
               <link rel="shortcut icon" href="../../imgs/favicon.ico" type="image/x-icon">
               <link rel="icon" href="../../imgs/favicon.ico" type="image/x-icon">
               <link rel="apple-touch-icon" href="../imgs/apple-touch-icon.png">
			   <link rel="stylesheet" href="../css/normalize.min.css">
			   <link rel="stylesheet" href="../css/Main/main.css">
			   <link rel="stylesheet" href="../css/Rest/lebensmittelkategorie.css">
			   <link rel="shortcut icon" href="../imgs/favicon.ico" type="image/x-icon">
			   <link rel="icon" href="../imgs/favicon.ico" type="image/x-icon">
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
				    content: "/\00a0";
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
                  <header class="wrapper clearfix">
                     <nav>
                        <span onclick="openNav()">&#9776;<span class="menutext">&nbsp;Menu</span></span><span class="title">&nbsp;&nbsp;&nbsp;&nbsp;Home</span>
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
                     <a class="suchicon" href="${pageContext.request.contextPath}/suchfilter/">&#8981;</a>
                  </header>
               </div>
               <div class="main-container">
                  <div class="main wrapper clearfix">
                  	<form method="get" action="${pageContext.request.contextPath}/home/">
                     <article>
                     <input type="submit" value="Zurück" onchange="history.back()">
                     	<ul class="breadcrumb">
                     	<li><a href="${pageContext.request.contextPath}/home/">Home</a></li>
						 <li>Histamingehalt von Lebensmitteln</li>
						</ul>
						                        	
                        <header>
                           <h2>Histamingehalt von Lebensmitteln</h2>
                           
                    
                       		<article style="min-width: 100%">
							Welche Nahrungsmittel kann man bei Histaminintoleranz essen, welche nicht? Das ist nicht so einfach, da man verschiedene Faktoren berücksichtigen muss. Zum einen des Histamingehalt, der ja stark schwanken kann, zum anderen den Gehalt an biogenen Aminen, Histidin, anderen Stoffe die die DAO blockieren können oder den Reifegrad. Im Folgenden haben wir einige dieser Faktoren für dich erklärt, sowie eine Tabelle mit Histaminwerten erstellt, die auch alle anderen Faktoren bestmöglich berücksichtigt.
							
							Springe sofort zu: 
							<a href="${pageContext.request.contextPath}/lebensmittel/">Tabelle mit Lebensmitteln</a> 
							<a href="${pageContext.request.contextPath}/lebensmittelsuche/">Suche von Lebensmitteln</a>
							
							<h3>Histamingehalt: Grundlagen</h3>
							In diesem Artikel wollen wir dir einige Kategorien von Nahrungs- und Lebensmitteln vorstellen, die histaminarm, histaminreich oder histaminfreisetzend sind. Beachte bei der Bewertung deiner Nahrungsmittel bitte folgendes Beispiel:
							
							<h4>Beispiel: Histamingehalt von Fisch</h4>
							Fangfrischer Fisch (weißer Fisch) - histaminarm
							derselbe Fisch ungekühlt gelagert zwei Stunden später: histaminhaltig
							derselbe Fisch ungekühlt bis wenig gekühlt einen Tag später: stark histaminhaltig
							
							Noch ein wichtiger Hinweis: Auch hier gilt, dass es individuelle Grenzen zu beachten gilt!
							
							<h4>Unterschiedliche Histamingehalte in unterschiedlichen Tabellen?</h4>
							Wir werden oft gefragt warum die Histamin-Angaben in verschiedenen Tabellen unterschiedliche Werte haben. Die Antwort ist recht einfach: Der Histamingehalt ist - anders als zum Beispiel der Laktosegehalt - starken natürlichen Schwankungen (Lagerung, Alter, ...) unterworfen. D.h. die Werte in solchen Tabellen können nur als Anhaltspunkte gelten. Mittlerweile ist man generell von der Angabe von Histaminwerten abgegangen. Sinnvoller sind Listen mit Verträglichkeitsangaben die die üblichen Verzehrmengen und Zubereitungsarten, sowie Faktoren wie biogene Amine oder andere relevante Inhaltsstoffe berücksichtigen. Wir haben so eine Histamin-Verträglichkeits-Liste erstmalig erstellt.
							
							<h3>Histaminarme Lebensmittel - meistens verträglich bei Histaminintoleranz</h3>
							<ul>
								<li>Frischkäse: junger Gouda, Frischkäse, Butterkäse, Mascarpone, Mozzarella, Ricotta</li>
								<li>pasteurisierte Milch</li>
								<li>frisches Fleisch (frisch, gekühlt, gefroren) - mit Schweinefleisch haben einige Betroffene Probleme</li>
								<li>Fangfrischer Fisch</li>
								<li>Frisches Obst: Melone, Heidelbeeren, Preiselbeeren, Litchi, Mango, Khaki, Rhababer, Kirschen, Blaubeeren, Johannisbeeren, Aprikosen, Äpfel</li>
								<li>Frisches Gemüse: Grüner Salat, Kohlsorten, Rote Beete, Kürbis, Zwiebel, Radieschen, Rettich, Rapunzel, Paprika, Karotten, Brokkoli, Kartoffeln, Gurke, Lauch, Zucchini, Mais, Spargel, Knoblauch</li>
								<li>Getreide/Beilagen: Reis, Mais, Dinkel, Quinoa, Amaranth, Hafer, Hirse, Kastanien</li>
								<li>Teigwaren: Dinkel-, Mais-, Reisnudeln, hefefreies Roggenbrot, Mais-Reis-Knäckebrote, Reiswaffeln</li>
								<li>Milchersatz: Reis-, Hafer-, Kokosmilch - individuell testen!</li>
								<li>alle frischen, nicht zitrushaltigen und/oder tomatenhaltigen Obstsäfte, alle Gemüsesäfte (außer Sauerkraut)</li>
								<li>Kräutertees</li>
								<li>Eigelb (Eiweiß/Eiklar ist schlecht verträglich)</li>
								<li>Essig: Alkoholessig, Branntweinessig, Weingeistessig, Apfelesseig, Essigessenz - (Balsamico und Weinessige sind nicht verträglich!)</li>
							</ul>
							<h3>Nahrungsmittel die nicht verträglich sind</h3>
							<ul>
								<li>Frischkäse: junger Gouda, Frischkäse, Butterkäse, Mascarpone, Mozzarella, Ricotta</li>
								<li>pasteurisierte Milch</li>
								<li>frisches Fleisch (frisch, gekühlt, gefroren) - mit Schweinefleisch haben einige Betroffene Probleme</li>
								<li>Fangfrischer Fisch</li>
								<li>Frisches Obst: Melone, Heidelbeeren, Preiselbeeren, Litchi, Mango, Khaki, Rhababer, Kirschen, Blaubeeren, Johannisbeeren, Aprikosen, Äpfel</li>
								<li>Frisches Gemüse: Grüner Salat, Kohlsorten, Rote Beete, Kürbis, Zwiebel, Radieschen, Rettich, Rapunzel, Paprika, Karotten, Brokkoli, Kartoffeln, Gurke, Lauch, Zucchini, Mais, Spargel, Knoblauch</li>
								<li>Getreide/Beilagen: Reis, Mais, Dinkel, Quinoa, Amaranth, Hafer, Hirse, Kastanien</li>
								<li>Teigwaren: Dinkel-, Mais-, Reisnudeln, hefefreies Roggenbrot, Mais-Reis-Knäckebrote, Reiswaffeln</li>
								<li>Milchersatz: Reis-, Hafer-, Kokosmilch - individuell testen!</li>
								<li>alle frischen, nicht zitrushaltigen und/oder tomatenhaltigen Obstsäfte, alle Gemüsesäfte (außer Sauerkraut)</li>
								<li>Kräutertees</li>
								<li>Eigelb (Eiweiß/Eiklar ist schlecht verträglich)</li>
								<li>Essig: Alkoholessig, Branntweinessig, Weingeistessig, Apfelesseig, Essigessenz - (Balsamico und Weinessige sind nicht verträglich!)</li>
							</ul>
							
							<h3>Nahrungsmittel, die Histamin freisetzen (Histaminliberatoren) - nicht verträglich</h3>
							<ul>
								<li>Hülsenfrüchte</li>
								<li>Erdbeeren</li>
								<li>Zitrusfrüchte (werden teilweise gut vertragen)</li>
								<li>Tomaten</li>
								<li>Nüsse</li>
								<li>Ananas</li>
								<li>Kakao und Schokolade</li>
							</ul>
							<h3>Diaminoxidase blockierende Nahrungsmittel - nicht verträglich</h3>
							<ul>
								<li>Alkohol</li>
								<li>Kakao</li>
								<li>schwarzer Tee, grüner Tee, Mate Tee</li>
								<li>Energy Drinks</li>
							</ul>
							<h3>Spezialfall: Weizen</h3>
							Viele Betroffene berichten davon, dass die Weizen schlecht vertragen, Roggen und Dinkel hingegen gut. Dieses Phänomen ist bisher nicht geklärt. Es gibt aber seit neuestem eine Vermutung, wie die schweizer Histaminseite SIGHI berichtet.
							
							Man kann zwischen Hochleistungs-Weizensorten und alten Sorten (Emmer, Einkorn, Urdinkel) unterscheiden.  Letzere sind meist gut, erstere oft - und nicht nur für Histaminintolerante - schlecht verträglich. Die Ursache hierfür vermutet man derzeit einerseits im Gluten bzw. Gliadin, andererseits könnte ein ein Insektengift, welches in die neuen Sorten hineingezüchtet wurde (ATI-Weizen), verantwortlich sein. Wir bleiben dran und berichten über neue Erkenntnisse hierüber!
							
							<em>Du solltest auf jeden Fall mit einem Ernährungsberater/Diätologen eine genaue Diät erarbeiten!</em>
							
							<h3>Histidingehalte und Hefe bei Histaminintoleranz</h3>	
							Histidin wird im Körper zu Histamin abgebaut. Dies geschieht mit dem Enzym L-Histidin-Decarboxylase (HDC). Dieses Enzym kommt auch in Bakterien und in Hefe vor. Somit sind Lebensmittel mit hohem Histidingehalt mit einiger Vorsicht zu genießen. Vor allem, wenn sie länger ungekühlt aufbewahrt werden (bakterielle Zersetzung) oder sie durch Hefen verarbeitet wurden! Dieses Thema ist sehr komplex, denn es gibt unglaublich viele verschiedene Hefen. So wird zum Beispiel zur Produktion von Bordeaux-Wein eine spezielle Bordeauxhefe verwendet. Die verschiedenen Hefen produzieren verschiedene Mengen an Histamin. Dadurch ist eine Normierung dieser Werte fast unmöglich!
							
							Wichtig ist aber: Hoher Gehalt an Histidin geht oft einher mit schlechter Verträglichkeit bei Histaminintoleranz. Vor allem bei verarbeiteten Lebensmitteln.
							
							Oft liest man, dass Hefe bei Histaminintoleranz schlecht verträglich ist. Das stimmt nicht. Die Hefe an sich ist an sich histaminarm, aber sie baut das Histidin zu Histamin ab. Weizenmehl hat mit 450 mg/100g relativ viel Histidin, das durch die Verarbeitung der Hefe dann auch viel Histamin ergibt. Daher sollte man bei Produkten denen Hefe zugesetzt wurde vorsichtig sein.
							</article>
                        </header>
                        
                     </article>
                     </form>
                  </div>
                  <!-- #main -->
               </div>
               <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
               <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.11.2.min.js"><\/script>')</script>
               <script src="../js/main.js"></script>
               <script src="../../js/main.js"></script>
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