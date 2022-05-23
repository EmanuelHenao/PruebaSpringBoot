package eureka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class eurekaApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(eurekaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
