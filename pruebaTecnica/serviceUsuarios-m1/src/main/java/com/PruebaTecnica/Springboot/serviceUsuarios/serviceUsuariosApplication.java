package com.PruebaTecnica.Springboot.serviceUsuarios;

import com.PruebaTecnica.Springboot.serviceUsuarios.entity.Usuario;
import com.PruebaTecnica.Springboot.serviceUsuarios.repository.UsuarioRepository;
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
public class serviceUsuariosApplication implements CommandLineRunner {
    private UsuarioRepository usuarioRepository;
    private DataSource dataSource;
    private final Log logger = LogFactory.getLog(this.getClass());

    public serviceUsuariosApplication(UsuarioRepository usuarioRepository, DataSource dataSource) {
        this.usuarioRepository = usuarioRepository;
        this.dataSource = dataSource;
    }

    public static void main(String[] args) {

        SpringApplication.run(serviceUsuariosApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        guardarUsuariosEnDB();

        /*usuarioRepository
                .findByFechaNacimientoBetween(LocalDate.of(1900,1,1),LocalDate.of(1999,12,30))
                .stream()
                .forEach(usuario ->logger.info("Rango de fechas " + usuario));*/

    }

    private void guardarUsuariosEnDB(){

        Usuario user1 = new Usuario("John", "Perez", LocalDate.of(1998, 3, 13),"Psicologo","123456");
        Usuario user2 = new Usuario("Marco", "london", LocalDate.of(1970, 12, 8),"Soporte","987654");
        Usuario user3 = new Usuario("Daniela", "lopez", LocalDate.of(2000, 9, 8),"Desarrollador","321654");
        Usuario user4 = new Usuario("Marisol", "ibarra", LocalDate.of(1980, 6, 18),"Frontend","147258");
        Usuario user5 = new Usuario("Karen", "zarai", LocalDate.of(2005, 1, 1),"Backend","369258");

        List<Usuario> usuariosInit = Arrays.asList(user1,user2,user3,user4,user5);
        usuariosInit.forEach(usuarioRepository::save);
    }
}
