package ru.tano.crash.messaging

import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.stereotype.Service
import ru.tano.crash.messaging.Channels.Companion.BUSINESS_EVENTS_IN

@Service
class BusinessEventsHandler {

    @StreamListener(BUSINESS_EVENTS_IN)
    fun handleBusinessEvent(businessEvent: Any) {
        println("test")
    }

}
