package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class productsPage {
    public SelenideElement
            searchInput=  $(byClassName("reheadersearch")),
            addProduct = $(byClassName("deal-box-wishlist"),0),
            emailInput = $(byId("emailinp")),
            PasswordInput = $(byId("feed-password")),
             clickLoginButton=$(byId("AuthBtn")),
            addProductWishList=$(byClassName("add-wish-animation"),1),
            wishListPage=$(byClassName("HeaderTools"),0),
            restButton=$(byClassName("MenuIcon"),2),
            sort=$(byId("sort"));



}
