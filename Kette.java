public class Kette {

    private int anzahl;                   // Anzahl der Lampen in der Kette
    private Lampe[] kette;                // Feld mit den Lampen
    private String farbe;    // Farbe der naechsten Lampe

    /**
     *   Konstruktor initialisiert Feld für 10 Lampen,
     *   setzt die Farbe der ersten Lampe auf rot.
     */
    public Kette() {
        this.kette = new Lampe[10];        
        this.anzahl = 0;
        this.farbe = "rot";        
    }

    /**
     *   Fuegt wenn moeglich neue Lampe ans Ende der Kette.
     *   Aendert Farbe der naechsten Lampe.
     */
    public void hintenEinfuegen() {
        if(this.anzahl < 10) {
            /**
             *  Neue Lampe nur dann, wenn noch keine 10 Lampen vorhanden sind.
             */
            this.kette[anzahl] = new Lampe(10 + this.anzahl * 10, 100, farbe);
            this.anzahl = this.anzahl + 1;
            /**
             *  Farbwechsel
             */
            if (this.farbe == "rot") {
                this.farbe = "weiss";
            } else {
                this.farbe = "rot";
            }
        }
    }

    /**
     *  Entfernt wenn moeglich Lampe vom Beginn der Kette.
     */
    public void vorneEntfernen() {
        if(this.anzahl > 0) {
            int i;
            /**
             *  Lampe muss ausgeschaltet werden
             */
            this.kette[0].setzeSichtbar(false);
            /**
             *  Jetzt restlichen Lampen nach vorn rücken, 
             *  visuell und im Feld.
             */
            for(i=0; i<this.anzahl-1; i=i+1) {
                this.kette[i] = this.kette[i+1];
                this.kette[i].setzeMittelpunkt(10+i*10,100);
            }
            this.kette[i] = null;
            this.anzahl = this.anzahl - 1;
        }
    }

    /**
     *  Entfernt Lampe an angegebener Position
     *  
     *  @param position Index der Lampe
     */
    public void entfernePosition(int position) {
        if (position < this.anzahl) {
            int i;
            this.kette[position].setzeSichtbar(false);
            for(i=position; i<this.anzahl-1; i=i+1) {
                this.kette[i] = this.kette[i+1];
                this.kette[i].setzeMittelpunkt(10+i*10,100);
            }
            this.kette[i] = null;
            this.anzahl = this.anzahl - 1;
        }
    }

    /**
     *  Entfernt Lampen der angegebene  Farbe
     *  
     *  @param farbe Lampenfarbe
     */
    public void entferneFarbe(String farbe) {
        if (this.anzahl > 0) {
            for (int i=0; i<this.anzahl; i=i+1) {
                if (this.kette[i].nenneFarbe() == farbe) {
                    this.entfernePosition(i);
                    i = i - 1;
                }
            }            
        }
    }

}