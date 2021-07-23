class LibraryModalities {
    private final String [] book;
    private  int num_book=0;
    LibraryModalities()
    {
        this.book=new String[15];
    }
    public void addBook(String book) {
        this.book[num_book] = book;
        num_book++;
        System.out.println(num_book+") "+book+" Added Successfully !");
    }
    public void showBooks()
    {
        int counter=0;
        System.out.println("\nThe available books are : ");
        for(String ignored : this.book)
            if (ignored != null) {
                ++counter;
                System.out.println(counter + ") " + ignored);
            }
    }
    public void issueBook(String book)
    {
        for(int i=0;i<this.getNum_book();++i)
        {
            if(this.book[i].equalsIgnoreCase(book))
            {
                System.out.println("\n" + this.book[i] + "Issued Successfully !");
                this.book[i]=null;
                return;
            }
        }
        System.out.println("Book not found !");
    }
    public void returnBook(String book)
    {
        for(int i=0;i<this.getNum_book();++i)
        {
            if(this.book[i]==null)
            {
                this.book[i]=book;
                System.out.println(this.book[i] + "\nReturned Successfully !");
                return;
            }
        }
        this.addBook(book);
    }
    public int getNum_book() {
        return num_book;
    }
}

public class Library {
    public static void main(String [] args)
    {
        LibraryModalities l1 = new LibraryModalities();
        l1.addBook("1984 by George Orwell.");
        l1.addBook("The Theory of Everything by SW Hawking.");
        l1.addBook("Parallel Worlds by Michio Kaku.");
        l1.addBook("Adventures of Sherlock Holmes by Sir Arthur Conan Doyle.");
        l1.addBook("Pride and Prejudice by Jane Austen.");
        l1.addBook("Attitude is Everything by Jeff Keller.");
        l1.addBook("Surely You are Joking Mr. Feynman! by RP Feynman.");
        l1.addBook("Tales from Shakespeare by Charles and Mary Lamb.");
        l1.addBook("The Fault in Our Stars by John Greene.");
        l1.addBook("Looking for Alaska by John Greene.");

        l1.showBooks();
        l1.issueBook("Looking for Alaska by John Greene.");
        l1.showBooks();
        l1.returnBook("Looking for Alaska by John Greene.");
        l1.showBooks();
    }
}