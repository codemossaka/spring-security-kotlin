package ru.godsonpeya.springsecutykotlin.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.annotation.security.RolesAllowed

@RestController
class LoginController {
    @get:RequestMapping("/*")
    @get:RolesAllowed("USER")
    val user: String
        get() = "Welcome User"

    @get:RequestMapping("/admin")
    @get:RolesAllowed("USER", "ADMIN")
    val admin: String
        get() = "Welcome Admin"
}