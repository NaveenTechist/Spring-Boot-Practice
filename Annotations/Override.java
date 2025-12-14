 class A {
     
     void show(){
         System.out.println("A class");
     }
 }
 
  class B extends A {
      @Override
     void show(){
         System.out.println("B class");
     }
 }


public class Main{
    public static void main(String a[]){
        B b = new B();
        b.show();
    }
} 
