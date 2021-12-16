public class AppPrintable {

    public static void main(String[] args) {

        Book book1 = new Book("Остров сокровищ");
        Book book2 = new Book("Колобок");
        Magazine magazine1 = new Magazine("Супер-журнал");
        Magazine magazine2 = new Magazine("Журнал для рыбаков");

        Printable[] printables = {book1, book2, magazine1, magazine2};

        for (Printable printable: printables) {
            printable.print();
        }
    }
}
