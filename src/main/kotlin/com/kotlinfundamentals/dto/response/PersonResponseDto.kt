package com.kotlinfundamentals.dto.response

import com.kotlinfundamentals.entity.enum.PersonStatus
import java.time.LocalDate

data class PersonResponseDto (
    val id: Long?,
    val birth: LocalDate?,
    val name: String,
    val status: PersonStatus
)