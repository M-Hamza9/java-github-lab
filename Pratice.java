////import java.util.ArrayList;
////
////interface Payment{
////    public void pay();
////}
////class CashPayment implements Payment{
////    public void pay(){
////        System.out.println("pay by cash");
////    }
////}
////class CardPayment implements Payment{
////    public void pay(){
////        System.out.println("pay by card");
////    }
////}
////class Student{
////    int id;
////    String name;
////    int marks;
////
////    public Student(int id, String name, int marks){
////        this.id=id;
////        this.name=name;
////        this.marks=marks;
////    }
////}
////public class Pratice{
////    public static void main(String[] args) {
////        Payment p1 = new CardPayment();
////        p1.pay();
////
////        ArrayList<Student> arr = new ArrayList<>();
////        arr.add(new Student(338,"hamza",90));
////        arr.add(new Student(339,"hammad",97));
////        arr.add(new Student(337,"hania",89));
////
////        arr.stream()
////        .sorted((s1, s2) -> s1.marks - s2.marks)
////        .forEach(n-> System.out.println(n));
////
////    }
////}
//
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//
//
//class Employee{
//    int id;
//    String name;
//    long salary;
//
//    Employee(int id, String name, long salary){
//        this.id=id;
//        this.name=name;
//        this.salary=salary;
//    }
//    public void displayEmployee(){
//        System.out.println(id);
//        System.out.println(name);
//        System.out.println(salary);
//    }
//    public void work(){
//        System.out.println("Employee working");
//    }
//}
//class Developer extends Employee {
//    Developer(int id , String name, long salary){
//        super(id, name,salary);
//    }
//    public void work(){
//        System.out.println("Developer working");
//    }
//}
//public class Pratice {
//    static void main(String[] args) {
//
//        Employee e = new Developer(12,"hamza",10000);
//        e.displayEmployee();
//        e.work();
//        Employee e2 = new Employee(13,"hammad",890000);
//        e2.displayEmployee();
//        ArrayList<Integer> a = new ArrayList<>();
//        a.add(10);
//        a.add(20);
//        a.add(30);
//        int sum=0;
//        int l=a.get(0);
//        for (int i:a){
//            System.out.println(i);
//            sum+=i;
//        }
//        System.out.println(sum);
//
//        for(int j=0; j<a.size(); j++){
//            if(a.get(j)>l){
//                l= a.get(j);
//            }
//        }
//        System.out.println(l);
//
//        HashMap<String, Integer> h = new HashMap<>();
//        h.put("hamza",90);
//        h.put("hammad",98);
//        h.put("ahmed",78);
//        System.out.println("Hamza Marks:"+h.get("hamza"));
//
//
//        List<Integer> number = Arrays.asList(10,15,20,25,30);
//        number.stream()
//                .filter(n->n>20)
//                .forEach(n-> System.out.println(n));
//    }
//}
