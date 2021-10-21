public class Employee {
    public String fullName;
    public String position;
    public String email;
    public String phone;
    public int age;
    public int salary;

    public Employee(String fullName, String position, String email, String phone, int age, int salary){
        this.age = age;
        this.email = email;
        this.fullName = fullName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
    }

    public void infoInConsole() {
        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
    }


}
