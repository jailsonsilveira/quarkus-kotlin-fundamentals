package com.kotlinfundamentals.service

interface GenericCrudService<T, ID> {

    fun findAll(): List<T>

    fun findById(id: ID): T

    fun create(entity: T)

    fun deleteById(id: ID): Boolean

    fun update(entity: T)
}