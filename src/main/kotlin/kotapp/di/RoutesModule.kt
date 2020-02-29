package kotapp.di

import com.google.inject.AbstractModule
import io.ktor.application.Application
import kotapp.api.BlogEndpoints
import kotapp.api.HealthEndpoints

class RoutesModule(private val ktorApp: Application) : AbstractModule() {
    override fun configure() {
        bind(BlogEndpoints::class.java).asEagerSingleton()
        bind(HealthEndpoints::class.java).asEagerSingleton()
        bind(Application::class.java).toInstance(ktorApp)
    }
}