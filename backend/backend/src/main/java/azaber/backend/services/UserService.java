package azaber.backend.services;

import azaber.backend.models.User;
import azaber.backend.repo.UserRepo;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User getUserById(Integer id) {
        return userRepo.findById(id.longValue()).orElse(null);
    }

    public User createUser(User user) {

        return userRepo.save(user);
    }

}
