import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.AccountingSystem;
import model.Category;
import model.User;
import model.UserType;
import persistenceController.AccountingSystemHib;
import persistenceController.CategoryHibController;
import persistenceController.UserHibController;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


//--------Create user
//        UserHibController userHibController = new UserHibController(factory);
//        userHibController.create(new User(UserType.ADMIN, "test", "test", "test"));
//--------Get user
//        List<User> responsibleUsers = new ArrayList<User>();
//        User user = userHibController.getByName("test");
//        responsibleUsers.add(user);
//--------Create category with responsible user
//        Category category = new Category("yes", "desc", responsibleUsers);
//--------Add to user object category
//        user.getCategories().add(category);
//        CategoryHibController categoryHibController = new CategoryHibController(factory);
//--------Save category to system
//        categoryHibController.create(category);
//

public class StartApp {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("accounting_hib");
        UserHibController userHibController = new UserHibController(factory);
//
//        AccountingSystem accountingSystem = new AccountingSystem("Demo", LocalDate.now(), "v1", 0, 0);
//        User tempUser = new User(UserType.PRIVATE, "Tomas", "password", "Vilnius");
//        User adminUser = new User(UserType.ADMIN, "admin", "admin", "");
//        accountingSystem.getUsers().add(tempUser);
//        accountingSystem.getUsers().add(adminUser);
//
//        tempUser.setAccountingSystem(accountingSystem);
//        adminUser.setAccountingSystem(accountingSystem);
//
        AccountingSystemHib accountingSystemHib = new AccountingSystemHib(factory);
//        accountingSystemHib.create(accountingSystem);

//        Category category = new Category("yes", "yes");
//        User user = userHibController.getById(3);
//        user.getCategories().add(category);
//        category.getResponsibleUsers().add(user);
//        AccountingSystem accountingSystem = accountingSystemHib.getById(2);
//        category.setAccountingSystem(accountingSystem);
//        CategoryHibController categoryHibController = new CategoryHibController(factory);
//        categoryHibController.create(category);
        userHibController.delete(3);
//        AccountingSystemHib accountingSystemHib = new AccountingSystemHib(factory);
//        accountingSystemHib.delete(1);
    }
}

//public class StartApp extends Application {
//    @Override
//    public void start(Stage primaryStage) throws Exception{
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/StartWindow.fxml"));
//        Parent root = loader.load();
//        primaryStage.setTitle("Accounting System");
//        primaryStage.setScene(new Scene(root, 800, 600));
//        primaryStage.show();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
