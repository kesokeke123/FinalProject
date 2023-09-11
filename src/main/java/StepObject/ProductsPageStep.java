package StepObject;

import PageObject.ProductsPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

import static DataObject.ProductsPageData.*;

public class ProductsPageStep extends ProductsPage {
    @Step("პროდუქტის ძიება ")
    public ProductsPageStep Searchdata() {
        searchInput.setValue(search).pressEnter();
        return this;

    }


    @Step("პროდუქტის მოწონება")
    public ProductsPageStep likeProduct() {
        addProduct.click();
        return this;
    }

    @Step("იმეილის შევსება მნიშვნელობით: {email}")
    public ProductsPageStep fillEmail(String email) {
        emailInput.setValue(email);
        return this;

    }

    @Step("პაროლის შევსება მნიშვნელობით: {Password}")
    public ProductsPageStep fillPasswordInput(String Password) {
        PasswordInput.setValue(Password);
        return this;
    }

    @Step(" ავტორიზაცია ღილაკზე დაკლიკება")
    public ProductsPageStep authorizeloginpage() {
        clickLoginButton.click();
        return this;
    }

    @Step("პროდუქტის მოწონება ")
    public ProductsPageStep WishList() {
        addProductWishList.click();
        return this;
    }

    @Step("სურვილების სიის გვერძე გადასვლა")
    public ProductsPageStep WishListPage() {
        wishListPage.click();
        return this;
    }

    @Step("ავტორიზაცია")
    public ProductsPageStep buttonRest() {
        restButton.shouldBe(Condition.visible, Duration.ofMillis(3000)).click();
        return this;


    }

    @Step("დასვენება ღილაკზე დაკლიკება")
    public ProductsPageStep authorization() {
        AuthorizationButton.click();
        return this;


    }

    @Step("სორტირება ფასის ზრდადობის მიხედვით")
    public ProductsPageStep sortPriceInc() {
        sortPriceIncreases.selectOption(productPrice);
        return this;


    }

    @Step("პროდუქტის არჩევა")
    public ProductsPageStep chooseProduct() {
        chooseHotel.click();
        return this;


    }

    @Step("ყიდვა ღილაკზე დაკლიკება ")
    public ProductsPageStep clickBuyProduct() {
        buyProductButton.click();
        return this;
    }

    @Step("პროდუქტის ყიდვა")
    public ProductsPageStep buyProductclick() {
        buyProduct.shouldBe(Condition.visible,Duration.ofMillis(5000)).click();
        return this;
    }

    @Step("პროდუქტის ყიდვა")
    public ProductsPageStep cardNum() {
        cardNumber.setValue(cardnumber);
        return this;
    }

    @Step("პროდუქტის ყიდვა")
    public ProductsPageStep cardDate() {
        cardExpirationDate.setValue(cardexpirationdate);
        return this;
    }

    @Step("პროდუქტის ყიდვა")
    public ProductsPageStep cardCvData() {
        cardCv.setValue(cardcv);
        return this;
    }

    @Step("პროდუქტის ყიდვა")
    public ProductsPageStep PayButton() {
        cardPayButton.click();
        return this;
    }

    @Step("პროდუქტის ყიდვა")
    public ProductsPageStep closebutton() {
        close.click();
        return this;
    }
}




