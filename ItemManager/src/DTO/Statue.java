package DTO;

import java.util.Scanner;

/**
 * 
 * @author nhattpam
 */
public class Statue extends Item{
    private int weight;
    private String colour;

    public Statue() {
    }

    public Statue(int weight, String colour, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public void outputStatue(){
        output();
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }
    public void inputStatue(){
        input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a weight: ");
        weight=Integer.parseInt(sc.nextLine());
        System.out.println("Input a colour: ");
        colour=sc.nextLine();
    }
}