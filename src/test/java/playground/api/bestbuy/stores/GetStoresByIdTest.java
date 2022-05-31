package playground.api.bestbuy.stores;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetStoresByIdTest extends TestBase {
    @Test
    public void getStoresById() {
        Response response = given()
                //.header("Accept", "application/json")
                .pathParam("id", 10)
                .when()
                .get("/stores/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}