package com.meme.stripe.repository

import com.meme.stripe.model.Message
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MessageRepository : JpaRepository<Message, Long> {
    fun findFirstByOrderByIdAsc(): Message?
}