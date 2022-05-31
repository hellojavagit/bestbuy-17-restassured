package playground.api.bestbuy.categories;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.model.CategoriesPojoTest;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class PostCategoriesTest extends TestBase {
    @Test
    public void postCategories(){
        CategoriesPojoTest categoriesPojo = new CategoriesPojoTest();
        categoriesPojo.setName("testing");
        categoriesPojo.setId("xxxxxxyyyy");

        Response response = given()
                .header("Content-Type","application/json")
                .body(categoriesPojo)
                .when()
                .post("/categories");
        response.then().statusCode(201);
        response.prettyPrint();

    }

}
