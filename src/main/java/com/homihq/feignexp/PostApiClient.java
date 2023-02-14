package com.homihq.feignexp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "postApi" , url = "https://jsonplaceholder.typicode.com/")
public interface PostApiClient {

    @GetMapping(value = "/posts")
    List<Post> findAllPosts();

    @GetMapping(value = "/posts/{id}")
    Post findById(@PathVariable int id);
}
