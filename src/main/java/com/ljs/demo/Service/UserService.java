package com.ljs.demo.Service;

import com.ljs.demo.pojo.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> findAll();
}
