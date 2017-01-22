package me.lorenc.mockspike

import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@ContextConfiguration(classes = arrayOf(ConsumerApplication::class))
class ConsumerApplicationTests {

    @Autowired
	val client: Client? = null

    @Test
    @Ignore
	fun test() {
		client!!.get()
	}
}
