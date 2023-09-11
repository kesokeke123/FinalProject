package StepObject;

import PageObject.RegistrationPage;
import io.qameta.allure.Step;

public class RegistrationPageStep extends RegistrationPage {
    @Step("ავტორიზაციის გვერძე გადასვლა")
    public RegistrationPageStep goToRegistrationPage() {
        AuthorizationButton.click();
        return this;

    }

    @Step("რეგისტრაციის გვერძე გადასვლა")
    public RegistrationPageStep clickRegistrationPageButton() {
        registrationPageButton.click();
        return this;

    }

    @Step("სახელის შევსება მნიშვნელობით: {firstName}")
    public RegistrationPageStep fillFirstName(String firstName) {
        firstNameInput.setValue(firstName);
        return this;

    }

    @Step("გვარის შევსება მნიშვნელობით: {lastName}")
    public RegistrationPageStep fillLastName(String lastName) {
        lastNameInput.setValue(lastName);
        return this;

    }

    @Step("იმეილის შევსება მნიშვნელობით: {email}")
    public RegistrationPageStep fillEmail(String email) {
        emailInput.setValue(email);
        return this;

    }

    @Step("მობილურის ნომრის შევსება მნიშვნელობით: {phone}")
    public RegistrationPageStep fillPhoneNumber(String phone) {
        phoneInput.setValue(phone);
        return this;

    }

    @Step("დაბადების მონაცემების შევსება მნიშვნელობით: {DateBirth}")
    public RegistrationPageStep fillDateBirthInput(String DateBirth) {
        DateBirthInput.setValue(DateBirth);
        return this;
    }

    @Step("სქესის შევსება მნიშვნელობით: {Gender}")
    public RegistrationPageStep fillGenderInput(String Gender) {
        GenderInput.selectOption(Gender);
        return this;


    }

    @Step("პაროლის შევსება მნიშვნელობით: {Password}")
    public RegistrationPageStep fillPasswordInput(String Password) {
        PasswordInput.setValue(Password);
        return this;
    }

    @Step(" გაიმეორე პაროლის შევსება მნიშვნელობით: {ConfirmPassword}")
    public RegistrationPageStep fillConfirmPasswordInput(String ConfirmPassword) {
        ConfirmPasswordInput.setValue(ConfirmPassword);
        return this;
    }

    @Step("ჩეკბოქსის მონიშვნა")
    public RegistrationPageStep markTheCheckbox() {
        Checkbox.click();
        return this;

    }

    @Step("რეგისტრაცია ღილაკზე დაკლიკება")
    public RegistrationPageStep clickRegistrationbutton() {
        registrationbutton.click();
        return this;
    }
}