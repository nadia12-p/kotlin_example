package com.codersee.annotation

import org.bson.types.ObjectId

@NoArg
data class Company(
    var id: ObjectId? = null,
    var name: String,
    var address: String
)