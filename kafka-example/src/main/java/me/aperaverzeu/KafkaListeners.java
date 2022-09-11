package me.aperaverzeu;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "asphe", groupId = "flaneur")
    void listener(String data) {
        System.out.println("Listener received: " + data + " 🎉");
    }
}
