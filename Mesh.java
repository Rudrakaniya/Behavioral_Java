//                      Java        Date = 02/03/2020

//import java.util.*;

// class OuterCLass{

//     static int outer_x = 10;
//     int outer_y = 20;

//     private static int outer_private = 30;

//     static class StaticNestedClass {

//         void display(){
//             System.out.println("outer_x= " + outer_x);

//             System.out.println("outer_private = "+ outer_private);

//             OuterCLass obj = new OuterClass();

//                System.out.println("outer_y = "+ obj.outer_y);

//         }
//     }

// } 

// class main{

//     public static void main(String[] a){
//        int  a =90;

//         System.out.println(a++ + ++a);

//     }

// }























//------------------------------------------     Java      -------      Date = 04/03/2020       -------------------------------------        





//                  Nested Classes in Java

//                  





// class OuterClass 
// {  
//     // static member 
//     static int outer_x = 10; 
      
//     // instance(non-static) member 
//     int outer_y = 20; 
      
//     // private member 
//     private static int outer_private = 30; 
      
//     // static nested class 
//     static class StaticNestedClass 
//     { 
//         void display() 
//         { 
//             // can access static member of outer class 
//             System.out.println("outer_x = " + outer_x); 
              
//             // can access display private static member of outer class 
//             System.out.println("outer_private = " + outer_private); 
              
//             // The following statement will give compilation error 
//             // as static nested class cannot directly access non-static membera 
//             // System.out.println("outer_y = " + outer_y); 
          
//         } 
//     } 
// } 
  
// // Driver class 
// public class StaticNestedClassDemo 
// { 
//     public static void main(String[] args) 
//     { 
//         // accessing a static nested class 
//         OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass(); 
          
//         nestedObject.display(); 
          
//     } 
// } 



















//                                  Anonymous Class 

// Anonymous classes enable us to declare and instantiate a class at the same time 
//They are local classes except that they do not have a name.



// import java.util.*;

// abstract class A{
//     abstract void getA();
//     abstract void getB();
//     int x = 4;
    
//     public void getAge(){
//         System.out.println("Hello ");
//     }
    
// }

// class Main{

//     public static void main(String [] args){

//         A obj = new A(){

//             public void getA(){
//                 System.out.println("Hello " + x);
//                 x = x+5;
//             }
        
//             public void getB(){
//                 System.out.println("Okey " + x);
//             }
//         };
//         obj.getA();
//         obj.getB();
//     }
  
// }











//                                        Interfaces



// public interface My {
    
//     int x =10;                      // by default public static and final 

//     void demo();                    // by default public and abstract 

//     default void show();            // by deafult 

//     static void test{}
// }











// import java.util.*;

// interface Data{
//     int a = 5;
//     int b = 10;

//     void add();
//     void sub();
//     void print(String str);
// }

// class A implements Data{
//     public void add(){
//         System.out.println("\n\nSum of a and b is = " + (a+b));

//     }
//     public void sub(){
//         System.out.println("Sun of a and b is = " + (a-b));
//     }

  
// }



// class B implements Data{
//     public void add(){
//         System.out.println("inctrmented Sum of a and b is = " + (a+b+1));

//     }
//     public void sub(){
//         System.out.println("Incremented Sun of a and b is = " + (a-b+1));
//     }

//     public void print(String str){
//         System.out.println("Your name is = " + str + "  And my name is = Rudra \n\n" );
//     }
// }

// class Main{

//     public static void main(String[] args){

//         System.out.println("Enter your name = ");

//         Scanner in = new Scanner(System.in);

//         String str = in.nextLine();

//         A obj1 = new A();
//         obj1.add();
//         obj1.sub();
//         obj1.print(str);


//         B obj2 = new B();
//         obj2.add();
//         obj2.sub();
//         obj2.print(str);

//     }
// }








//                            Anonymous Interfaces


// import java.util.*;

// interface Message{
//     void msg();
// }

// class AnonymousInterface{
//     public static void main(String[] args){
//         Message obj = new Message(){
//             public void msg(){
//                 System.out.println("Hello ");
//             }
//         };
//         obj.msg();
//     }
// }









// import java.util.*;

// interface Message{
//     void msg();
// }
// class Main{
//     void demo(Message ob){
//         System.out.println("Demo Called");
//     }

//     public static void main(String[] args){
//         Main o = new Main();

//         Message obj = new Message(){
//             public void msg(){
//                 System.out.println("hello");
//             }
//         };
//         o.demo(obj);
//         obj.msg();
//     }
// }
