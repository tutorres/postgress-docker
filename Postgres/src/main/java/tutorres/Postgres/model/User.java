package tutorres.Postgres.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="users")
public class User {

    // Getters e setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    // Construtor padrão
    public User() {
    }

    // Construtor com parâmetros
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

}
