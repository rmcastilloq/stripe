package com.meme.stripe.controller

import com.meme.stripe.service.PaymentService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/payments")
class StripeController(private val paymentService: PaymentService) {

    @GetMapping("/hello")
    fun getHelloMessage(): String {
        return paymentService.getHelloWorld()
    }
}