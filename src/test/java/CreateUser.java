import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CreateUser {
    public void createUser() {
        RestAssured.baseURI = "https://reqres.in";
        Response res = given()
                .contentType("application/json")
                .body("{\"name\": \"morpheus\",\"job\": \"leader\"}")
                .when()
                .post("/api/users")
                .then()
                .assertThat().statusCode(201).extract().response();

        JsonPath jsonPath = res.jsonPath();
        String responseBody = res.getBody().asString();
        System.out.println("Response Body:\n" + responseBody);
        System.out.println("Response Body As plain text:\n" + res.asString());
        //System.out.println(jsonPath);
    }
}
