package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "USER_LEVELS")
public class UserLevel {
    public UserLevel() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "level")
    private List<User> listUser;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
