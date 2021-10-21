import java.util.Arrays;

public class HomeWork5 {

    public static void main(String[] args) {

        Employee Bruse = new Employee("Bruse Wayne", "manager", "Bruse@gmail.com", "12345",44,20000);
        Bruse.infoInConsole();

        Employee[] employArr = new Employee[5];
        employArr[0] = new Employee("Chris Black", "web-developer", "Chris@gmail.com", "123",24,5000);
        employArr[1] = new Employee("Alex Grey", "teacher", "Alex@gmail.com", "123",36,5000);
        employArr[2] = new Employee("Sasha Navy", "actor", "Sasha@gmail.com", "123",50,5000);
        employArr[3] = new Employee("Lucian Senna", "doctor", "Lucian@gmail.com", "123",20,5000);
        employArr[4] = new Employee("Teemo Garen", "businessmen", "Teemo@gmail.com", "123",44,5000);

        for (int i = 0; i < employArr.length; i++) {
            if (employArr[i].age > 40)
                employArr[i].infoInConsole();
        }
    }

}
