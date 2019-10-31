package ru.tano.crash.domain.event

data class BusinessEvent(val type: String, val bankId: String, val applicationId: String, val payload: Payload) {



}

data class Payload(val submissionId: String)
