package com.PruebaTecnica.Springboot.serviceUserTask.DTO;

import javax.persistence.*;
import java.time.LocalDate;



public class Tarea {

    private long id;

    private String descripcion;
    private LocalDate fechaCreacion;
    private int tiempoEstimadoMin;
    private boolean isCompleta;
    private String categoria;
    private Long idUsuario;



    public Tarea() {
    }

    public Tarea(long id) {
        this.id = id;
    }

    public Tarea(String descripcion, LocalDate fechaCreacion, int tiempoEstimadoMin, boolean isCompleta, String categoria, long idUsuario) {
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.tiempoEstimadoMin = tiempoEstimadoMin;
        this.isCompleta = isCompleta;
        this.categoria = categoria;
        this.idUsuario = idUsuario;
    }

    public Tarea(long id, String descripcion, LocalDate fechaCreacion, int tiempoEstimadoMin, boolean isCompleta, String categoria) {
        this.id = id;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.tiempoEstimadoMin = tiempoEstimadoMin;
        this.isCompleta = isCompleta;
        this.categoria = categoria;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getTiempoEstimadoMin() {
        return tiempoEstimadoMin;
    }

    public void setTiempoEstimadoMin(int tiempoEstimadoMin) {
        this.tiempoEstimadoMin = tiempoEstimadoMin;
    }

    public boolean isCompleta() {
        return isCompleta;
    }

    public void setCompleta(boolean completa) {
        isCompleta = completa;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", tiempoEstimadoMin=" + tiempoEstimadoMin +
                ", isCompleta=" + isCompleta +
                ", categoria='" + categoria + '\'' +
                ", idUsuario=" + idUsuario +
                '}';
    }
}
