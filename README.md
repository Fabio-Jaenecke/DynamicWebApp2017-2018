# ps_17_gruppe23
Gruppe 23 PSIT 2017/18 Repository
Anleitung zum Starten des Projektes:

folgende Programme sollten bereits installiert sein:
- Eclipse Version java-oxygen
- Apache Tomcat Server 8.5
- JUnit 4
- JDK ab 1.8

folgende jar-Dateien müssen noch installiert werden, um das Projekt auszuführen
- commons-io-2.6.jar (https://commons.apache.org/proper/commons-io/download_io.cgi)
- jstl-1.2.jar (http://tomcat.apache.org/download-taglibs.cgi)
- jsoup-1.11.2.jar (https://jsoup.org/download)
- h2-1.4.196.jar (http://www.h2database.com/html/download.html)

diese jar-Dateien dienen dazu, die Datenbank zu starten und html-Seiten nach XML zu konvertieren.

die 4-jar Dateien im Projektverzeichnis im Eclipse ins lib-Verzeichnis einbinden.
dann im Build Path (Properties > Java Build Path > Libraries) die 4 jar-Dateien hinzufügen. 

### Häufige Build-Probleme:
_(Diese Einstellungen sollten bereits im Repository entsprechend angepasst sein. Je nach Aufsetzung des Projektes in Eclipse, kann es dabei aber zu Problemen mit lokalen Eclipse-Einstellungen kommen)._

1. _Context Root_

Das Projekt-Root befinded sich in ```https://github.engineering.zhaw.ch/ps-17-bacn-sckt/ps_17_gruppe23/tree/master/src``` 

und nicht in ```https://github.engineering.zhaw.ch/ps-17-bacn-sckt/ps_17_gruppe23/tree/master/```


2. _Deplyoment Assembly_

Das Web Deployment Assembly (Properties > Deployment Assembly) muss die folgenden vier Einträge haben

Source| Deploy Path
------|-------------
/lib  | /WEB-INF/lib
/src/webapp |  /
/src/java | /WEB-INF/classes
/src/webapp  | /WEB-INF/classes  

Sollte diese Einstellung in Eclipse nicht möglich sein, muss das XML im Order:```(ProjectWorkspace) > .settings org.eclipse.wst.common.component``` manuell auf diese Werte angepasst werden.

3. _Build Path_

Der Build Path (Properties > Java Build Path > Source) muss die folgenden zwei Einträge haben:

* PSIT2/src/java
* PSIT2/src/webapp

Sollte diese Einstellung in Eclipse nicht möglich sein, muss das XML:```(ProjectWorkspace) > .classpath``` manuell auf diese Werte angepasst werden.
