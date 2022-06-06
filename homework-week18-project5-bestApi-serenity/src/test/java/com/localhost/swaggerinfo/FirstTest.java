package com.localhost.swaggerinfo;

import com.localhost.constants.EndPoints;
import com.localhost.testbase.TestBase;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Test;

public class FirstTest extends TestBase {



    @Test
    public void getAllProduct(){
        SerenityRest.given()
                .when()
                .get(EndPoints.GET_ALL_PRODUCT)
                .then()
                .log().all()
                .statusCode(200);


    }
    @Test
    public void getAllStore(){
        SerenityRest.given()
                .when()
                .get(EndPoints.GET_ALL_STORE)
                .then()
                .log().all()
                .statusCode(200);
    }
    @Test
    public void getAllService(){
        SerenityRest.given()
                .when()
                .get(EndPoints.GET_ALL_SERVICE)
                .then()
                .log().all()
                .statusCode(200);
    }
}
