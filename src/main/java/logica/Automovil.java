package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/*
* A través de las anotaciones, esta clase se convierte en una tabla de la base de datos
* La estrategia de generación es identity por lo tanto el id en la base será autoincremental
*/
@Entity 
public class Automovil implements Serializable {
   @Id 
   @GeneratedValue(strategy=GenerationType.IDENTITY) 
   private int idAuto;
   @Basic
   private String modelo;
   private String marca;
   private String motor;
   private String color;
   
   @Column(nullable = true)
   private String patente;
   private String cantidadPuertas;

    public Automovil() {
    }

    public Automovil(int idAuto, String modelo, String marca, String motor, String color, String patente, String cantidadPuertas) {
        this.idAuto = idAuto;
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;
        this.color = color;
        this.patente = patente;
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(int idAuto) {
        this.idAuto = idAuto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(String cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {
        return "Automovil{" + "idAuto=" + idAuto + ", modelo=" + modelo + ", marca=" + marca + ", motor=" + motor + ", color=" + color + ", patente=" + patente + ", cantidadPuertas=" + cantidadPuertas + '}';
    }


}
