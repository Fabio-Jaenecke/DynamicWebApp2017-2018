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
               <link rel="apple-touch-icon" href="imgs/apple-touch-icon.png">
               <link rel="stylesheet" href="css/normalize.min.css">
               <link rel="stylesheet" href="css/Main/main.css">
               <link rel="shortcut icon" href="imgs/favicon.ico" type="image/x-icon">
               <link rel="icon" href="imgs/favicon.ico" type="image/x-icon">
               <link rel="apple-touch-icon" href="../imgs/apple-touch-icon.png">
			   <link rel="stylesheet" href="../css/normalize.min.css">
			   <link rel="stylesheet" href="../css/Main/main.css">
			   <link rel="stylesheet" href="../css/Rest/lebensmittelkategorie.css">
			   <link rel="shortcut icon" href="../imgs/favicon.ico" type="image/x-icon">
			   <link rel="icon" href="../imgs/favicon.ico" type="image/x-icon">
               <script src="js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
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
                     <article>
                        <header>
                           <h2>Was ist Histamin-Intoleranz?</h2>
                           <p>Histaminintoleranz (Histaminose, HistaminunvertrÃÂ¤glichkeit) ist die UnvertrÃÂ¤glichkeit von stark histaminhaltigen Nahrungsmitteln beziehungsweise die UnfÃÂ¤higkeit des menschlichen KÃÂ¶rpers, das aufgenommene Histamin in ausreichendem MaÃÂe abzubauen. In diesem Artikel gibt es einige Grundinformationen.
                           </p>
                           <a href="#">Mehr</a>
                        </header>
                        <section>
                           <h2>Histamingehalt von Lebensmitteln</h2>
                           <p>Welche Nahrungsmittel sind vertrÃÂ¤glich, welche sind bei Histaminintoleranz nicht vertrÃÂ¤glich? FÃÂ¼r Betroffene ist es schwer, einzukaufen.
                           </p>
                           <a href="#">Mehr</a>
                        </section>
                        <section>
                           <h2>Symptome der Histamin-Intoleranz</h2>
                           <p>Die Symptome der Histaminintoleranz sind sehr vielfÃÂ¤ltig und teilweise schwer von Symptomen anderer, hÃÂ¤ufigerer Krankheiten zu unterscheiden. Sie machen sich meist einige Minuten bis wenige Stunden nach dem Konsum histaminreicher beziehungsweise histaminfreisetzender oder DAO-blockierender Nahrungsmittel bemerkbar.
                           </p>
                           <a href="#">Mehr</a>
                        </section>
                        <section>
                           <h2>Diagnose der Histamin-Intoleranz</h2>
                           <p> Wir wird die Histaminintoleranz diagnostiziert? Was ist dabei zu beachten? Ein Leitfaden fÃÂ¼r ÃÂrzte und Betroffene.
                           </p>
                           <a href="#">Mehr</a>
                        </section>
                        <section>
                           <h2>Behandlung der Histamin-Intoleranz</h2>
                           <p> Wie kann man die Histaminintoleranz behandeln? Was kann man tun, welche Medikamente gibt es? Dieser Artikel klÃÂ¤rt dich ÃÂ¼ber diese wichtigen Fragen auf.
                           </p>
                           <a href="#">Mehr</a>
                        </section>
                        <footer>
                           <h3>StÃÂ¶bern Sie weiter</h3>
                           <ul>
                              <li><a href="index.html">Home</a></li>
                              <li><a href="HTML/lebensmittelkategorie.html">Lebensmittel</a></li>
                              <li><a href="HTML/faq.html">FAQ</a></li>
                              <li><a href="#">Mahlzeitsassistent</a></li>
                              <li><a href="#">Beliebtheitsskala</a></li>
                              <li><a href="#">Rezepte</a></li>
                              <li><a href="HTML/kontaktformular.html">Kontakt</a></li>
                              <li><a href="HTML/Suchfilter.html">Suche</a></li>
                           </ul>
                        </footer>
                     </article>
                     <aside>
                        <h3>Beliebte Lebensmittel (Kategorie ÃÂ¼bergreifend)</h3>
                        <table class="table_beliebte_lebensmittel">
                           <thead>
                              <tr>
                                 <th rowspan="2">Platz</th>
                                 <th rowspan="2">Lebensmittel</th>
                                 <th colspan="2">VertrÃÂ¤glichkeit</th>
                                 <th rowspan="2">Zugriffe</th>
                              </tr>
                              <tr>
                                 <th>KP</th>
                                 <th>DE</th>
                              </tr>
                           </thead>
                           <tbody>
                              <tr>
                                 <td>1</td>
                                 <td>Kartoffeln</td>
                                 <td>gut</td>
                                 <td>gut</td>
                                 <td>100'000</td>
                              </tr>
                              <tr>
                                 <td>2</td>
                                 <td>Brokkoli</td>
                                 <td>gut</td>
                                 <td>gut</td>
                                 <td>80'000</td>
                              </tr>
                              <tr>
                                 <td>3</td>
                                 <td>Rindfleisch</td>
                                 <td>gut</td>
                                 <td>gut</td>
                                 <td>70'000</td>
                              </tr>
                              <tr>
                                 <td>4</td>
                                 <td>Mango</td>
                                 <td>mittel</td>
                                 <td>gut</td>
                                 <td>60'000</td>
                              </tr>
                              <tr>
                                 <td>5</td>
                                 <td>Kokosmilch</td>
                                 <td>mittel</td>
                                 <td>mittel</td>
                                 <td>50'000</td>
                              </tr>
                              <tr>
                                 <td>6</td>
                                 <td>Bananen</td>
                                 <td>schlecht</td>
                                 <td>mittel</td>
                                 <td>40'000</td>
                              </tr>
                              <tr>
                                 <td>7</td>
                                 <td>Sojaprodukte</td>
                                 <td>schlecht</td>
                                 <td>mittel</td>
                                 <td>30'000</td>
                              </tr>
                              <tr>
                                 <td>8</td>
                                 <td>Bier</td>
                                 <td>schlecht</td>
                                 <td>schlecht</td>
                                 <td>20'000</td>
                              </tr>
                              <tr>
                                 <td>9</td>
                                 <td>Eiweiss</td>
                                 <td>schlecht</td>
                                 <td>schlecht</td>
                                 <td>10'000</td>
                              </tr>
                           </tbody>
                        </table>
                     </aside>
                  </div>
                  <!-- #main -->
               </div>
               <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
               <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.11.2.min.js"><\/script>')</script>
               <script src="js/main.js"></script>
               <script src="../js/main.js"></script>
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