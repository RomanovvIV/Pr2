package com.mycompany.pr2;
public class Grass extends groundPlant {
    String saturation;
    String density;
    String hardness;

    public Grass(String saturation, String density, String hardness, String season, String mainland, String climate, String dep, String kingdom, String type) {
        super(season, mainland, climate, dep, kingdom, type);
        this.saturation = saturation;
        this.density = density;
        this.hardness = hardness;
    }

    public void grassSkill1(){
    System.out.println("moistrue retention");
    }
    
    public void grassSkill2(){
    System.out.println("photosynthesis");
    }
    public String toString() {
    return "grass (saturation = " + this.saturation + ", density = " + this.density + ", hardness = " + this.hardness + ", season = " + this.season + ", mainland = " + this.mainland + ", climate = " + this.climate + ", dep = " + this.dep + ", kingdom = " + this.kingdom + ", type = " + this.type + ")";
    }
}