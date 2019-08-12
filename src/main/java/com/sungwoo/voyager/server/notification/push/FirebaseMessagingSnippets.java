package com.sungwoo.voyager.server.notification.push;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;

@Component
public class FirebaseMessagingSnippets {

    public void sendToToken() throws FirebaseMessagingException {
        // [START send_to_token]
        // This registration token comes from the client FCM SDKs.
        String registrationToken = "e7dEn3DxTSA:APA91bGeQSRd0nJ-pEx9p_vcl34aBvgaEnbB97T0XwF__vwsBVXC8rPHIn2s0q52z0yLJqQFrS03u9GyiIS6Yerp5WCCS37thK3VXf2ps6_mR9Ija-B6sGyp_2_hpURAsw56FsWMsYO-";

        // See documentation on defining a message payload.
        Message message = Message.builder()
                .putData("score", "850")
                .putData("time", "2:45")
                .setToken(registrationToken)
                .build();

        // Send a message to the device corresponding to the provided
        // registration token.
        String response = FirebaseMessaging.getInstance().send(message);
        // Response is a message ID string.
        System.out.println("Successfully sent message: " + response);
        // [END send_to_token]
    }
}
