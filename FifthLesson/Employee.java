public class Employee {
    String fullName;
    String position;
    String email;
    String phone;
    int salary;
    int age;


    Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }

    public void printEmployee() {
        System.out.println(fullName + " '" + position + " '" + email + " '" + phone + " '" + salary + " '" + age+" '");
    }
}