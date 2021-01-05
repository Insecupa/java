package Encapsulation;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        Printer printer = new Printer(10, 100, 1, "HP Laser Jet");

        System.out.println("Printer model is " + printer.getModel());
        printer.print("Hello There");
        printer.getDetails();
        printer.print("Hello this is abhijeet Rayapeddi hi there I am socialiast activist righitis");
        printer.getDetails();
        printer.print("sahdgjashgdasdasgdhjsagdj");
        printer.getDetails();
        printer.fillInk(100);
        printer.getDetails();
    }
}
