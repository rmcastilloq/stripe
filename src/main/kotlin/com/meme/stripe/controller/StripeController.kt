package com.meme.stripe.controller

import com.meme.stripe.service.PaymentService
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class StripeController (private val paymentService: PaymentService) {

    @GetMapping("hello")
    fun helloWorld(): String {
        return paymentService.getHelloWorld()
    }
}