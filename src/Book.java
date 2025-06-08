public class Book {

    String title;
    int releaseYear;
    Author author;
    int pages;

    public Book(String title, int releaseYear, Author author, int pages){
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

//    возвращающий ответ на вопрос, является ли книга большой;
    public boolean isBig(int pages){
        return pages > 500;
    }

//    возвращающий ответ на вопрос, содержится ли в описании книги имя и фамилия втора
    public boolean matches(String word){
        boolean authorName = author.name.contains(word);
        boolean authorSurname = author.surname.contains(word);
        boolean titleOfTheBook = title.contains(word);

        // При совпадении хотябы в одном поле вернем true
        return  (authorName | authorSurname | titleOfTheBook);

    }

//    возвращающий оценку стоимости книги
    public int estimatePrice(){
// Цена книги рассчитывается как 3 рубля за страницу, умноженное на квадратный корень из рейтинга,
// после чего округлённое вниз, но не меньше 250 рублей. Для вычисления квадратного корня воспользуйтесь
// командой Math.sqrt, округления вниз -
// Math.floor с приведением к целому числу - (int) Math.floor(...).

        return (int) Math.floor(pages * 3 * Math.sqrt(author.rating));
    }

}
//Разработайте класс Book, объект которого содержит в себе следующую информацию:
//
//title - название книги;
//releaseYear - год выпуска;
//author - автор;
//pages - количество страниц.
//И методы:
//
//isBig(), возвращающий ответ на вопрос, является ли книга большой; книгу считаем большой,
// если в ней больше 500 страниц (какой тип данных лучше всего подходит для ответа "да" или "нет"?);

//matches(String word), возвращающий ответ на вопрос, содержится ли в описании книги
// (названии или в имени автора) переданное параметром слово (для этого используйте метод contains,
// который есть у объектов класса String);
// метод потенциально может использоваться для поиска по книгам в будущем
// (какой тип данных лучше всего подходит для ответа "да" или "нет"?);

//estimatePrice(), возвращающий оценку стоимости книги (целое число в рублях)
//по формуле 3 рубля за страницу, но не меньше 250 рублей.
//У книги должен быть один конструктор, позволяющий заполнить все поля создаваемого
// объекта из одноимённых параметров.
//
//Продемонстрируйте работоспособность созданного класса в Main.
