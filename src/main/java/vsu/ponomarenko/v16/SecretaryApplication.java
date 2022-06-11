package vsu.ponomarenko.v16;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vsu.ponomarenko.v16.Entity.Departaments;

@SpringBootApplication
public class SecretaryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecretaryApplication.class, args);

    }


    @Bean
    public CommandLineRunner runner(DepartamentsReposetory departamentsReposetory) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                for (int i = 0; i < 10; i++){
                    Departaments c = new Departaments();
                    departamentsReposetory.save(c);
                }

            }
        };

    }

}