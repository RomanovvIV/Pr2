package com.mycompany.pr2;
import java.util.Scanner; 
public class Pr2 {

public static void main(String[] args) {
    System.out.println("RIBO-04-21 v4 Romanov I.V.");
    Scanner scan = new Scanner(System.in);
    System.out.print("dep = ");
    String aj = scan.nextLine();
    System.out.print("kingdom = ");
    String bj = scan.nextLine();
    System.out.print("type = ");
    String cj = scan.nextLine();
    System.out.print("season = ");
    String dj = scan.nextLine();
    System.out.print("mainland = ");
    String ej = scan.nextLine();
    System.out.print("climate = ");
    String fj = scan.nextLine();
    System.out.print("saturation = ");
    String gj = scan.nextLine();
    System.out.print("density = ");
    String hj = scan.nextLine();
    System.out.print("hardness = ");
    String ij = scan.nextLine();
    System.out.print("group = ");
    String jj = scan.nextLine();
    System.out.print("color = ");
    String lj = scan.nextLine();
    System.out.print("terrain = ");
    String mj = scan.nextLine(); 
        
    Plant myPlant = new Plant(aj, bj, cj );
    groundPlant mygroundPlant = new groundPlant(dj, ej, fj, aj, bj, cj);
    Grass myGrass = new Grass(gj, hj, ij, dj, ej, fj, aj, bj, cj);
    Tree myTree = new Tree(jj, lj, mj, dj, ej, fj, aj, bj, cj);
    
    System.out.print(myPlant + "\n");
    System.out.print(mygroundPlant + "\n");
    System.out.print(myGrass + "\n");
    System.out.print(myTree);
    }
}
