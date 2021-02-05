import java.util.Scanner;

public class BookStackMainClass {
    public static void main(String[] args) {

        BookStack bookStack = new BookStack();
        Scanner sc = new Scanner(System.in, "UTF-8");

        int option;
        Book book;
        do {
            System.out.println("---- Books Stack ----");
            System.out.println("1 - is empty");
            System.out.println("2 - top book");
            System.out.println("3 - push book");
            System.out.println("4 - pop book");
            System.out.println("0 - stop");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println(bookStack.empty());
                    break;
                case 2:
                    System.out.println(bookStack.top());
                    break;
                case 3:
                    System.out.println("Tytuł książki : ");
                    String title = sc.nextLine();

                    System.out.println("Autor: ");
                    String author = sc.nextLine();
                    book = new Book(title, author);
                    bookStack.push(book);
                    break;
                case 4:
                    bookStack.pop();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Something goes wrong!!!");
                    break;
            }
        }while (option != 0);
    }
}
