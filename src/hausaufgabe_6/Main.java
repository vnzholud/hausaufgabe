package hausaufgabe_6;

public class Main {


    public static void main(String[] args){

        Cat cat = new Cat("кошка",200, 0, 2);

        cat.running();
        cat.swimming();
        cat.jumping();

        Dog dog = new Dog("Собака",500, 10, 0.5);

        dog.running();
        dog.swimming();
        dog.jumping();
    }
}
