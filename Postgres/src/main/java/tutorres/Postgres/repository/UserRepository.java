package tutorres.Postgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tutorres.Postgres.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
