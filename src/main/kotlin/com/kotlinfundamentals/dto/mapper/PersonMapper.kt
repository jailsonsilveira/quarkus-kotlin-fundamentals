package com.kotlinfundamentals.dto.mapper

import com.kotlinfundamentals.dto.response.PersonResponseDto
import com.kotlinfundamentals.entity.Person

class PersonMapper {

    fun Person.toPersonResponseDto() =
        PersonResponseDto(
            id = this.id,
            name = this.name,
            birth = this.birth,
            status = this.status
        )
    
}