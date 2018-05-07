<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
    <link rel="apple-touch-icon" href="${pageContext.request.contextPath}/imgs/apple-touch-icon.png">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/normalize.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/Main/main.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/Rest/lebensmittelkategorie.css">
    <link rel="shortcut icon" href="${pageContext.request.contextPath}/imgs/favicon.ico" type="image/x-icon">
    <link rel="icon" href="${pageContext.request.contextPath}/imgs/favicon.ico" type="image/x-icon">
    <script src="js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/zugriffsskala.js"></script>
    <style>
    /* Specific for section 'stoebern sie weiter' */
        ul {
            display: inline;
            list-style-type: none;
            position: relative;
        }

        li {
            list-style-type: none;
            float: left;
            margin-left: 2px;
            margin-right: 2px;
            padding-top: 10px;
        }
    </style>
</head>

<body>
    <!--[if lt IE 8]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
            <![endif]-->
    <div class="header-container">
        <header class="wrapper clearfix">
            <div class="flex-grid-thirds">
                <div class="col menugrid">
                    <span onclick="openNav()">&#9776;
                        <span class="menutext">&nbsp;Menu</span>
                </div>
                <div class="col titlegrid">Home</div>
                <div class="col suchgrid">
                    <a class="suchicon" href="${pageContext.request.contextPath}/suchfilter/">&#8981;</a>
                </div>
            </div>
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
            <article>
                <header>
                    <h2>Was ist Histamin-Intoleranz?</h2>
                    <p>Histaminintoleranz (Histaminose, Histaminunverträglichkeit) ist die Unverträglichkeit von stark histaminhaltigen
                        Nahrungsmitteln beziehungsweise die Unfähigkeit des menschlichen Körpers, das aufgenommene Histamin
                        in ausreichendem Mauee abzubauen. In diesem Artikel gibt es einige Grundinformationen.
                    </p>
                    <a class="link mehr" href="${pageContext.request.contextPath}/jsp/nachschlageplattform/WasIstHistaminIntoleranz.jsp">Mehr</a>
                </header>
                <section>
                    <h2>Histamingehalt von Lebensmitteln</h2>
                    <p>Welche Nahrungsmittel sind verträglich, welche sind bei Histaminintoleranz nicht verträglich? Fuer
                        Betroffene ist es schwer, einzukaufen.
                    </p>
                    <a class="link mehr" href="${pageContext.request.contextPath}/jsp/nachschlageplattform/HistamingehaltvonLebensmitteln.jsp">Mehr</a>
                </section>
                <section>
                    <h2>Symptome der Histamin-Intoleranz</h2>
                    <p>Die Symptome der Histaminintoleranz sind sehr vielfältig und teilweise schwer von Symptomen anderer,
                        häufigerer Krankheiten zu unterscheiden. Sie machen sich meist einige Minuten bis wenige Stunden
                        nach dem Konsum histaminreicher beziehungsweise histaminfreisetzender oder DAO-blockierender
                        Nahrungsmittel bemerkbar.
                    </p>
                    <a class="link mehr" href="${pageContext.request.contextPath}/jsp/nachschlageplattform/SymptomederHistaminIntoleranz.jsp">Mehr</a>
                </section>
                <section>
                    <h2>Diagnose der Histamin-Intoleranz</h2>
                    <p> Wir wird die Histaminintoleranz diagnostiziert? Was ist dabei zu beachten? Ein Leitfaden fuer ärzte
                        und Betroffene.
                    </p>
                    <a class="link mehr" href="${pageContext.request.contextPath}/jsp/nachschlageplattform/DiagnosederHistaminIntoleranz.jsp">Mehr</a>
                </section>
                <section>
                    <h2>Was ist Histamin?</h2>
                    <p> Histamin ist ein sogenanntes biogenes Amin und dient im Körper unter anderem als wichtiger Botenstoff.
                    </p>
                    <a class="link mehr" href="${pageContext.request.contextPath}/jsp/nachschlageplattform/WasistHistamin.jsp">Mehr</a>
                </section>
                <footer>
                    <h3>Stöbern Sie weiter</h3>
                    <ul>
                        <li>
                            <a class="link" href="${pageContext.request.contextPath}/home/">Home</a>
                        </li>
                        <li>
                            <a class="link" href="${pageContext.request.contextPath}/lebensmittel/">Lebensmittel</a>
                        </li>
                        <li>
                            <a class="link" href="${pageContext.request.contextPath}/mahlzeitassistent/">Mahlzeitsassistent</a>
                        </li>
                        <li>
                            <a class="link" href="${pageContext.request.contextPath}/rezepte/">Rezepte</a>
                        </li>
                        <li>
                            <a class="link" href="${pageContext.request.contextPath}/zugriffsskala/">Zugriffsskala</a>
                        </li>
                        <li>
                            <a class="link" href="${pageContext.request.contextPath}/lebensmittelsuche/">Suche</a>
                        </li>
                        <li>
                            <a class="link" href="${pageContext.request.contextPath}/faq/">FAQ</a>
                        </li>
                    </ul>
                </footer>
            </article>
            <aside>
                <section class="zugriffsskala">
                    <a href="${pageContext.request.contextPath}/zugriffsskala/">
                        <h3>Häufige Zugriffe</h3>
                        <form method="get" action="${pageContext.request.contextPath}/lebensmittelsuche/">
                            <div>
                                <%@ page import="container.*"%>
                                <%@ page import="datenbank.container.*"%>
                                <%  ZugriffsskalaManager tabelle = new ZugriffsskalaManager();
                                    tabelle.searchForString();
                                %>
                                <table id='zugriffsskala' class='table_beliebte_lebensmittel' style='width:100%'>
                                    <thead>
                                        <tr>
                                            <th>Platzierung</th>
                                            <th>Lebensmittel</th>
                                            <th>Karenzphase</th>
                                            <th>Dauerernährung</th>
                                        </tr>
                                    </thead>
                                    <tbody class='meineTabelle'>
                                        <%
                                            for(ZugriffsManager zugriff : tabelle.getTabelle()) {
                                                out.println("<tr data-platzierung='"+zugriff.getPlatzierung()+"'>");
                                                out.println("<td>");
                                                out.println(zugriff.getPlatzierung()); 
                                                out.println("</td>");
                                                out.println("<td>");
                                                out.println(zugriff.getLname());
                                                out.println("</td>");
                                                out.println("<td>");
                                                out.println(zugriff.getKarenzphase());
                                                out.println("</td>");
                                                out.println("<td>");
                                                out.println(zugriff.getDauerernaehrung());
                                                out.println("</td>");
                                                out.println("</tr>");
                                            }
                                        %>
                                    </tbody>
                                    <tfoot>
                                        <tr>
                                            <th>Platzierung</th>
                                            <th>Lebensmittel</th>
                                            <th>Karenzphase</th>
                                            <th>Dauerernährung</th>
                                        </tr>
                                    </tfoot>
                                </table>
                            </div>
                        </form>
                    </a>
                </section>
            </aside>
        </div>
        <!-- #main -->
    </div>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.11.2.min.js"><\/script>')</script>
    <script src="js/main.js"></script>
    <script src="${pageContext.request.contextPath}/js/main.js"></script>
    <!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->
    <script>
            (function (b, o, i, l, e, r) {
                b.GoogleAnalyticsObject = l; b[l] || (b[l] =
                    function () { (b[l].q = b[l].q || []).push(arguments) }); b[l].l = +new Date;
                e = o.createElement(i); r = o.getElementsByTagName(i)[0];
                e.src = '//www.google-analytics.com/analytics.js';
                r.parentNode.insertBefore(e, r)
            }(window, document, 'script', 'ga'));
        ga('create', 'UA-XXXXX-X', 'auto'); ga('send', 'pageview');
    </script>
    </form>
</body>

</html>