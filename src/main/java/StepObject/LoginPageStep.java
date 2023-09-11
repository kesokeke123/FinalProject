package StepObject;

import PageObject.LoginPage;
import io.qameta.allure.Step;


public class LoginPageStep extends LoginPage {
    @Step("ავტორიზაციის გვერძე გადასვლა")
    public LoginPageStep goToLoginPage() {
        AuthorizationButton.click();
        return this;


    }

    @Step("იმეილის შევსება მნიშვნელობით: {email}")
    public LoginPageStep fillemail(String email) {
        emailInput.setValue(email);
        return this;

    }

    @Step("პაროლის შევსება მნიშვნელობით: {password}")
    public LoginPageStep fillpassword(String password) {
        correctpasswordInput.setValue(password);
        return this;
    }

    @Step(" ავტორიზაცია ღილაკზე დაკლიკება")
    public LoginPageStep authorizeloginpage() {
        clickLoginButton.click();
        return this;
    }

    @Step("პროფილის გვერძე გადასვლა")
    public LoginPageStep myProfile() {
        myProfile.click();
        return this;

    }
}



