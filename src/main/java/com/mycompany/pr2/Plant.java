    package com.mycompany.pr2;
    public class Plant {
    String dep;
    String kingdom;
    String type;

    public Plant(String dep, String kingdom, String type) {
        this.dep = dep;
        this.kingdom = kingdom;
        this.type = type;
    }

    public void plantSkill1(){
    System.out.println("germination");
    }
    
    public void plantSkill2(){
    System.out.println("spreading");
    }
    public String toString() {
    return "Plant (dep = " + this.dep + ", kingdom = " + this.kingdom + ", type = " + this.type + ")";
   }
    }