package StepObject;

import PageObject.registrationPage;
import io.qameta.allure.Step;

public class registrationPageStep extends registrationPage {
    @Step("ავტორიზაციის გვერძე გადასვლა")
    public registrationPageStep goToRegistrationPage() {
        AuthorizationButton.click();
        return this;

    }

    @Step("რეგისტრაციის გვერძე გადასვლა")
    public registrationPageStep clickRegistrationPageButton() {
        registrationPageButton.click();
        return this;

    }

    @Step("სახელის შევსება მნიშვნელობით: {firstName}")
    public registrationPageStep fillFirstName(String firstName) {
        firstNameInput.setValue(firstName);
        return this;

    }

    @Step("გვარის შევსება მნიშვნელობით: {lastName}")
    public registrationPageStep fillLastName(String lastName) {
        lastNameInput.setValue(lastName);
        return this;

    }

    @Step("იმეილის შევსება მნიშვნელობით: {email}")
    public registrationPageStep fillEmail(String email) {
        emailInput.setValue(email);
        return this;

    }

    @Step("მობილურის ნომრის შევსება მნიშვნელობით: {phone}")
    public registrationPageStep fillPhoneNumber(String phone) {
        phoneInput.setValue(phone);
        return this;

    }

    @Step("დაბადების მონაცემების შევსება მნიშვნელობით: {DateBirth}")
    public registrationPageStep fillDateBirthInput(String DateBirth) {
        DateBirthInput.setValue(DateBirth);
        return this;
    }

    @Step("სქესის შევსება მნიშვნელობით: {Gender}")
    public registrationPageStep fillGenderInput(String Gender) {
        GenderInput.selectOption(Gender);
        return this;


    }

    @Step("პაროლის შევსება მნიშვნელობით: {Password}")
    public registrationPageStep fillPasswordInput(String Password) {
        PasswordInput.setValue(Password);
        return this;
    }

    @Step(" გაიმეორე პაროლის შევსება მნიშვნელობით: {ConfirmPassword}")
    public registrationPageStep fillConfirmPasswordInput(String ConfirmPassword) {
        ConfirmPasswordInput.setValue(ConfirmPassword);
        return this;
    }

    @Step("ჩეკბოქსის მონიშვნა")
    public registrationPageStep markTheCheckbox() {
        Checkbox.click();
        return this;

    }

    @Step("რეგისტრაცია ღილაკზე დაკლიკება")
    public registrationPageStep clickRegistrationbutton() {
        registrationbutton.click();
        return this;
    }
}