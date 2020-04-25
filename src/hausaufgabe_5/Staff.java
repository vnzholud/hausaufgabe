package hausaufgabe_5;


public class Staff {


    String fullName;
    String position;
    String email;
    String telefon;
    int salary;
    int age;

    public Staff(String fullName, String position, String email, String telefon, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telefon = telefon;
        this.salary = salary;
        this.age = age;
    }



    public void info(){

        System.out.printf("Staff %s %s %s %s %d %d", fullName, position, email, telefon, salary, age);
    }

}

