package com.mycompany.pr2;
public class Tree extends groundPlant {
    String group;
    String color;
    String terrain;

    public Tree(String group, String color, String terrain, String season, String mainland, String climate, String dep, String kingdom, String type) {
        super(season, mainland, climate, dep, kingdom, type);
        this.group = group;
        this.color = color;
        this.terrain = terrain;
    }


    public void treeSkill1(){
    System.out.println("stock");
    } 
     
    public void treeSkill2(){
    System.out.println("wintering");
    }
    public String toString() {
    return "Tree (group = " + this.group + ", color = " + this.color + ", terrain = " + this.terrain + ", season = " + this.season + ", mainland = " + this.mainland + ", climate = " + this.climate+ ", dep = " + this.dep + ", kingdom = " + this.kingdom + ", type = " + this.type + ")";
    }
}