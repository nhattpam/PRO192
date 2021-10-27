package DTO;

import java.util.Scanner;

/**
 * 
 * @author nhattpam
 */
public class Vase extends Item{
    private int height;
    private String material;

    public Vase() {
    }

    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }



    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public void outputVase(){
        output();
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
        
    }
    public void inputVase(){
        input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a height: ");
        height=Integer.parseInt(sc.nextLine());
        System.out.println("Input a material: ");
        material=sc.nextLine();
    }
}