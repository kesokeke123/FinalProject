package StepObject;

import PageObject.productsPage;
import io.qameta.allure.Step;

import static DataObject.productsPageData.search;

public class productsPageStep extends productsPage {
    @Step("პროდუქტის ძიება ")
    public productsPageStep Searchdata() {
        searchInput.setValue(search).pressEnter();
        return this;

    }


    @Step("პროდუქტის მოწონება")
    public productsPageStep likeProduct() {
        addProduct.click();
        return this;
    }

    @Step("იმეილის შევსება მნიშვნელობით: {email}")
    public productsPageStep fillEmail(String email) {
        emailInput.setValue(email);
        return this;

    }

    @Step("პაროლის შევსება მნიშვნელობით: {Password}")
    public productsPageStep fillPasswordInput(String Password) {
        PasswordInput.setValue(Password);
        return this;
    }

    @Step(" ავტორიზაცია ღილაკზე დაკლიკება")
    public productsPageStep authorizeloginpage() {
        clickLoginButton.click();
        return this;
    }

    @Step("პროდუქტის მოწონება ")
    public productsPageStep WishList() {
        addProductWishList.click();
        return this;
    }

    @Step("სურვილების სიის გვერძე გადასვლა")
    public productsPageStep WishListPage() {
        wishListPage.click();
        return this;
    }


}



