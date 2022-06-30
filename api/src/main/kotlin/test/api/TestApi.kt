package test.api

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller(value = "/api/test")
class TestApi {
    @Get(value = "/hello")
    fun getAlerts(): HttpResponse<String> {
        return HttpResponse.ok("API Call Received")
    }
}
