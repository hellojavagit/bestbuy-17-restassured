package playground.api.bestbuy.services;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.model.ServicesPojoTest;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class PostServicesTest extends TestBase {

    @Test
    public void postServices(){
        ServicesPojoTest servicesPojo = new ServicesPojoTest();
        servicesPojo.setName("TESTING");

        Response response = given()
                .header("Content-Type","application/json")
                .body(servicesPojo)
                .when()
                .post("/services");
        response.then().statusCode(201);
        response.prettyPrint();

    }
}
