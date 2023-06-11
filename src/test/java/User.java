import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class User {




    public void callUser() {
        //RestAssured.get() = "http://reqres.in/api/users?page=2";
        RestAssured.baseURI = "https://reqres.in";
        Response res = given()
                .when()
                .get("/api/users?page=2")
                .then()
                .assertThat().statusCode(200).extract().response();

        JsonPath jsonPath = res.jsonPath();
        String responseBody = res.getBody().asString();
        System.out.println("Response Body:\n" + responseBody);
        System.out.println("Response Body As plain text:\n" + res.asString());


    }









}



