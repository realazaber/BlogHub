package azaber.backend.services;

import java.util.List;

import org.springframework.stereotype.Service;

import azaber.backend.models.Post;
import azaber.backend.repo.PostRepo;

@Service
public class PostService {
    private final PostRepo postRepo;

    public PostService(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    public List<Post> getPosts(Integer userId) {
        return null;
    }

    public Post createPost(Post post) {
        return postRepo.save(post);
    }
}