import StepObject.RegistrationPageStep;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ChromeRunner;

import static DataObject.RegistrationPageData.*;

public class RegisterPageTest extends ChromeRunner {

    RegistrationPageStep registrationPageStep = new RegistrationPageStep();

    @Test
    @Description(("წარუმატებელი რეგისტრაცია"))
    @Severity(SeverityLevel.BLOCKER)
    public void RegisterPageIncorrectData() {
        registrationPageStep.goToRegistrationPage()
                .clickRegistrationPageButton()
                .fillFirstName(FirstName)
                .fillLastName(LastName)
                .fillEmail(Email)
                .fillPhoneNumber(Phone)
                .fillDateBirthInput(DateBirth)
                .fillGenderInput(Gender)
                .fillPasswordInput(Password)
                .fillConfirmPasswordInput(ConfirmIncorrectPassword)
                .markTheCheckbox()
                .clickRegistrationbutton();
        Assert.assertTrue(registrationPageStep.errorMassage.is(Condition.visible), "რეგისტრაციის ვალიდაციის არსებობის შემოწმება");


    }

    @Test
    @Description(("მეილის მნიშვნელობის შედარება"))
    @Severity(SeverityLevel.NORMAL)
    public void RegisterPageGetEmailData() {
        registrationPageStep.goToRegistrationPage()
                .clickRegistrationPageButton()
                .fillFirstName(FirstName)
                .fillLastName(LastName)
                .fillEmail(Email)
                .fillPhoneNumber(Phone)
                .fillDateBirthInput(DateBirth)
                .fillGenderInput(Gender)
                .fillPasswordInput(Password)
                .fillConfirmPasswordInput(Password)
                .markTheCheckbox()
                .clickRegistrationbutton();
        Assert.assertEquals(registrationPageStep.emailInput.getValue(), Email, " მეილის ველის შემოწმება");
    }
}