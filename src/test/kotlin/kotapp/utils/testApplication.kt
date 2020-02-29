package kotapp.utils

import com.google.inject.Guice
import io.ktor.application.Application
import io.ktor.server.testing.TestApplicationEngine
import io.ktor.server.testing.withTestApplication
import kotapp.api.installFeatures
import kotapp.di.RoutesModule

fun Application.configure() {
    Guice.createInjector(
        RoutesModule(this)
    )
}

fun <R> testApplication(test: TestApplicationEngine.() -> R) = withTestApplication({
    installFeatures()
    configure()
}, test)