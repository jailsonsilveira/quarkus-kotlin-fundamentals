package com.kotlinfundamentals.service.impl

import com.kotlinfundamentals.entity.Person
import com.kotlinfundamentals.repository.PersonRepository
import com.kotlinfundamentals.service.PersonService
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class PersonServiceImpl(
    private val personRepository: PersonRepository
) : PersonService {

    override fun findAll() = personRepository.listAll()

    override fun findById(id: Long) = personRepository.findById(id) ?: throw Exception("ID not found")

    override fun create(entity: Person) = personRepository.persist(entity)

    override fun deleteById(id: Long) = personRepository.deleteById(id)

    override fun update(entity: Person) = personRepository.persist(entity)

}