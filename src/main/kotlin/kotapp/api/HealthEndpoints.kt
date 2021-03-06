package kotapp.api

import com.google.inject.Inject
import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.get
import io.ktor.routing.routing


class HealthEndpoints @Inject constructor(ktorApp: Application) {
    init {
        ktorApp.routing {
            get("/healthz") {
                call.respond(HttpStatusCode.OK)
            }
        }
    }
}