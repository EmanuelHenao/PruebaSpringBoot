package com.PruebaTecnica.Springboot.serviceUserTask.service;

import com.PruebaTecnica.Springboot.serviceUserTask.DTO.Tarea;
import com.PruebaTecnica.Springboot.serviceUserTask.DTO.UserTask;
import com.PruebaTecnica.Springboot.serviceUserTask.DTO.Usuario;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserTareaService {

    public List<UserTask> userConTareas() {
        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper mapper = JsonMapper.builder()
                .addModule(new JavaTimeModule())
                .build();

        List<Usuario> usu = restTemplate.getForObject("http://localhost:8081/app/api/usuarios/",List.class);

        List<Usuario> usuarios = mapper.convertValue(
                usu,
                new TypeReference<List<Usuario>>(){}
        );
        List<UserTask> userTasks = new ArrayList<>();

        for (Usuario usuario:usuarios) {
            List<Tarea> tareas = restTemplate.getForObject("http://localhost:8082/app/api/tareas/user/"+usuario.getId(),List.class);
            userTasks.add(new UserTask(usuario,tareas));
        }
        return userTasks;
    }
}
