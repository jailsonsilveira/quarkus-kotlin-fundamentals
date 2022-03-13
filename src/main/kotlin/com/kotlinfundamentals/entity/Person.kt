package com.kotlinfundamentals.entity

import com.kotlinfundamentals.entity.enum.PersonStatus
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null;
    var birth: LocalDate? = null;

    lateinit var name: String
    lateinit var status: PersonStatus
}