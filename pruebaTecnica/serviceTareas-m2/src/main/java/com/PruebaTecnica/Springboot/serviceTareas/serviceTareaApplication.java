package com.PruebaTecnica.Springboot.serviceTareas;

import com.PruebaTecnica.Springboot.serviceTareas.entity.Tarea;
import com.PruebaTecnica.Springboot.serviceTareas.repository.TareaRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import javax.sql.DataSource;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableEurekaClient
public class serviceTareaApplication implements CommandLineRunner {
    private TareaRepository tareaRepository;
    private DataSource dataSource;
    private final Log logger = LogFactory.getLog(this.getClass());

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
       // tareaRepository.findByIdUsuario(5L).stream().forEach(tarea -> logger.info("tarea por usuario"+tarea));

    }

    private void guardarTareasEnDB() {

        Tarea task1 = new Tarea("Cita con antonio", LocalDate.of(2022, 3, 13), 30, false, "Psicologo",1);
        Tarea task2 = new Tarea("resolver dudas del usuario", LocalDate.of(2022, 12, 8), 30, false, "Soporte",2);
        Tarea task3 = new Tarea("integrar al nuevo compañero con los demas", LocalDate.of(2022, 9, 8), 30, false, "Desarrollador",3);
        Tarea task4 = new Tarea("realizar diseño de pagina web", LocalDate.of(2022, 6, 18), 300, false, "Frontend",4);
        Tarea task5 = new Tarea("hacer conexion con la bd test", LocalDate.of(2022, 1, 1), 30, true, "Backend",5);
        Tarea task6 = new Tarea("Desarrollar Crud", LocalDate.of(2022, 2, 1), 60, false, "Backend",5);

        List<Tarea> tareasInit = Arrays.asList(task1, task2, task3, task4, task5,task6);
        tareasInit.forEach(tareaRepository::save);
    }
}
