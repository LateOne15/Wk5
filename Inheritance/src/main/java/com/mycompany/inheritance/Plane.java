/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author lleyt
 */
public class Plane extends Vehicle{
    public int numberOfEngines;
    
    public Plane(String brand, String model, int year, String engineType, 
            int horsepower, int numberOfEngines) {
        super(brand, model, year, engineType, horsepower);
        this.numberOfEngines = numberOfEngines;
        this.vehicleType = "plane";
    }
    
    @Override
    public String getInfo() {
        String summary = "The "+vehicleType+" is a "+year+" "+brand+" "+model+
                ". "+engine.getSpecs()+"\nIt has "+numberOfEngines+" engines.";
        return summary;
    }
}
