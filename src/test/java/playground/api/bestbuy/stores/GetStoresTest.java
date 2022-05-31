package playground.api.bestbuy.stores;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetStoresTest extends TestBase {
    @Test
    public void getStores() {
        Response response = given()
                .header("Accept", "application/json")
                .when()
                .get("/stores");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}