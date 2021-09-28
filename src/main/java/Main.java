import java.util.Set;
import java.util.TreeSet;


/*
asd

Kitap Sıralayıcı


Book isminde bir sınıf tasarlayınız.
Bu sınıf Comparable interface'den kalıtım alıp "compareTo" metodunu override ediniz.
Bu metodun içinde kitabı A'dan Z'ye isme göre sıralayan kodu yazınız.
Bu sınıftan 5 tane nesne oluşturun ve nesneleri Set tipinde bir yapısında saklayınız.
Sonra ikinci kez Set tipinden bir veri yapısı kullanın ve kitapları sayfa sayısına göre sıralamasını sağlayınız.

Book sınıfı kitap ismi, sayfa sayısı, yazarın ismi, yayın tarihi değişkenlerinden oluşmaktadır.


 */
public class Main {
    public static void main(String[] args) {
        Set<Book> books = new TreeSet<>();//Set of books that will contain books ordered by name (ASC)
        books.add(new Book("The Happy Alien", 260));
        books.add(new Book("A New Form", 540));
        books.add(new Book("Bad Surprise", 80));
        books.add(new Book("Whispers of a Ghost", 244));
        books.add(new Book("Ridin’ To Roscoe", 430));

        for (Book b : books){
            System.out.println(b);
        }
        System.out.println("*----------------*");

        Set<Book> orderedByPages = new TreeSet<>(new OrderByPagesAmount());//Set of books that will contain books ordered by pages (ASC)
        orderedByPages.addAll(books);//All of the books inserted to the orderedByPages set
        for (Book b : orderedByPages){//printing books by order
            System.out.println(b);
        }

    }
}
