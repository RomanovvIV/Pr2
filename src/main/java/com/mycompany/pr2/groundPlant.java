package com.mycompany.pr2;
public class groundPlant extends Plant {
    String season;
    String mainland;
    String climate;

    public groundPlant(String season, String mainland, String climate, String dep, String kingdom, String type) {
        super(dep, kingdom, type);
        this.season = season;
        this.mainland = mainland;
        this.climate = climate;
    }


    public void groundSkill1(){
    System.out.println("fixation");
    }
    
    public void groundSkill2(){
    System.out.println("drink");
    }
    public String toString() {
    return "groundPlant (season = " + this.season + ", mainland = " + this.mainland + ", climate = " + this.climate + ", dep = " + this.dep + ", kingdom = " + this.kingdom + ", type = " + this.type + ")";
   }
}