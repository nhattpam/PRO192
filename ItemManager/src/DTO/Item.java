package DTO;

import java.util.Scanner;

/**
 * 
 * @author nhattpam
 */
public abstract class Item {
    protected int value;
    protected String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    public void output(){
        System.out.println("Value: " + this.value);
        System.out.println("Creator: " + this.creator);
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input value:");
        value = Integer.parseInt(sc.nextLine());
        while(value<0){
            System.out.println("creator is empty!!!");
            System.out.println("input value:");
            value=Integer.parseInt(sc.nextLine());
        }
        System.out.println("input creator: ");
        creator = sc.nextLine();
    }
}