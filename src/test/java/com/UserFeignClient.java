package com.example.msvcclients.feign;

import com.example.msvcclients.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="msvc-users", url="http://localhost:8081")
public interface UserFeignClient {
    @GetMapping("/users")
    List<User> getUsers();
}
