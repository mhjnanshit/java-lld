package LibraryManagement;

import java.util.*;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();
    
    public boolean addBook(Book book){
        books.add(book);
        return true;
    }

    public boolean addMember(Member member){
        members.add(member);
        return true;
    }

    public boolean removeBookById(String bookId){
        return books.removeIf(book -> book.getBookId().equals(bookId));
    }

    public boolean removeMemberById(String memberId){
        return members.removeIf(member -> member.getMemberId().equals(memberId));
    }

    public Book getBookById(String bookId){
        for(int i = 0; i < books.size(); i++){
            if(books.get(i).getBookId() == bookId){
                return books.get(i);
            }
        }
        return null;
    }

    public Member getMemberById(String memberId){
        for(int i = 0; i < members.size(); i++){
            if(members.get(i).getMemberId() == memberId){
                return members.get(i);
            }
        }
        return null;
    }

    public void displayAllBooks(){
        for(int i = 0; i < books.size(); i++){
            System.out.println(books.get(i).toString());
        }
    }

    public void displayOnlyAvailableBooks(){
        for(int i = 0; i < books.size(); i++){
            if(books.get(i).checkAvailability() == true){
                System.out.println(books.get(i).toString());
            }
        }
    }

    public boolean borrowBook(String memberId, String bookId){
        // Check if member exists
        Member member = getMemberById(memberId);
        if(member == null){
            return false;
        }

        // Check if book exist and is available to borrow
        Book book = getBookById(bookId);
        if(book == null || book.checkAvailability() == false){
            return false;
        }
        book.markBorrowed();
        return true;
    }

    public boolean returnBook(String bookId){
        // Check if book exist and is already borrowed
        Book book = getBookById(bookId);
        if(book == null || book.checkAvailability() == true){
            return false;
        }

        book.markReturned();
        return true;
    }
}
