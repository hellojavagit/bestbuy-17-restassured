package playground.api.bestbuy.stores;

import io.restassured.response.Response;
import org.junit.Test;
import playground.api.bestbuy.model.StoresPojo;
import playground.api.bestbuy.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class PatchStoresTest extends TestBase {
    @Test
    public void patchStoreByID() {
        StoresPojo storesPojo = new StoresPojo();
        storesPojo.setName("abcd");
        storesPojo.setType("Entertainment");
        storesPojo.setAddress("Dudley Road");
        storesPojo.setAddress2("Landudno");
        storesPojo.setCity("Cardiff");
        storesPojo.setState("WALES");
        storesPojo.setZip("145324");
        storesPojo.setLat(1200);
        storesPojo.setLng(1350);
        storesPojo.setHours("10.00am");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(storesPojo)
                .pathParam("id", 8922)
                .when()
                .patch("/stores/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}