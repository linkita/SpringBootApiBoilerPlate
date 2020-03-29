package com.mavi.app.infra;


        import com.mavi.app.domain.Employee;
        import com.mavi.app.domain.EmployeeRepository;
        import lombok.extern.slf4j.Slf4j;

        import org.springframework.boot.CommandLineRunner;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
   //     Logger log = Logger.getLogger("myFirstLog");
        return args -> {
            log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar")));
            log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief")));
        };
    }
}