import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String surname;

        Author author = new Author("Steven", "Pinker", 6);

        Book book = new Book("The Better Angels of Our Nature", 2011, author, 832);
        if(book.isBig(book.pages)) {
            System.out.println("Книга " + book.title + " большая");
        } else {
            System.out.println("Книга " + book.title + " не большая");
        }

        //Попросим пользователя ввести имя и фамилию автора для проверки
        System.out.println("Ведите имя автора:");
        name = scanner.nextLine();
        System.out.println("Введите фамилию автора:");
        surname = scanner.nextLine();
        if(book.matches(name, surname)){
            System.out.println("Это имя и фамилия автора этой книги");
        }
        //Выведем стоимость книги
        System.out.println("Книга будет стоить: " + book.estimatePrice());
    }
}