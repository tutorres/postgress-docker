package tutorres.Postgres;

import tutorres.Postgres.model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tutorres.Postgres.repository.UserRepository;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner init(UserRepository userRepository) {
        return args -> {
           // userRepository.save(new User("John Doe", "john.doe@example.com"));
           //  userRepository.save(new User("Jane Smith", "jane.smith@example.com"));
        };
    }
}
