package playground.api.bestbuy.services;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetServicesByIdTest extends TestBase {
    @Test
    public void getServices() {
        Response response = given()
                .header("Accept", "application/json")
                .pathParam("id", 6)
                .when()
                .get("/services/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
