package playground.api.bestbuy.products;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.model.ProductsPojo;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class PostProductsTest extends TestBase {
    @Test
    public void postANewProduct(){
        ProductsPojo productsPojo = new ProductsPojo();
        productsPojo.setName("phone");
        productsPojo.setType("mobile");
        productsPojo.setPrice(2000);
        productsPojo.setShipping(1000);
        productsPojo.setUpc("098766543213");
        productsPojo.setDescription("Branded Latest Mobile Phone");
        productsPojo.setManufacturer("Apple");
        productsPojo.setModel("Xpro");
        productsPojo.setUrl("http://www.apple.com/mobiles");
        productsPojo.setImage("image1.png");

        Response response = given()
                .header("Content-Type","application/json")
                .body(productsPojo)
                .when()
                .post("/products");
        response.then().statusCode(201);
        response.prettyPrint();

    }

}
