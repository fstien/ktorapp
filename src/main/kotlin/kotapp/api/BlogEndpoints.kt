package kotapp.api

import com.google.inject.Inject
import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing

class BlogEndpoints @Inject constructor(ktorApp: Application) {
    init {
        ktorApp.routing {
            get("/") {
                call.respondText("My Example Blog2", ContentType.Text.Html)
            }
        }
    }
}