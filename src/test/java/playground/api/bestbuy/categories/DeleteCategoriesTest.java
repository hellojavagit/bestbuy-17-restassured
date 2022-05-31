package playground.api.bestbuy.categories;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class DeleteCategoriesTest extends TestBase {

    @Test
    public void deleteProductById() {
        Response response = given()
                .pathParam("id",  "xxxxxxyyyy")
                .when()
                .delete("/categories/{id}");
        response.then().statusCode(404);
        response.prettyPrint();

    }
}
