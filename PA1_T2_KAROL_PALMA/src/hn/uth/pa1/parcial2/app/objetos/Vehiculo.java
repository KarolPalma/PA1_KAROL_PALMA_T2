/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa1.parcial2.app.objetos;

/**
 *
 * @author karol
 */
public class Vehiculo {
    private String placa;
    private String modelo;
    private String marca;
    private int anio;
    private String motor;
    private double precio;
    private String nombre;
    private String descripcion;
    private String imagen;
    private int calculoAnio;
    
    public Vehiculo() {

    }

    public Vehiculo(String placa, String modelo, String marca, int anio, String motor, double precio, String nombre, String descripcion, String imagen) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.anio = anio;
        this.motor = motor;
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }
    
    public Vehiculo(Vehiculo otro){
        this.calculoAnio = otro.calculoAnio;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }

    public String getMotor() {
        return motor;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getcalculoAnio() {
        return calculoAnio;
    }

    public void setcalculoAnio(int calculoAnio) {
        this.calculoAnio = calculoAnio;
    }
}
