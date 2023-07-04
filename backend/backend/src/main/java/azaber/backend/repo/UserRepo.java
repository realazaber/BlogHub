package azaber.backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import azaber.backend.models.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
