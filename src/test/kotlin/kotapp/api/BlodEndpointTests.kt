package kotapp.api

import io.ktor.http.HttpMethod
import io.ktor.http.HttpStatusCode
import kotapp.utils.testApplication
import org.amshove.kluent.shouldBe
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BlodEndpointTests {
    @Test
    fun `root route return correct string`() {
        testApplication() {
            with(handleRequest {
                method = HttpMethod.Get
                uri = "/"
            }) {
                response.status() shouldBe HttpStatusCode.OK
                response.content shouldBeEqualTo "My Example Blog2"
            }
        }

    }

}