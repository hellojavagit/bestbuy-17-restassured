package playground.api.bestbuy.services;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetServicesTest extends TestBase {

    @Test
    public void getServices() {
        Response response = given()
                .header("Accept", "application/json")
                .when()
                .get("/services");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}