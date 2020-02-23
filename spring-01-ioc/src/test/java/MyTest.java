
import dao.UserDaoOracleImpl;
import service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserdao(new UserDaoOracleImpl());
        userService.getUser();
    }
}
