package Encapsulation;

public class Printer {
    private int papers;
    private int inkLevel;
    private int power;
    private String model;
    private int pagesPrinted;

    public Printer(int papers, int inkLevel, int power, String model) {
        this.papers = papers;
        this.inkLevel = inkLevel;
        this.power = power;
        this.model = model;
        this.pagesPrinted = 0;
    }
    public void print(String Data) {
        if (this.power == 1) {
            if (Data.length() <= inkLevel) {
                if (this.papers >= 1) {
                    System.out.println("Printing.......");
                    System.out.println("Printed " + Data + " :).");
                    this.inkLevel = this.inkLevel - Data.length();
                    this.papers--;
                    this.pagesPrinted++;
                } else {
                    System.out.println("Not enough paper to print.");
                }
            } else {
                System.out.println("Not enough Ink present.");
            }
        }
    }
    public void fillInk(int fillInk){
        if(this.inkLevel == 100){
            System.out.println("The ink level is already full, no need to fill it again.");
        }else{
            System.out.println("Filling the ink level.");
            System.out.println("Filled the ink tank.");
            this.inkLevel = this.inkLevel + fillInk;
            if(this.inkLevel > 100) {
                this.inkLevel = 100;
            }
            System.out.println("The Current Ink Level is " + this.inkLevel + ".");
        }
    }

    private int getPagesPrinted() {
        return pagesPrinted;
    }
    public void getDetails(){
        System.out.println("Current Ink Level: " + getInkLevel());
        System.out.println("Current Number of papers: " + getPapers());
        System.out.println("Total Number of Pages printed: " + getPagesPrinted());
    }
    private int getPapers() {
        return papers;
    }

    private int getInkLevel() {
        return inkLevel;
    }

    public int getPower() {
        return power;
    }

    public String getModel() {
        return model;
    }

}
