package inheritance;

public class fish extends animal{
    private int gills;
    private int fins;
    private int eyes;

    public fish(String name, int weight, int size, int gills, int fins, int eyes) {
        super(name, 1, 1, weight, size);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }

    private void moveMuscles(){
        System.out.println("Fish moving its muscles");
    }

    private void moveBackFins(){
        System.out.println("Moving back fins");
    }

    private void moveFrontFins(){
        System.out.println("Fish moving front fins");
    }

    public void rest(){
        System.out.println("Fish is resting.");
    }

    public void swim(int speed){
        moveMuscles();
        moveBackFins();
        moveFrontFins();
        super.move(speed);
    }
}
