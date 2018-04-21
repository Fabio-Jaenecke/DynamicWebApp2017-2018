# ps_17_gruppe23
Gruppe 23 PSIT 2017/18 Repository
Anleitung zum Starten des Projektes:

folgende Programme sollten bereits installiert sein:
- Eclipse Version java-oxygen
- Apache Tomcat Server 8.5

folgende jar-Dateien müssen noch installiert werden, um das Projekt auszuführen
- commons-io-2.6.jar (https://commons.apache.org/proper/commons-io/download_io.cgi)
- jstl-1.2.jar (http://tomcat.apache.org/download-taglibs.cgi)
- jsoup-1.11.2.jar (https://jsoup.org/download)
- h2-1.4.196.jar (http://www.h2database.com/html/download.html)

diese jar-Dateien dienen dazu, die Datenbank zu starten und html-Seiten nach XML zu konvertieren.

die 4-jar Dateien im Projektverzeichnis im Eclipse ins lib-Verzeichnis einbinden.
dann in den Properties (Rechtsklick aufs Projekt) unter dem Menü java-build-path bei der Kategorie libraries die 4 jar-Dateien ergänzen. 
zusätzlich unter dem Menü Deployment Assembly den lib-Ordner als Source ergänzen.
