package com.tutorial.departmentservice.model;

public record Employee(Long id, Long departmentId, String firstName, String lastName,
String email, int age, String position) {

}
