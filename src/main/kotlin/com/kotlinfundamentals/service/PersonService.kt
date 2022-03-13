package com.kotlinfundamentals.service

import com.kotlinfundamentals.entity.Person

interface PersonService: GenericCrudService<Person, Long> {
}