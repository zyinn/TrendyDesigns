package top.onedream.trendydesigns.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.onedream.trendydesigns.repository.UserRepository;
import top.onedream.trendydesigns.service.inter.UserService;

import java.util.List;

/**
 *  Impl User Service(interface of User Service)
 * @param <T> T
 */
@Service
public class UserServiceImpl<T> implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<T> findAllUser() {
        return (List<T>) userRepository.findAllUser();
    }
}
