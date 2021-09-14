public class Lampe extends KREIS {

    /**
     *  Konstruktor fuer neue Lampe.
     *  
     *  @param x  x-Koordinate Lampe
     *  @param y  y-Koordinate Lampe
     *  @param farbe Farbe der Lampe
     */
    public Lampe(int x, int y, String farbe) {
        super(5);
        super.setzeMittelpunkt(x, y);
        super.setzeFarbe(farbe);
    }
  
}
