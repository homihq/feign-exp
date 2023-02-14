package com.homihq.feignexp;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor
public class PostApiCallerCommandLineRunner implements CommandLineRunner {

    private final PostApiClient postApiClient;

    @Override
    public void run(String... args) throws Exception {
        List<Post> posts =
            postApiClient.findAllPosts();

        log.info("Posts count - {}", posts.size());
    }
}
