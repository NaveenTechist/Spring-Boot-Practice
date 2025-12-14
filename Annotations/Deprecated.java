class Book {
    @Deprecated // Hint to dev don't use old methods but it executed
    void showOld(){
        System.out.println("Old One");
    }
    
    void showNew(){
        System.out.println("New One");
    }
}

public class Main{
    public static void main(String a[]){
        Book b = new Book();
        b.showOld();
        b.showNew();
    }
} 
