// class car{
//     String name;
//     int model;

//     public void printModel(){
//         System.out.println(this.model);
//     }
// }

// public class main{
//     public static void main(String[] args) {
//         car car1 = new car();
//         car1.model=2002;
//         car1.name= "honda";
//         car car2 = new car();
//         car2.model=2021;

//         car1.printModel();
//         car2.printModel();
//     }
// }


// class Student{
//     String name;
//     int rollno;

//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.rollno);
//     }
// }
// public class main{
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name="hamza";
//         s1.rollno=19;

//         s1.printInfo();
//     }
// }

// class Book{
//     String title;
//     String author;
//     int price;

//     public void printInfo(){
//         System.out.println(this.title);
//         System.out.println(this.author);
//         System.out.println(this.price);
//     }
// }
// public class main{
//     public static void main(String[] args) {
//         Book b1 = new Book();
//         b1.title="kill";
//         b1.author="noone";
//         b1.price=1000;

//         Book b2 = new Book();
//         b2.title="life";
//         b2.author="you";
//         b2.price=10040;

//         Book b3 = new Book();
//         b3.title="peace";
//         b3.author="me";
//         b3.price=3000;

//         b1.printInfo();
//         b2.printInfo();
//         b3.printInfo();
//     }
// }


// class Rectangle{
//     int length;
//     int width;

//     public int calcArea(){
//         return length*width;
//     }
//     public int calcPerimeter(){
//         return 2*(length+width);
//     }
//     public void display(){
//         System.out.println(this.length);
//         System.out.println(this.width);
//         System.out.println(this.calcArea());
//         System.out.println(this.calcPerimeter());
// }}
// public class main{
//     public static void main(String args[]){
//         Rectangle r1 = new Rectangle();
//         r1.length=10;
//         r1.width=5;

//         r1.display();
//     }
// }


// class car{
//     String name;
//     int modelno;

//     car(String name, int modelno){
//         this.name= name;
//         this.modelno = modelno;
//     }
//     public void display(){
//         System.out.println(this.name);
//         System.out.println(this.modelno);
//     }
// }
// public class main{
//     public static void main(String args[]){
//         car c= new car("honda", 2015);

//         c.display();
//     }
// }


// class Shape{
//     int l;
//     int b;
//     public void calcArea(){
//         System.out.println("Area is");
//     }
// }
// class rectangle extends Shape{
//     public void calcArea(int l , int b ){
//         System.out.println(1/2*l+b);
//     }
// }
// public class main{
//     public static void main(String[] args) {
//         rectangle r = new rectangle();
        
//         r.calcArea();

//     }
// }


// import java.util.*;

// public class main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("==== ATM ====");
//         int b = 1000;
//         System.out.println("1. Check Balance");
//         System.out.println("2. Deposit Money");
//         System.out.println("3. Withdraw Money");
//         System.out.println("4. Exit");
//         int n = sc.nextInt();
//         if (n==1){
//             System.out.println("Total Balance = "+ b);
//         } else if(n==3){
//             System.out.println("Amount you wanted = ");
//             int w = sc.nextInt();
//             if (w<=b){
//                 System.out.println("Withdraw Amount = " + w);
//                 b = b- w;
//                 System.out.println("Remaining Amount = "+ b);
//             } else{
//                 System.out.println("Invalid amount:");
//             }}
//         else if(n==2){
//             System.out.print("how much money do you want to deposit ");
//             int d = sc.nextInt();
//             b = b+d;
//             System.out.println("Updated Balance = " + b);
//         }
//         else{
//             return;
//         }
//     }
// }


// import java.util.Scanner;

// class ATM {

//     private int balance;

//     // Constructor
//     public ATM(int balance) {
//         this.balance = balance;
//     }

//     // Check Balance
//     public void checkBalance() {
//         System.out.println("Current Balance: " + balance);
//     }

//     // Deposit Money
//     public void deposit(int amount) {
//         if (amount > 0) {
//             balance += amount;
//             System.out.println("Rs. " + amount + " deposited successfully.");
//             System.out.println("Current Balance: " + balance);
//         } else {
//             System.out.println("Invalid deposit amount!");
//         }
//     }

//     // Withdraw Money
//     public void withdraw(int amount) {
//         if (amount <= 0) {
//             System.out.println("Invalid withdrawal amount!");
//         } else if (amount > balance) {
//             System.out.println("Insufficient Balance!");
//         } else {
//             balance -= amount;
//             System.out.println("Rs. " + amount + " withdrawn successfully.");
//             System.out.println("Remaining Balance: " + balance);
//         }
//     }
// }

// public class main {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         // Initial balance = Rs.1000
//         ATM atm = new ATM(1000);

//             System.out.println("\n========== ATM ==========");
//             System.out.println("1. Check Balance");
//             System.out.println("2. Deposit Money");
//             System.out.println("3. Withdraw Money");
//             System.out.println("4. Exit");
//             System.out.print("Enter your choice: ");

//             int choice = sc.nextInt();

//             switch (choice) {

//                 case 1:
//                     atm.checkBalance();
//                     break;

//                 case 2:
//                     System.out.print("Enter deposit amount: ");
//                     int depositAmount = sc.nextInt();
//                     atm.deposit(depositAmount);
//                     break;

//                 case 3:
//                     System.out.print("Enter withdrawal amount: ");
//                     int withdrawAmount = sc.nextInt();
//                     atm.withdraw(withdrawAmount);
//                     break;

//                 case 4:
//                     System.out.println("Thank you for using our ATM!");
//                     sc.close();
//                     return;

//                 default:
//                     System.out.println("Invalid Choice! Please try again.");
//             }
//         }
//     }
// public class main{
//     public static void main(String[] args) {
//         int i=1;
//         while (i==1){
//             System.out.println("h");
//             i++;
//         }
//     }
// }


   
// class Vehicle {
//   protected String brand = "Ford";
//   public void honk() {                    // Vehicle method
//     System.out.println("Tuut, tuut!");
//   }
// }

// class Car extends Vehicle {
//   String modelName = "Mustang";    // Car attribute
// }
// public class main{
//   public static void main(String[] args) {

//     Car myCar = new Car();

//     myCar.honk();
//     System.out.println(myCar.brand + " " + myCar.modelName);
//   }
// }
 
// class Swap{
// public void swap(int a , int b){
//   int temp= a;
//   a = b;
//   b = temp;

//   System.out.println(a);
// }}
// public class main{
//   public static void main(String[] args) {
//     int a = 10;
//     int b =90;

//     Swap s = new Swap();
//     s.swap(a,b);
//   }
// }


// public class main {
//   static void welcomeMessage(String name) {
//     System.out.println("Welcome to Java, " + name);
//   }

//   public static void main(String[] args) {
//     welcomeMessage("hamza");
//   }
// }

// public class main{
//   public static void main(String args[]){
//     int[] number = new int[10];
//     number[0] = 10;

    
//   }
// }







//class computer{
//  class professor{
//    String brand;
//    int speed;
//     void displayDetails(String brand, int speed){
//      System.out.println(brand);
//      System.err.println(speed);
//     }
//  }void showdisplaydetail(){
//    professor p = new professor();
//    p.displayDetails("intel",2600);
//  }
//}
//public class main{
//  public static void main(String[] args) {
//    computer c = new computer();
//    c.showdisplaydetail();
//  }
//}




//class factorial{
//    int number;
//
//    void calc(int number){
//        int factorial=1;
//        if(number<0){
//            System.out.println("invalid number:");
//        }else{
//            for(int i=number;  i>0; i--){
//                factorial*=i;
//            }
//        }
//        System.out.println(factorial);
//    }
//}
//public class main {
//    static void main(String[] args) {
//        factorial f = new factorial();
//        f.number=0;
//        f.calc(f.number);
//    }
//}



//abstract class instrument{
//    abstract void play();
//    abstract void tune();
//}
//class glockenpiel extends instrument{
//    @Override
//    void play(){
//        System.out.println("song playing:");
//    }
//
//    @Override
//    void tune() {
//        System.out.println("tune palying:");
//    }
//}
//class violin extends instrument{
//    @Override
//    void play(){
//        System.out.println("volin playing:");
//    }
//
//    @Override
//    void tune() {
//        System.out.println("volin tune palying:");
//    }
//}
//public class main {
//    static void main(String[] args) {
//        violin v = new violin();
//        v.play();
//    }
//}





abstract class shape3D{
    abstract void calcVolume();

}




