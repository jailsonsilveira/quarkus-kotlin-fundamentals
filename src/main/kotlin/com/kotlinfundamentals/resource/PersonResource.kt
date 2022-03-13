package com.kotlinfundamentals.resource

import com.kotlinfundamentals.service.PersonService
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/people")
class PersonResource (private val personService: PersonService) {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun findAll() = personService.findAll()

    @GET
    @Path("/{idPerson}")
    @Produces(MediaType.APPLICATION_JSON)
    fun findById(@PathParam("idPerson") idPerson: Long  ) = personService.findById(idPerson)


}