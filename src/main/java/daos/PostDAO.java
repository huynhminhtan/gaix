package daos;

import models.Post;
import java.util.List;

public interface PostDAO {
    public Post insertPost(Post post);

    public Post findPost(int id);

    public List<Post> findAllPosts();

    public void removePost(int id);
}
