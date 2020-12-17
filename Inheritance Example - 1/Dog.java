package inheritance;

public class Dog extends animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    public Dog(String name,  int weight, int size, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, weight, size);
        this.eyes = eyes;
        this.tail = tail;
        this.teeth = teeth;
        this.legs = legs;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.Chew() called");
    }

    @Override
    public void eat() {
        super.eat();
        chew();
        System.out.println("Dog.chew() and Animal.eat() called using override method");
    }

    public void walk(int speed){
        System.out.println("Dog.walk() called");
        super.move(speed);
    }

    public void run(int speed){
        System.out.println("Dog.run() called");
        move(speed);
    }

    private void moveLegs(){
        System.out.println("Dogs is moving its legs << Dog.moveLegs() is called.");
    }

    @Override
    public void move(int speed) {
        System.out.println("Extended move is called from Dog");
        moveLegs();
        super.move(speed);
    }
}
