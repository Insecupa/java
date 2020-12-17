package inheritance;
import inheritance.animal;
import inheritance.Dog;

public class Main {
    public static void main(String args[]){
        animal ani = new animal("animal", 0, 1, 5, 10);

        //ani.eat();
        //System.out.println(ani.getName());

        Dog dog = new Dog("Leo", 55, 10, 2, 4, 1, 22, "MediumSingle");
        //dog.eat();

        dog.walk(5);
        dog.run(10);

        fish fi = new fish("Catry", 20, 10, 2, 2, 2);

        fi.swim(10);
    }
}
