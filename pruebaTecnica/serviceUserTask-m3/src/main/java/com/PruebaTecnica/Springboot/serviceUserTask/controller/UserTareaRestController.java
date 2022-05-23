package com.PruebaTecnica.Springboot.serviceUserTask.controller;

import com.PruebaTecnica.Springboot.serviceUserTask.DTO.UserTask;
import com.PruebaTecnica.Springboot.serviceUserTask.casoUso.Obtener;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usertarea")
public class UserTareaRestController {

    private Obtener obtener;

    public UserTareaRestController(Obtener obtener) {
        this.obtener = obtener;
    }

    @GetMapping("/")
    ResponseEntity<List<UserTask>> userConTareas(){
        return new ResponseEntity<>(obtener.userConTareas(),HttpStatus.OK);
    }
}
