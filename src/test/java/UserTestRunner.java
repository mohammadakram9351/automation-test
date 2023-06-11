import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

public class UserTestRunner {
    User user;
    CreateUser createUser;
    @Test(priority = 1)
    public void getUser(){
        user = new User();
        user.callUser();


    }
    @Test(priority = 2)

    public void createUser(){
        createUser = new CreateUser();
        createUser.createUser();
    }

}
