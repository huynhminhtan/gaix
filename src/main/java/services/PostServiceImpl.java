package services;

import daos.PostDAO;
import daos.PostDAOImpl;
import models.Post;

import java.util.List;

public class PostServiceImpl implements PostService {

    private PostDAO postDAO;

    public PostServiceImpl() {
        this.postDAO = new PostDAOImpl();
    }

    @Override
    public Post insertPost(Post post) {
        return postDAO.insertPost(post);
    }

    @Override
    public Post findPost(int id) {
        return postDAO.findPost(id);
    }

    @Override
    public List<Post> findAllPosts() {
        return postDAO.findAllPosts();
    }

    @Override
    public void removePost(int id) {
        postDAO.removePost(id);
    }
}
