import StepObject.productsPageStep;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ChromeRunner;

import static DataObject.productsPageData.Email;
import static DataObject.productsPageData.Password;

public class productsPageTest extends ChromeRunner {
    productsPageStep productsPageStep = new productsPageStep();

    @Test
    @Description(("პროდუქტის სურვილების სიაში დამატება"))
    @Severity(SeverityLevel.BLOCKER)
    public void addproduct() {
        productsPageStep.Searchdata()
                .likeProduct()
                .fillEmail(Email)
                .fillPasswordInput(Password)
                .authorizeloginpage()
                .WishList()
                .WishListPage();
        Assert.assertTrue(productsPageStep.wishListPage.is(Condition.visible), "სურვილების სიის გვერდის არსებობის შემოწმება");

    }

    @Test
    @Description(("პროდუქტის სურვილების სიაში დამატება"))
    @Severity(SeverityLevel.BLOCKER)
    public void addProductWishList() {
        productsPageStep.Searchdata()
                .likeProduct()
                .fillEmail(Email)
                .fillPasswordInput(Password)
                .authorizeloginpage()
                .WishList()
                .WishListPage();
        Assert.assertTrue(productsPageStep.wishListPage.is(Condition.visible), "სურვილების სიის გვერდის არსებობის შემოწმება");
    }


}

