/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Dell Core i7
 */
public abstract class FigurasGeometricas {
    private String nombre;
    private String area;
    private String perimetro;

    public FigurasGeometricas() {
    }

    public FigurasGeometricas(String nombre, String area, String perimetro) {
        this.nombre = nombre;
        this.area = area;
        this.perimetro = perimetro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(String perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "DATOS DE LA FIGURA GEOMÉTRCA \n"+ 
                "Nombre: " + getNombre()+"\n"+
                "Área: " + getArea()+"\n"+
                "Perímetro: " + getPerimetro();

    }
    // en una clase tradicional aumento un método abstracto-- solo declarado
    public abstract void calcularArea();
    public abstract void calcularPerimetro();
    
    
    
    
}
