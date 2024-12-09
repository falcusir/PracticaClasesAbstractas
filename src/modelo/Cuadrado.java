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
        //setNombre("Cuadrado");
        return "DATOS DE LA FIGURA \n"
                + "\n" + "Nombre: " + getNombre() + "\n"
                + "Lado: " + getLado() + "\n"
                + "Área: " + getArea() + "\n"
                + "Perímetro: " + getPerimetro();
    }

    @Override
    public double calcularArea() {
        setArea(getLado()*getLado()+ "");
        double a= Double.parseDouble(getArea());
        return a;

    }

    @Override
    public double calcularPerimetro() {
        setPerimetro(getLado()*4+ "");
        return Double.parseDouble(getPerimetro());

    }

    
    
}
