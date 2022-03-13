package com.kotlinfundamentals.repository

import com.kotlinfundamentals.entity.Person
import com.kotlinfundamentals.entity.enum.PersonStatus
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class PersonRepository: PanacheRepository<Person> {
    fun findByName(name: String) = find("name", name).firstResult()
    fun findAlive() = list("status", PersonStatus.Alive)
    fun deleteStefs() = delete("name", "Stef")
}