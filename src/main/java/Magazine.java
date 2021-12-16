public class Magazine implements Printable {

//    Определить класс Magazine, реализующий интерфейс Printable.
//    Создать массив типа Printable, который будет содержать книги и журналы.
//    В цикле пройти по массиву и вызвать метод print() для каждого объекта.
//    Создать статический метод printMagazines(Printable[] printable)
//    в классе Magazine, который выводит на консоль названия только журналов. Используем оператор instanceof.

    private String magazineName;

    public Magazine(String magazineName) {
        this.magazineName = magazineName;
    }

    public String getMagazineName() {
        return magazineName;
    }

    public void setMagazineName(String magazineName) {
        this.magazineName = magazineName;
    }

    @Override
    public void print() {
        System.out.println("Ваш журнал " + getMagazineName());
    }

    public static void printMagazines(Printable[] printable){
        for (Printable printables: printable) {
            if (printables instanceof Magazine){
                printables.print();
            }
        }
    }

    public static void main(String[] args) {
        Printable magazine1 = new Magazine("Журнал №1");
        Printable magazine2 = new Magazine("Журнал №2");
        Printable[] totalMagzines = {magazine1, magazine2};

        printMagazines(totalMagzines);
    }



}

