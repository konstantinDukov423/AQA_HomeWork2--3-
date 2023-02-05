import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    void PostmanEchoTest() {
        // Given - When - Then
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Пасхалка для ревьювера. А как посмотреть в IDEA сам респонс ответ? Пришлось смотреть через постман, т.к тут не нашёл где ")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("Пасхалка для ревьювера. А как посмотреть в IDEA сам респонс ответ? Пришлось смотреть через постман, т.к тут не нашёл где "))
        ;
    }
}
