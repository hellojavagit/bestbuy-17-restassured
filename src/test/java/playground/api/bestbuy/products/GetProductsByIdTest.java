package playground.api.bestbuy.products;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetProductsByIdTest extends TestBase {
    @Test
    public void getProductsById() {
        Response response = given()
                //.header("Accept", "application/json")
                .pathParam("id", 150115)
                .when()
                .get("/products/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}