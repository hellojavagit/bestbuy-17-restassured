package playground.api.bestbuy.categories;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetCategoriesTest extends TestBase {
    @Test
    public void getProducts() {
        Response response = given()
                .header("Accept", "application/json")
                .when()
                .get("/categories");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
