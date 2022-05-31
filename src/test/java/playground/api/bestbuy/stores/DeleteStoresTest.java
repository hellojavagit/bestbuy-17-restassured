package playground.api.bestbuy.stores;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class DeleteStoresTest extends TestBase {
    @Test
    public void deleteProductById() {
        Response response = given()
                .pathParam("id", 8922)
                .when()
                .delete("/products/{id}");
        response.then().statusCode(404);
        response.prettyPrint();

    }

}
