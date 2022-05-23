package com.PruebaTecnica.Springboot.serviceTareas;

import com.PruebaTecnica.Springboot.serviceTareas.entity.Tarea;
import com.PruebaTecnica.Springboot.serviceTareas.repository.TareaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class serviceTareaApplication implements CommandLineRunner {
    private TareaRepository tareaRepository;
    private DataSource dataSource;

    public serviceTareaApplication(TareaRepository tareaRepository, DataSource dataSource) {
        this.tareaRepository = tareaRepository;
        this.dataSource = dataSource;
    }

    public static void main(String[] args) {

        SpringApplication.run(serviceTareaApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        guardarTareasEnDB();

    }

    private void guardarTareasEnDB() {

        Tarea task1 = new Tarea("Cita con antonio", LocalDate.of(2022, 3, 13), 30, false, "Psicologo");
        Tarea task2 = new Tarea("resolver dudas del usuario", LocalDate.of(2022, 12, 8), 30, false, "Soporte");
        Tarea task3 = new Tarea("integrar al nuevo compañero con los demas", LocalDate.of(2022, 9, 8), 30, false, "Desarrollador");
        Tarea task4 = new Tarea("realizar diseño de pagina web", LocalDate.of(2022, 6, 18), 300, false, "Frontend");
        Tarea task5 = new Tarea("hacer conexion con la bd test", LocalDate.of(2022, 1, 1), 30, true, "Backend");

        List<Tarea> tareasInit = Arrays.asList(task1, task2, task3, task4, task5);
        tareasInit.forEach(tareaRepository::save);
    }
}
