package azaber.backend.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import azaber.backend.models.Post;

public interface PostRepo extends JpaRepository<Post, Long> {

}
