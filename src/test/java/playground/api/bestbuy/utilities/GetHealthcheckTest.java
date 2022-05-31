package playground.api.bestbuy.utilities;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetHealthcheckTest extends TestBase {
    @Test
    public void getVersion() {
        Response response = given()
                .header("Accept", "application/json")
                .when()
                .get("/healthcheck");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}