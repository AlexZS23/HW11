public class Drum implements Instrument {

    //    Барабан содержит переменные размер.

    private int millimetersOfDrum = 970;

    public Drum(int millimetersOfDrum) {
        this.millimetersOfDrum = millimetersOfDrum;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан размером " + millimetersOfDrum + " мм.");
    }
}
