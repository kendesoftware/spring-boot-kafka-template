package pl.kende.springbootkafkatemplate;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;

@Configuration
@EnableKafka
public class KafkaConfiguration {

    @Bean("helloTopic")
    public NewTopic helloTopic() {
        return new NewTopic("hello-topic", 1, (short) 1);
    }

}
