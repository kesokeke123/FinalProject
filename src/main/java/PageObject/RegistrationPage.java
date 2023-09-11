package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;


public class RegistrationPage {
    public SelenideElement
            AuthorizationButton = $(byText("შესვლა")),
            registrationPageButton = $(byClassName("ui-tabs-anchor"), 1),
            firstNameInput = $(byId("pFirstName")),
            lastNameInput = $(byId("pLastName")),
            emailInput = $(byId("pEmail")),
            phoneInput = $(byId("pPhone")),
            DateBirthInput = $(byId("pDateBirth")),
            GenderInput = $(byId("pGender")),
            PasswordInput = $(byId("pPassword")),
            ConfirmPasswordInput = $(byId("pConfirmPassword")),
            Checkbox = $(byId("pIsAgreeTerns")),
            errorMassage = $(byId("physicalInfoMassage")),
            registrationbutton = $(byAttribute("value", "რეგისტრაცია"));


}
