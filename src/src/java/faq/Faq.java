package faq;

import java.util.HashMap;
import java.util.Map.Entry;


/**
 * Class for filling up the questions and answers
 * @author Marko Despotovic
 * @version 13.04.2018 
 *
 */
public class Faq {
	// HashMap for all QnAs
	private HashMap<Integer, QnA> qna;
	
	{
		qna = new HashMap<>();
		
		qna.put(1, new QnA("Gibt es Labortests zur Diagnose der Histaminunvertraeglichkeit?", "Nein, bis heute fehlen geeignete Labortests zur Diagnose einer Histaminunvertraeglichkeit. Angebotene Tests zur Messung des Diaminoxidasespiegels im Blut oder auch die Bestimmung von Histamin im Blutplasma oder Urin sind wenig aussagekraeftig und werden nicht empfohlen. Das gleiche gilt fuer den sogenannten Histamin 50 Prick-Test. Da diese Tests keine verlaesslichen Aussagen zulassen, werden sie auch meistens nicht von den Krankenkassen erstattet."));
		qna.put(2, new QnA("Kann man das Histaminintoleranzsyndrom mit Medikamenten behandeln?", "Wenn eine konsequente Ernaehrungsumstellung nicht moeglich ist, koennen Medikamente eingenommen werden, die an die Histaminrezeptoren H1 und H2 binden und diese blockieren. Zu diesen als Antihistaminika bezeichneten Medikamenten zaehlen zum Beispiel Ceterizin und Cimetidin. Auch Medikamente, die die Aktivitaet der Diaminooxidase (DAO) foerdern, haben in Studien gute Effektivitaet in der Behandlung des HIS gezeigt (z.B. DAOSiN). Wie wichtig die DAO fuer den Menschen ist zeigen Studien, bei denen die DAO in ihrer Funktion gezielt eingeschraenkt wird. Ist die DAO nicht mehr aktiv und kommt es zu einer Aufnahme grosser Mengen Histamin, kann es zu lebensbedrohlichen Koerperreaktionen kommen, wie zum Beispiel Blutdruckabfall, Luftnot und Schock."));
		qna.put(3, new QnA("Wie funktioniert DAOSiN?", "Durch den Verzehr der DAOSiN-Kapsel vor dem Essen wird die DAO-Menge im Duenndarm und somit die Faehigkeit zum Histaminabbau durch die natuerliche DAO erhoeht. Dadurch kann ein ausreichender Abbau von Histamin aus Lebensmitteln im Verdauungstrakt erzielt werden."));
		qna.put(4, new QnA("Koennen histaminhaltige Lebensmittel wie z.B. Essig oder Wein durch Zugabe von Daosin histaminfrei gemacht werden, schon in der Flasche, noch bevor man sie konsumiert?", "Nein, das funktioniert nicht. Das in Daosin enthaltene Enzym Diamin oxidase arbeitet nur unter basischen Bedin gungen, wie sie im Darm herrschen. In saurem Milieu (z.B. in Essig) ist das Enzym inaktiv oder wird sogar denaturiert (zerstoert). Die in der Daosin-Kapsel enthaltenen Kuegelchen sind ausserdem mit einem saeure resistenten Ueberzug versehen, als Schutz vor der Magen saeure waehrend der Magen passage. Diese Schutz schicht loest sich erst im basischen Milieu des Darms auf. Das Enzym Diamin oxidase ist zudem ein empfind liches Molekuel, dessen Aktivitaet durch die Anwesen heit vieler anderer Stoffe wie z.B. Alkohol gestoert werden kann (DAO-Hemmer)."));
		qna.put(5, new QnA("Was sind Histaminliberatoren?", "Das sind Stoffe, welche die koerpereigenen Histaminspeicherzellen (Mastzellen, basophile Granulazyten etc.) dazu bringen koennen, koerpereigenes Histamin und andere Entzuendungsmediatoren freizusetzen. Auf diese Weise koennen sogar absolut histaminfreie Lebensmittel eine Histaminreaktion im Koerper verursachen."));
	}
	
	// Gives back the HashMap
	public HashMap<Integer, QnA> getQnA() {
		return qna;
	}
	
	// Gives back question or answer
	public QnA getQuestionOrAnswer(int key) {
		return qna.get(key);
	}
	
	// Gives back question with its answer
	public String getQuestionAndAnswer(int key) {
		QnA questionAnswwer = qna.get(key); 
		return questionAnswwer.getQuestion() + ": " + questionAnswwer.getAnswer();
	}
	
	@Override
	// Lists all the QnAs
	public String toString() {
		String result = "";
		for(Entry<Integer, QnA> entry : qna.entrySet()) {
			result += entry.getValue().getQuestion() + ": " + entry.getValue().getAnswer() + "<BR>";
		}
		return result;
	}
	
	
}
	
