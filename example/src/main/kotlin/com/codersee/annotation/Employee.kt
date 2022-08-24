package com.codersee.annotation

import org.bson.types.ObjectId

@NoArg
data class Employee(
    var id: ObjectId? = null,
    var firstName: String,
    var lastName: String,
    var email: String,
    var company: Company?,
)

