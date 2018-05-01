package suche.updater;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import datenbank.container.LebensmittelDaten;
import datenbank.container.Zugriffsskala;
import datenbank.dao.DbQuery;

public class ZugriffUpdaterTest {
  
  DbQuery query = new DbQuery();
  ZugriffUpdater updater;
  
  @Before
  public void setUp() throws Exception {
    LebensmittelDaten lebensmittel = new LebensmittelDaten(query.getResult("select * from lebensmittelDaten where lindex = 1001"));
    updater = new ZugriffUpdater(lebensmittel);
  }
  
  @Test
  public void testAnpassenZugriff() {
    assertNotNull(updater.getZugriff());
  }
  
  /*
   * erstellt ein Zugriffsobjekt aus der zu testenden Klasse und vergleicht, ob Wert wirklich angepasst wurde
   */
  @Test
  public void testUpdateAZugriffe() {
    String selectSql = "select * from zugriffsskala where zindex = " + updater.getZugriff().getZindex();
    Zugriffsskala zugriff = new Zugriffsskala(query.getResult(selectSql));
    assertEquals(updater.getZugriff().getAzugriffe(), zugriff.getAzugriffe());
  }
  
}
