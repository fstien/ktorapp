package kotapp.api

import io.ktor.application.call
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond
import io.ktor.routing.Route
import io.ktor.routing.get

fun Route.Health() {
    get("/healthz") {
        call.respond(HttpStatusCode.OK)
    }
}