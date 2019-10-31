package ru.tano.crash.messaging

import org.springframework.cloud.stream.annotation.Input
import org.springframework.messaging.SubscribableChannel

interface Channels {

    companion object {
        const val BUSINESS_EVENTS_IN = "BUSINESS_EVENTS_IN"
    }

    @Input(BUSINESS_EVENTS_IN)
    fun businessEventsInput(): SubscribableChannel

}
