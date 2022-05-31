package playground.api.bestbuy.services;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.model.ServicesPojoTest;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class PatchServicesIdTest extends TestBase {
    @Test
    public void patchServices() {

        ServicesPojoTest servicesPojo = new ServicesPojoTest();
        servicesPojo.setName("TESTING Skills");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(servicesPojo)
                .pathParam("id", 24)
                .when()
                .patch("/services/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}

