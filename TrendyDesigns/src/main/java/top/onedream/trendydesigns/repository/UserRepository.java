package top.onedream.trendydesigns.repository;

import org.springframework.stereotype.Repository;
import top.onedream.trendydesigns.model.UserModel;

import java.util.List;

/**
 * UserModel Repository interface
 */
@Repository
public interface UserRepository {
    /**
     * create user by UserModel
     * @param userModel UserModel
     * @return int
     */
    int createUser(UserModel userModel);

    /**
     * find All UserModel
     * @return List of UserModel
     */
    List<UserModel> findAllUser();
}
