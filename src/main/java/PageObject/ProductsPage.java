package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class ProductsPage {
    public SelenideElement
            searchInput = $(byClassName("reheadersearch")),
            addProduct = $(byClassName("deal-box-wishlist"), 0),
            emailInput = $(byId("emailinp")),
            PasswordInput = $(byId("feed-password")),
            clickLoginButton = $(byId("AuthBtn")),
            addProductWishList = $(byClassName("add-wish-animation"), 1),
            wishListPage = $(byClassName("HeaderTools"), 0),
            restButton = $(byClassName("MenuIcon"), 2),
            sortPriceIncreases = $(byId("sort")),
            chooseHotel = $(byText("სასტუმრო მესტიაში")),
            buyProductButton = $(byClassName("checkout__button")),
            AuthorizationButton = $(byText("შესვლა")),
            buyProduct = $(byClassName("totals__button")),
            cardNumber = $(byId("cardNumber")),
            cardExpirationDate = $(byId("cardExpirationDateCustom")),
            cardCv = $(byId("cvc2")),
            cardPayButton = $(byId("payment-submit")),

            close = $(byId("close")),
            errorMass=$(byText("გადახდა უარყოფილია"));


}
