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
		
		qna.put(1, new QnA("Gibt es Labortests zur Diagnose der Histaminunverträglichkeit?", "Nein, bis heute fehlen geeignete Labortests zur Diagnose einer Histaminunverträglichkeit. Angebotene Tests zur Messung des Diaminoxidasespiegels im Blut oder auch die Bestimmung von Histamin im Blutplasma oder Urin sind wenig aussagekräftig und werden nicht empfohlen. Das gleiche gilt für den sogenannten Histamin 50 Prick-Test. Da diese Tests keine verlässlichen Aussagen zulassen, werden sie auch meistens nicht von den Krankenkassen erstattet."));
		qna.put(2, new QnA("Kann man das Histaminintoleranzsyndrom mit Medikamenten behandeln?", "Wenn eine konsequente Ernährungsumstellung nicht möglich ist, können Medikamente eingenommen werden, die an die Histaminrezeptoren H1 und H2 binden und diese blockieren. Zu diesen als Antihistaminika bezeichneten Medikamenten zählen zum Beispiel Ceterizin und Cimetidin. Auch Medikamente, die die Aktivität der Diaminooxidase (DAO) fördern, haben in Studien gute Effektivität in der Behandlung des HIS gezeigt (z.B. DAOSiN). Wie wichtig die DAO für den Menschen ist zeigen Studien, bei denen die DAO in ihrer Funktion gezielt eingeschränkt wird. Ist die DAO nicht mehr aktiv und kommt es zu einer Aufnahme grosser Mengen Histamin, kann es zu lebensbedrohlichen Körperreaktionen kommen, wie zum Beispiel Blutdruckabfall, Luftnot und Schock."));
		qna.put(3, new QnA("Wie funktioniert DAOSiN?", "Durch den Verzehr der DAOSiN-Kapsel vor dem Essen wird die DAO-Menge im Dünndarm und somit die Fähigkeit zum Histaminabbau durch die natürliche DAO erhöht. Dadurch kann ein ausreichender Abbau von Histamin aus Lebensmitteln im Verdauungstrakt erzielt werden."));
		qna.put(4, new QnA("Können histaminhaltige Lebensmittel wie z.B. Essig oder Wein durch Zugabe von Daosin histaminfrei gemacht werden, schon in der Flasche, noch bevor man sie konsumiert?", "Nein, das funktioniert nicht. Das in Daosin enthaltene Enzym Diamin oxidase arbeitet nur unter basischen Bedin gungen, wie sie im Darm herrschen. In saurem Milieu (z.B. in Essig) ist das Enzym inaktiv oder wird sogar denaturiert (zerstört). Die in der Daosin-Kapsel enthaltenen Kügelchen sind ausserdem mit einem säure resistenten überzug versehen, als Schutz vor der Magen säure während der Magen passage. Diese Schutz schicht löst sich erst im basischen Milieu des Darms auf. Das Enzym Diamin oxidase ist zudem ein empfind liches Molekül, dessen Aktivität durch die Anwesen heit vieler anderer Stoffe wie z.B. Alkohol gestört werden kann (DAO-Hemmer)."));
		qna.put(5, new QnA("Was sind Histaminliberatoren?", "Das sind Stoffe, welche die körpereigenen Histaminspeicherzellen (Mastzellen, basophile Granulazyten etc.) dazu bringen können, körpereigenes Histamin und andere Entzündungsmediatoren freizusetzen. Auf diese Weise können sogar absolut histaminfreie Lebensmittel eine Histaminreaktion im Körper verursachen."));
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
	
