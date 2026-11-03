class Employee{
    int id;
    String name;
    double salary;
    String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    public void displayInfo(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
        System.out.println(department);
    }
}
class Manager extends Employee{
    int bonus;

    public Manager(int id, String name, double salary, String department,int bonus) {
        super(id, name, salary, department);
        this.bonus= bonus;
    }
    public void displayInfo(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
        System.out.println(department);
        System.out.println(bonus);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Employee e = new Manager(12,"hamza",100000,"se",2000);
        e.displayInfo();
    }
}