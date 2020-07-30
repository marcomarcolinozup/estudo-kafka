package estudo.kafka.exemplo.consumer

import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class KafkaConsumer {

    private val logger = LoggerFactory.getLogger(javaClass)

    @KafkaListener(topics=["modelTopic"],groupId = "teste")
    fun processMessage(message: String ){
        logger.info("msg: {}",message)
    }

}