package li.selman.kanama

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KanamaApplication

fun main(args: Array<String>) {
	runApplication<KanamaApplication>(*args)
}
