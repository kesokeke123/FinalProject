import StepObject.ProductsPageStep;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ChromeRunner;

import static DataObject.ProductsPageData.*;

public class ProductsPageTest extends ChromeRunner {
    ProductsPageStep productsPageStep = new ProductsPageStep();

    @Test
    @Description(("პროდუქტის სურვილების სიაში დამატება"))
    @Severity(SeverityLevel.BLOCKER)
    public void AddProduct() {
        productsPageStep.Searchdata()
                .likeProduct()
                .fillEmail(Email)
                .fillPasswordInput(Password)
                .authorizeloginpage()
                .closebutton()
                .WishList()
                .WishListPage();
        Assert.assertTrue(productsPageStep.wishListPage.is(Condition.visible), "სურვილების სიის გვერდის არსებობის შემოწმება");

    }

    @Test
    @Description(("პროდუქტის ყიდვა"))
    @Severity(SeverityLevel.BLOCKER)
    public void BuyProduct() {
        productsPageStep.Searchdata()
                .likeProduct()
                .fillEmail(Email)
                .fillPasswordInput(Password)
                .authorizeloginpage()
                .closebutton()
                .buttonRest()
                .sortPriceInc()
                .chooseProduct()
                .clickBuyProduct()
                .buyProductclick()
                .cardNum()
                .cardDate()
                .cardCvData()
                .PayButton();
        Assert.assertEquals(productsPageStep.errorMass.getText(), errorMassage, "ვალიდაციის არსებობა");


    }
}




