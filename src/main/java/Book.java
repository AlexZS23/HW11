public class Book implements Printable {

//    Определить класс Book, реализующий интерфейс Printable.
//    Создать статический метод printBooks(Printable[] printable) в
//    классе Book, который выводит на консоль названия только книг. Используем оператор instanceof.

    private String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public void print() {
        System.out.println("Ваша книга " + getBookName());
    }

    public static void printBooks(Printable[] printable){

        for (Printable printables: printable) {
            if (printables instanceof Book){
                printables.print();
            }
        }
    }

    public static void main(String[] args) {
        Printable book1 = new Book("Первая книга");
        Printable book2 = new Book("Вторая книга");
        Printable[] totalBooks = {book1, book2};

        printBooks(totalBooks);
    }
}
