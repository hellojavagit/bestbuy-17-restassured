package playground.api.bestbuy.products;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.model.ProductsPojo;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class UpdateProductsTest extends TestBase {
    @Test
    public void postANewProduct() {
        ProductsPojo productsPojo = new ProductsPojo();
        productsPojo.setName("phone");
        productsPojo.setType("mobile");
        productsPojo.setPrice(2000);
        productsPojo.setShipping(1000);
        productsPojo.setUpc("198766543213");
        productsPojo.setDescription("Branded Latest Mobile Phone");
        productsPojo.setManufacturer("SAMSUNG");
        productsPojo.setModel("Galaxy");
        productsPojo.setUrl("http://www.samsung.com/mobiles");
        productsPojo.setImage("image2.png");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(productsPojo)
                .pathParam("id", 9999681)
                .when()
                .patch("/products/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
