public class Trumpet implements Instrument{

//    Труба содержит переменные диаметр.

    private double millimetersOfTrumpet = 3.2;

    public Trumpet(double millimetersOfTrumpet) {
        this.millimetersOfTrumpet = millimetersOfTrumpet;
    }

    @Override
    public void play() {
        System.out.println("Играет труба, которая имеет диаметр " + millimetersOfTrumpet + " мм.");
    }
}
