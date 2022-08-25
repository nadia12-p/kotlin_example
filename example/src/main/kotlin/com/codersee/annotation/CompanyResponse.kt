package com.codersee.annotation

import org.bson.types.ObjectId

class CompanyResponse(
    val id: String,
    val name: String,
    val address: String
) {
    companion object {
        fun fromEntity(company: Company): CompanyResponse =
            CompanyResponse(
                id = company.id!!.toHexString(),
                name = company.name,
                address = company.address
            )
    }
}