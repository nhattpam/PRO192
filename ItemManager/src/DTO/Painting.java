package DTO;

import java.util.Scanner;

/**
 * 
 * @author nhattpam
 */
public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {
    }

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    public void outputPainting(){
        output();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("is water colour? " + isWatercolour);
        System.out.println("is framed? " + isFramed);
    }
    public void inputPainting(){
        input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a height:");
        height=Integer.parseInt(sc.nextLine());
        System.out.println("Input a width:");
        width=Integer.parseInt(sc.nextLine());
        System.out.println("Is water colour? ");
        isWatercolour=sc.nextBoolean();
        System.out.println("Is framed? ");
        isFramed=sc.nextBoolean();
    }
}