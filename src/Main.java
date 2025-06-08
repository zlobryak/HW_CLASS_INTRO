import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;

        Author author = new Author("Steven", "Pinker", 6);

        Book book = new Book("The Better Angels of Our Nature", 2011, author, 832);
        if(book.isBig(book.pages)) {
            System.out.println("Книга " + book.title + " большая");
        } else {
            System.out.println("Книга " + book.title + " не большая");
        }

        //Попросим пользователя ввести слово для поиска
        System.out.println("Ведите слово для поиска автора:");
        word = scanner.nextLine();
        if (book.matches(word)) {
            System.out.println("Описание содержит это слово");
        } else {
            System.out.println("Описание не содержит это слово");
        }

        //Выведем стоимость книги
        System.out.println("Книга будет стоить: " + book.estimatePrice());
    }
}