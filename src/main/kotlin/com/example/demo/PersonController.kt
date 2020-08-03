package com.example.demo

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/persons")
class PersonController(private val personRepository: PersonRepository) {

    @GetMapping
    fun findAll(): MutableIterable<Person> = personRepository.findAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable("id") id: Long): Person = personRepository.findById(id).orElseThrow()

    @PostMapping
    fun save(@RequestBody person: Person) {
        personRepository.save(person)
    }
}