package com.PruebaTecnica.Springboot.serviceUserTask.casoUso;

import com.PruebaTecnica.Springboot.serviceUserTask.DTO.UserTask;
import com.PruebaTecnica.Springboot.serviceUserTask.service.UserTareaService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Obtener {
    private UserTareaService userTareaService;

    public Obtener(UserTareaService userTareaService) {
        this.userTareaService = userTareaService;
    }


    public List<UserTask> userConTareas() {
        return userTareaService.userConTareas();
    }
}
