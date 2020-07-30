package estudo.kafka.exemplo.producer

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class KafkaProducer(private val kafkaTemplate: KafkaTemplate<String, String> ){

    fun sendMessage(message: String){
        kafkaTemplate.send("modelTopic",message)
    }

}