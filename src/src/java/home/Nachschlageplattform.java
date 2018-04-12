package home;

public class Nachschlageplattform {
		private int zaehler = 1;

		/**
		 * @param zaehler
		 */
		public Nachschlageplattform() {
		}
		
		public void knoepfedruckZaehlen() {
            zaehler ++;
		}

		/**
		 * @return the zaehler
		 */
		public int getZaehler() {
			return zaehler;
		}

		/**
		 * @param zaehler the zaehler to set
		 */
		public void setZaehler(int zaehler) {
			this.zaehler = zaehler;
		}
		
		
		
}
