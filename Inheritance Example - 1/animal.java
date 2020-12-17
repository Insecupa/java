package inheritance;

public class animal {

    private String name;
    private int brain;
    private int body;
    private int weight;
    private int size;

    public animal(String name, int brain, int body, int weight, int size) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.weight = weight;
        this.size = size;
    }
    public void eat(){
        System.out.println("Eat called in Animal");
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getWeight() {
        return weight;
    }

    public int getSize() {
        return size;
    }
    public void move(int speed){
        System.out.println("Animal.move()>> Animal is moving at "+speed);
    }

}
