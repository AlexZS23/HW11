public class AppInstrument {

//    Создать массив типа Инструмент, содержащий инструменты разного типа.
//    В цикле вызвать метод play() для каждого инструмента, который должен выводить строку
//    "Играет такой-то инструмент, с такими-то характеристиками".

    public static void main(String[] args) {
        Instrument guitar = new Guitar(6);
        Instrument drum = new Drum(970);
        Instrument trumpet = new Trumpet(3.2);
        Instrument[] allInstruments = {guitar, drum, trumpet};

        for (Instrument instuments: allInstruments) {
            instuments.play();

        }
    }


}
