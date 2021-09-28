public class Book implements Comparable<Book>{
    private String bookName;
    private int pages;

    public Book(String bookName, int pages){
        this.bookName = bookName;
        this.pages = pages;
    }

    public String getBookName(){
        return this.bookName;
    }

    public int getPages(){
        return this.pages;
    }


    @Override
    public int compareTo(Book comparedBook) {
        return this.bookName.compareTo(comparedBook.getBookName());
        //return this.bookName.compareTo(comparedBook.getBookName()) < 0 ? -1 : 1;
    }

    @Override
    public String toString(){
        return this.bookName + " : " + this.pages;
    }
}
