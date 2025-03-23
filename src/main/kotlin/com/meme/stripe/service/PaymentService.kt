package com.meme.stripe.service

import com.meme.stripe.repository.MessageRepository
import org.springframework.stereotype.Service

@Service
class PaymentService(private val messageRepository: MessageRepository) {

    fun getHelloWorld(): String {
        val messageEntity = messageRepository.findFirstByOrderByIdAsc()
        return messageEntity?.message ?: "No message found"
    }
}