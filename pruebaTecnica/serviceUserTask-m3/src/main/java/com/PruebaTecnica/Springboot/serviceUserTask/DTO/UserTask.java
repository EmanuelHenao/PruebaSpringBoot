package com.PruebaTecnica.Springboot.serviceUserTask.DTO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;

public class UserTask {

    private Usuario usuario;
    private List<Tarea> tareas;

    public UserTask() {
    }

    public UserTask(Usuario usuario, List<Tarea> tareas) {
        this.usuario = usuario;
        this.tareas = tareas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    @Override
    public String toString() {
        return "UserTask{" +
                "usuario=" + usuario +
                ", tareas=" + tareas +
                '}';
    }
}
