import java.util.*;
class Book{
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity){
        this.id= id;
        this.name =name;
        this.author= author;
        this.publisher = publisher;
        this.quantity = quantity;

    }
}

public class ArrayListExample{
    public static void main(String[] args) {
        List<Book> list= new ArrayList <Book>();
        Book a1=new Book(1,"Book1","Suraj","aaa",8);
        Book a2=new Book(2,"Book2","Prashil","bbb",10);
        Book a3=new Book(3,"Book3","Sai","ccc",20);
        list.add(a1);
        list.add(a2);
        list.add(a3);
        Iterator itr= list.iterator();
        while(itr.hasNext()){
            Book st=(Book)itr.next();
            System.out.println(itr.next());
        }

    }
}