package playground.api.bestbuy.products;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetProductsTest extends TestBase {

    @Test
    public void getProducts(){
        Response response = given()
                .header("Accept","application/json")
                .when()
                .get("/products");
        response.then().statusCode(200);
        response.prettyPrint();


    }


}
