package StepObject;

import PageObject.loginPage;
import io.qameta.allure.Step;


public class loginPageStep extends loginPage {
    @Step("ავტორიზაციის გვერძე გადასვლა")
    public loginPageStep goToLoginPage() {
        AuthorizationButton.click();
        return this;


    }

    @Step("იმეილის შევსება მნიშვნელობით: {email}")
    public loginPageStep fillemail(String email) {
        emailInput.setValue(email);
        return this;

    }

    @Step("პაროლის შევსება მნიშვნელობით: {password}")
    public loginPageStep fillpassword(String password) {
        correctpasswordInput.setValue(password);
        return this;
    }

    @Step(" ავტორიზაცია ღილაკზე დაკლიკება")
    public loginPageStep authorizeloginpage() {
        clickLoginButton.click();
        return this;
    }

    @Step("პროფილის გვერძე გადასვლა")
    public loginPageStep myProfile() {
        myProfile.click();
        return this;

    }
}



