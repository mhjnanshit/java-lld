package LibraryManagement;

public class Main {
    public static void main(String[] args){
        Library library = new Library();

        Book book1 = new Book("1A","Animals","Anshit");
        Book book2 = new Book("1B","Birds","Rahul");
        Book book3 = new Book("1C","Humans","Vijay");
        Book book4 = new Book("1D","Plants","Naman");
        Book book5 = new Book("1E","Insects","Radhika");

        Member member1 = new Member("M1","Ashish");
        Member member2 = new Member("M2","Neetu");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        library.addMember(member1);
        library.addMember(member2);

        library.displayAllBooks();
        String m1Id = member1.getMemberId();
        String m2Id = member2.getMemberId();

        String b1Id = book1.getBookId();

        System.out.println(library.borrowBook(m1Id,b1Id));
        System.out.println(library.borrowBook(m2Id,b1Id));
        System.out.println(library.returnBook(b1Id));
        System.out.println(library.borrowBook(m2Id,b1Id));

        library.displayOnlyAvailableBooks();
    }
}
