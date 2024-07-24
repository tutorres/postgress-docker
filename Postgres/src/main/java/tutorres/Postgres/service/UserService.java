package tutorres.Postgres.service;

import tutorres.Postgres.model.User;
import java.util.List;

public interface UserService {
    User createUser(User user);
    List<User> getAllUsers();
    User getUserById(Long id);
    // Outros métodos de serviço
}
