/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.ave;

/**
 *
 * @author fabricio
 */
public class Pinguino extends Ave {
    
    //CONSTRUCTOR
    public Pinguino(String nombre){
        this.nombre = nombre;
        this.especie = "Pinguino";
        this.tipo = "Ave";
        this.altura = "0 m";
    }
    
    @Override
    public String alturaVuelo() {
        return this.altura;
    }
}
