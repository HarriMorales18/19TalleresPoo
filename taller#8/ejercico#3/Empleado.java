/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


class Empleado {
// Atributos de la clase Empleado
private String nombre;
private double salario;

// Constructor de la clase Empleado
public Empleado(String nombre, double salario) {
    this.nombre = nombre;
    this.salario = salario;
}

// Métodos getter y setter
public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public double getSalario() {
    return salario;
}

public void setSalario(double salario) {
    this.salario = salario;
}

// Método para mostrar los detalles del empleado
public void mostrarDetalles() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Salario: " + salario + " USD");
}
}

