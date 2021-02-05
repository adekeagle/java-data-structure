public class BookStack {

    Book[] books = new Book[10];
    private int sptr = 0;

    public boolean empty(){
        return sptr == 0;
    }

    public Book top(){
        if(!empty()){
            return books[sptr - 1];
        }
        return null;
    }

    public void push(Book book){
        if(sptr != books.length) {
            books[sptr++] = book;
        }
    }

    public void pop(){
        if(sptr > 0){
            sptr--;
        }
    }
}
