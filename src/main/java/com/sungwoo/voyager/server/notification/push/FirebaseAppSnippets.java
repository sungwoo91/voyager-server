package com.sungwoo.voyager.server.notification.push;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;

@Component
public class FirebaseAppSnippets {

    public void initializeWithRefreshToken() throws IOException {
        // [START initialize_sdk_with_refresh_token]
        FileInputStream refreshToken = new FileInputStream("/Users/leesungwoo/key/serviceAccountKey.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(refreshToken))
                .setDatabaseUrl("https://voyager-de0c1.firebaseio.com")
                .build();

        FirebaseApp.initializeApp(options);
        // [END initialize_sdk_with_refresh_token]
    }
}
