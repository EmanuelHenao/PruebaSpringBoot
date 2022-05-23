package com.PruebaTecnica.Springboot.serviceUserTask.DTO;

import java.time.LocalDate;

public class Usuario {


    private long id;

    private String nombre;

    private String apellido;
    private LocalDate fechaNacimiento;

    private String cargo;

    private String telefono;

    public Usuario() {
    }

    public Usuario(long id, String nombre, String apellido, LocalDate fechaNacimiento, String cargo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.cargo = cargo;
        this.telefono = telefono;
    }
    public Usuario(String nombre, String apellido, LocalDate fechaNacimiento, String cargo, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.cargo = cargo;
        this.telefono = telefono;
    }

    public Usuario(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", cargo='" + cargo + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
