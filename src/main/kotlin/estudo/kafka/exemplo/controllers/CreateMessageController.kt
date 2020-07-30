package estudo.kafka.exemplo.controllers

import estudo.kafka.exemplo.producer.KafkaProducer
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class CreateMessageController (private val kafkaProducer: KafkaProducer){

    @PostMapping("/message")
    @ResponseBody
    fun publish(@RequestBody message: String): String {
        kafkaProducer.sendMessage(message)
        return "OK"
    }

}