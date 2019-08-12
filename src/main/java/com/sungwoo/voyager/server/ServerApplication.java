package com.sungwoo.voyager.server;

import com.google.firebase.messaging.FirebaseMessagingException;
import com.sungwoo.voyager.server.notification.push.FirebaseAppSnippets;
import com.sungwoo.voyager.server.notification.push.FirebaseMessagingSnippets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@SpringBootApplication
public class ServerApplication {

    @Autowired
    private FirebaseAppSnippets firebaseAppSnippets;

    @Autowired
    private FirebaseMessagingSnippets firebaseMessagingSnippets;

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

    @Bean
    CommandLineRunner run(){
        return args -> {
            firebaseAppSnippets.initializeWithRefreshToken();
            firebaseMessagingSnippets.sendToToken();
        };
    }

}
