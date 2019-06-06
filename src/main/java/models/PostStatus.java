package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "POST_STATUS")
public class PostStatus {

    public PostStatus(){

    }

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

    public List<Post> getListPost() {
        return listPost;
    }

    public void setListPost(List<Post> listPost) {
        this.listPost = listPost;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    //    @OneToMany(fetch = FetchType.EAGER, mappedBy = "status")
    @OneToMany(mappedBy = "status")
    private List<Post> listPost;
}
