import java.util.Comparator;

public class OrderByPagesAmount implements Comparator<Book> {


    @Override
    public int compare(Book compared, Book compareTo) {
        return compared.getPages() > compareTo.getPages() ? -1 : 1;
    }
}
