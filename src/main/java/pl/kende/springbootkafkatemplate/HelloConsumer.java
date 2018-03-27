package pl.kende.springbootkafkatemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class HelloConsumer {
    private static final Logger logger = LoggerFactory.getLogger(HelloConsumer.class);

    @KafkaListener(topics = "hello-topic")
    public void consumeHello(
            String data
            // optionally add org.springframework.kafka.support.Acknowledgment with manual ack mode
    ) {
        logger.info("Received data: {}", data);
    }
}
