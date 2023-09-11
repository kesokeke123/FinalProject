package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;


public class LoginPage {
    public SelenideElement
            AuthorizationButton = $(byText("შესვლა")),
            emailInput = $(byId("emailinp")),
            correctpasswordInput = $(byId("feed-password")),
            clickLoginButton = $(byId("AuthBtn")),
            errormassage = $(byId("authInfo")),
            myProfile = $(byClassName("authorisedUser"));


}

