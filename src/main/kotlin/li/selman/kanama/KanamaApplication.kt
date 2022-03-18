package li.selman.kanama

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KanamaApplication

fun main(args: Array<String>) {
    @Suppress("SpreadOperator")
    runApplication<KanamaApplication>(*args)
}
