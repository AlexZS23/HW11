public class Guitar implements Instrument {

//    Гитара содержит переменные класса количество Струн

    private int countOfStrings;

    public Guitar(int countOfStrings) {
        this.countOfStrings = countOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с количеством струн " + countOfStrings);
    }
}
