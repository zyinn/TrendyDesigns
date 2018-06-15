package top.onedream.trendydesigns.service.inter;

import java.util.List;

/**
 * interface of User Service
 */
public interface UserService<T> {
    /**
     * find All The List of User Model
     * @return List
     */
    List<T> findAllUser();
}
