package azaber.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import azaber.backend.models.Comment;

public interface CommentRepo extends JpaRepository<Comment, Long> {

}
