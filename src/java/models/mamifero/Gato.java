/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.mamifero;

/**
 *
 * @author fabricio
 */
public class Gato extends Mamifero{
    
    //CONSTRUCTOR
    public Gato(String nombre){
        this.nombre = nombre;
        this.especie = "Gato";
        this.tipo = "Mamifero";
    }
}
