package daos;

import models.Employee;
import models.Post;
import utilitis.EntityManagerUtility;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class PostDAOImpl implements PostDAO {
    @Override
    public Post insertPost(Post post) {
        EntityManager entityManager = EntityManagerUtility.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(post);
        entityManager.getTransaction().commit();
        entityManager.close();
        return post;
    }

    @Override
    public Post findPost(int id) {
        EntityManager entityManager = EntityManagerUtility.getEntityManager();
        Post post = entityManager.find(Post.class, id);
        entityManager.close();
        return post;
    }

    @Override
    public List<Post> findAllPosts() {
        EntityManager entityManager = EntityManagerUtility.getEntityManager();
        Query query = entityManager.createQuery("Select p from Post p");
//		entityManager.createQuery("", Employee.class);
        List<Post> posts = query.getResultList();
        entityManager.close();
        return posts;
    }

    @Override
    public void removePost(int id) {

        EntityManager entityManager = EntityManagerUtility.getEntityManager();
        Post post = entityManager.find(Post.class, id);
        if (post != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(post);
            entityManager.getTransaction().commit();
            entityManager.close();
        }

    }
}
