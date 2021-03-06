/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package kotapp

import com.google.inject.Guice
import io.ktor.application.Application
import kotapp.di.RoutesModule


fun Application.main() {
    Guice.createInjector(
       RoutesModule(this)
    )
}

