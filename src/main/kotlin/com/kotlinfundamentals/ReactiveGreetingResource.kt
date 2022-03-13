package com.kotlinfundamentals

import com.kotlinfundamentals.repository.PersonRepository
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class ReactiveGreetingResource {

    @Inject
    lateinit var personRepository: PersonRepository

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "Hello RESTEasy Reactives"

}