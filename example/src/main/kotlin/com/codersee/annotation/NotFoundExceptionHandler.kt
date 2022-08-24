package com.codersee.annotation

import io.micronaut.http.server.exceptions.ExceptionHandler
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Produces
import jakarta.inject.Singleton

@Produces
@Singleton
class NotFoundExceptionHandler :
    ExceptionHandler<NotFoundException, HttpResponse<ExceptionResponse>> {

    override fun handle(
        request: HttpRequest<*>,
        exception: NotFoundException
    ): HttpResponse<ExceptionResponse> =
        HttpResponse.notFound(
            ExceptionResponse(
                message = exception.message
            )
        )

}
