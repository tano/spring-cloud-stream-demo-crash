package ru.tano.crash

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.context.annotation.Bean
import ru.tano.crash.messaging.Channels
import java.time.Clock
import java.util.function.Consumer

@SpringBootApplication
@EnableBinding(Channels::class)
class CrashDemoApp {

	@Bean
	fun clock(): Clock {
		return Clock.systemUTC()
	}

	@Bean
	fun sampleSinkBean(): SinkSample {
		return SinkSample()
	}

}

fun main(args: Array<String>) {
	runApplication<CrashDemoApp>(*args)
}


class SinkSample: Consumer<String> {
	override fun accept(t: String) {
		println("accept")
	}
}
