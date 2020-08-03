package com.example.demo

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Person(
    var name: String,
    var age: Int,
    var height: Int,
    var weight: Int
) {
    @Id
    var id: Long? = null
}