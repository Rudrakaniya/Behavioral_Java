// import java.util.*;

// class main{

//     public static void main(String[] args){
      

//     int[] arr ;

//     arr = new int[3];

//     Scanner in = new Scanner(System.in);
//     for(int i = 0 ; i < 3; ++i){
//         System.out.println("Enter the "+(i+1)+"th value of array = ");
//         arr[i] = in.nextInt();
//     }

//     int max = arr[0];
//     for(int i = 0 ; i < 3; ++i){
//         if(arr[i] > max)
//             max = arr[i];

//     }

//     System.out.println("SO the max value of the three num is = " + max);

//     }
// }








//    JACKED array in java 







// import java.util.*;

// class main{

//     public static void main(String[] args){

//         int arr[] = {1,2,3,4,5,6,7,8,9,10};
//         int sum=0;

//         for(int i : arr){
//             System.out.println(i+ " ");
//             sum += i;
//         }

//         System.out.println("the sum of the array is = "+ sum);



//     }

// }







// import java.util.*;

// class main{

//     public enum colo {
//         red(10),green(20),blue(30);
//         int x;
//         colo(int a){
//             x = a;
//         }

//         int get(){

//             return x;
//         }
//     }

//     public static void main(String[] args){

//         colo arr[] = colo.values();

//         for(colo i : arr){
//             System.out.println(i + " value of  = " + i.get());
//         }


//     }



// }













// import java.util.*;

// class main{

//     public static void main(String[] args){

//         int arr[][];
//         int row;
//         Scanner in  = new Scanner(System.in);

//         System.out.println("Enter the number of rows = ");
//         row = in.nextInt();

//         arr = new int[row][];

//         for( int i = 0 ; i < row ; ++i){
//             int col;
//             System.out.println("Enter the number of colums for " + (i+1) + "th row = ");
//             col = in.nextInt();
            
//             arr[i] = new int[col];

//             System.out.println("Now enter the vlaue of each element");

//             for(int j = 0 ; j < col; ++j){
//                 int temp = in.nextInt();
//                 arr[i][j] = temp;
//             }
//         }

//         syste
        



        












//         System.out.println("The velues inside the array is = ");
    
//         for(int[] i : arr){
//             for(int j : i ){
//                 System.out.print(j+" ");      
//             }
//             System.out.println(" ");
//         }

//     }
// }







// programs where lots of manipulation in the array is needed.

// ArrayList inherits AbstractList class and implements List interface.

//      ArrayList 


// import java.util.*;

// class main{

//     public static void main(String[] args){

//         int size;

//         System.out.println("Enter the the size of the ArrayList = ");
//         Scanner in = new Scanner(System.in);

//         size = in.nextInt();

//         ArrayList<Integer> arr = new ArrayList<Integer> (size);

//         for(int i = 0 ; i < size ;++i){
//             int temp = in.nextInt();
//             arr.add(temp);
//         }

//         System.out.println(arr);
//     }







// }





// import java.util.*;

// class main{

//     main(){
//         System.out.println("Default constructor");
//     }

//     main(int a){
//         this();
//         System.out.println("This is the value of x = " + a);
//     }

//     main(int a, int b){
//         this(5);
//         int temp =a*b;
//         System.out.println("This is the value of x * y = "+ temp);
//     }

//     public static void main(String[] args){

//         main obj = new main(6, 10);



//     }



// }


//::::::::::::::::::::::::::::::::::::::::::::::::::::   DATE 05/02/2020  :::::::::::::::::::::::::::::::::::::::::::::::



// import java.util.*;

// class Main  {

//     String name;

//     Main(){
//         this("");
//         System.out.println("No-argument constructor of base class");

//     }
//     Main(String name){
//         this.name =name;
//         System.out.println("Calling parametrised constructor of base class ");
//     }

// }

// class Derived extends Main{

//     Derived(){
//         System.out.println("No-argument constructor of derived");
//     }

//     Derived(String name){

//         //super keyword calls the constructor of the parent class.

//         super(name);
//         System.out.println("Calling the parametrised constructor of the Derived class");
//     }

//     public static void main(String[] args){

//         Derived obj = new Derived("test");


//     }
// }


//--------------------------------------------


// import java.util.*;

// class Main{

//     int i = 0 ; 

//     private static MySingleton ob;
//     private MySingleton(){}

//     private static MySingleton getInstance()
//     {
//         if(ob == null){
//             ob = new MySingleton();
//         }
//         return ob;
//     }

//     void showMessage(){
//         i = i+5;
//         System.out.println("Hello World!! " + i);
//     }




// }




//--------------------------------------------

//--------------------------------------------//--------------------------------------------//--------------------------------------------
//                        DATE  :=     10/02/2020      Topics = Strings





// import java.util.*;

// class main{
//     public static void main(String[] args){

//         String a = "Java";
//         String b = "Java";


//         String obj1 = new String("Java");
//         String obj2 = new String("Java");

        
        
//         if(a == b){
//             System.out.println("True");
//         }else 
//             System.out.println("False");

        
//         if(obj1 == obj2){
//             System.out.println("True");
//         }else
//             System.out.println("False");


//     }
// }




// import java.util.*;

// class main{

//     public static void main(String[] args){

//         String str = "have-fun-in-the-life-of-no-gun";

//         String [] s= str.split("-",0);

//         // we have three options for splitting 
//         // positive, negtive and zero; 

//         System.out.println(s.length);

//         for(String x: s)
//             System.out.print(x);

        
//         String joinString = String.join("-","have","fun");
//         System.out.println(joinString);





//     }



// }



//////              Test java practice

// import java.util.Scanner;
    
// class Banking {
//     static int menu() {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("1.Deposit\n2.Credit\n3.GetBalance\n4.Exit\nEnter your choice:");
//         return scan.nextInt();
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Create Account:\nEnter your name:");
//         String name = scan.next();
//         System.out.println("Enter your id:");
//         int id = scan.nextInt();
//         System.out.println("Enter your opening balance:");
//         float balance = scan.nextFloat();
//         int choice;
//         Account a = new Account(id, balance, name);
//         do{
//             choice=menu();
//             switch(choice){
//             case 1: {
//                     System.out.println("Enter deposit amount:");
//                     float amount=scan.nextFloat();
//                     a.deposit(amount);
//                     break;
//                 }
//                 case 2:{
//                     System.out.println("Enter credit amount:");
//                     float amount=scan.nextFloat();
//                     a.credit(amount);
//                     break;
//                 }
//                 case 3:{
//                     System.out.println("Current Balance:" + a.getBalance());
//                     break;
//                 }
//                 case 4:{
//                     System.exit(0);
//                 }
//             }
//         } while (choice != 4);
//     }
// }

// class Account {
//     int aId;
//     float balance;
//     String name;
//     Account(int aId,float balance,String name)
//     {
//         this.aId = aId;
//         this.name = name;
//         this.balance = balance;
//     }

//     float getBalance() {
//         return this.balance;
//     }

//     void deposit(float amount) {
//         this.balance = this.balance + amount;
//     }

//     void credit(float amount) {
//         if (amount > this.getBalance())
//         {
//             System.out.println("no money gaich");
//         }
//         else
//             this.balance = this.balance - amount;
//     }
// }











// import java.util.*;

// class menu{

//     String name;
//     int choice;
//     int price;

//     Scanner nn = new Scanner(System.in);
//     menu(String name){
//         this.name = name;
//     }

//     void start(){
//         int temp;
//         System.out.println("Enter 1 for fish Rs 250.");
//         temp = nn.nextInt();
//         if(temp  == 1){
//             int tt;
//             System.out.println("Okey \n How many you want to order = ");
//             tt = nn.nextInt();
//             price += 250 * tt;
            
//         }
//         System.out.println("Enter 1 to order again and 2 to get the bill.");
//         temp = nn.nextInt();
//         if(temp == 1){
//             firstMenu();
//         }
//     }
//     void meal(){
//         int temp;
//         System.out.println("Enter 1 for Rajma-chawal Rs 50.");
//         temp = nn.nextInt();
//         if(temp  == 1){
//             int tt;
//             System.out.println("Okey \n How many you want to order = ");
//             tt = nn.nextInt();
//             price += 50 * tt;
            
//         }
//         System.out.println("Enter 1 to order again and 2 to get the bill.");
//         temp = nn.nextInt();
//         if(temp == 1){
//             firstMenu();
//         }

//     }
//     void deserts(){
//         int temp;
//         System.out.println("Enter 1 for ice-cream Rs 100.");
//         temp = nn.nextInt();
//         if(temp  == 1){
//             int tt;
//             System.out.println("Okey \n How many you want to order = ");
//             tt = nn.nextInt();
//             price += 100 * tt;
            
//         }
//         System.out.println("Enter 1 to order again and 2 to get the bill.");
//         temp = nn.nextInt();
//         if(temp == 1){
//             firstMenu();
//         }

//     }
//     void drinks(){
//         int temp;
//         System.out.println("Enter 1 for beer Rs 350.");
//         temp = nn.nextInt();
//         if(temp  == 1){
//             int tt;
//             System.out.println("Okey \n How many you want to order = ");
//             tt = nn.nextInt();
//             price += 350 * tt;
            
//         }
//         System.out.println("Enter 1 to order again and 2 to get the bill.");
//         temp = nn.nextInt();
//         if(temp == 1){
//             firstMenu();
//         }

//     }

//     void firstMenu(){
//         System.out.println("Welclome Mr. "+ this.name +", what whould you like to order :- ");
//         System.out.println("Enter 1 for Statters ");
//         System.out.println("Enter 2 for Meal");
//         System.out.println("Enter 3 for Deserts");
//         System.out.println("Enter 4 for Drinks");

//         System.out.println("Enter your choice :- ");
//         choice = nn.nextInt();
//         switch(choice){
//             case 1:
//                 start();
//                 break;
//             case 2:
//                 meal();
//                 break;
//             case 3:
//                 deserts();
//                 break;
//             case 4:
//                 drinks();
//                 break;

//         }
//     }
// }
// class main{
//     public static void main(String[] args){
//         Scanner in = new Scanner(System.in);
        
//         String name;

//         System.out.println("Welcome to the restorent ");
//         System.out.println(" ");
//         System.out.println("Please enter your name = ");
//         name = in.nextLine();


//         menu obj = new menu(name);

//         obj.firstMenu();

//         System.out.println("Okey Mr."+name+", Your total bill is "+ obj.price);
        
//     }
// }








class Animal{

    void eat(){
        System.out.println("eating...");
    }

}
class Dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }
}

class TestInheritanceSingle{


    
} 












//    **********************************  After MT     **********************************









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
