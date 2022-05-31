package playground.api.bestbuy.services;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class DeleteServicesTest extends TestBase {
    @Test
    public void deleteServices() {
        Response response = given()
                .pathParam("id", 24)
                .when()
                .delete("/services/{id}");
        response.then().statusCode(404);
        response.prettyPrint();

    }

}
