package ru.godsonpeya.springsecutykotlin

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import ru.godsonpeya.springsecutykotlin.controllers.LoginController

@SpringBootTest
@ExtendWith(SpringExtension::class)
class SpringSecurityKotlinApplicationTests {

	@Autowired
	private lateinit var loginController: LoginController

	@Test
	fun contextLoads() {
	}

}
