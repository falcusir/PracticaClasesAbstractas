/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Dell Core i7
 */
public class Cuadrado extends FigurasGeometricas {

    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado(double lado, String nombre, String area, String perimetro) {
        super(nombre, area, perimetro);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "DATOS DEL CUADRADO \n"
                + "Nombre: " + getNombre() + "\n"
                + "Lado: " + getLado() + "\n"
                + "Área: " + getArea() + "\n"
                + "Perímetro: " + getPerimetro();
    }

    @Override
    public void calcularArea() {
        setArea(getLado()*getLado()+ "");
        System.out.println("El área es: "+ getArea());

    }

    @Override
    public void calcularPerimetro() {
        setPerimetro(getLado()*4+ "");
        System.out.println("El perímetro es: " + getPerimetro());

    }

}
