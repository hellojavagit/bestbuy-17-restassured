package playground.api.bestbuy.categories;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetCategoriesByIdTest extends TestBase {
    @Test
    public void getProducts() {
        Response response = given()
                .header("Accept", "application/json")
                .pathParam("id","pcmcat748300579354")
                .when()
                .get("/categories/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}