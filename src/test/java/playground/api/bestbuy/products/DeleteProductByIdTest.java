package playground.api.bestbuy.products;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class DeleteProductByIdTest extends TestBase {
    @Test
    public void deleteProductById() {
        Response response = given()
                .pathParam("id", 9999681)
                .when()
                .delete("/products/{id}");
        response.then().statusCode(404);
        response.prettyPrint();

    }

}
