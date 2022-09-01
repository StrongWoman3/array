package Test;

public class Employee {
    int salary;
    String name;
    String position;

     Employee(int salary, String name, String position) {
        this.salary = salary;
        this.name = name;
        this.position = position;

    }

    void showInfo(){
        System.out.println(salary + " " + name  +  " " + position + ".");

}

}
