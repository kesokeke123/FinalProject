import StepObject.LoginPageStep;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ChromeRunner;

import java.time.Duration;

import static DataObject.LoginPageData.*;

public class LoginPageTest extends ChromeRunner {
    LoginPageStep LoginPageStep = new LoginPageStep();

    @Test
    @Description(("წარმატებული ავტორიზაცია"))
    @Severity(SeverityLevel.BLOCKER)
    public void LoginPageCorrectdata() {
        LoginPageStep.goToLoginPage()
                .fillemail(Email)
                .fillpassword(Password)
                .authorizeloginpage()
                .myProfile();
        Assert.assertTrue(LoginPageStep.myProfile.is(Condition.visible),"პროფილის გვერდის არსებობის შემოწმება");


    }

    @Test
    @Description(("წარუმატებელი ავტორიზაცია"))
    @Severity(SeverityLevel.BLOCKER)
    public void LoginPageIncorrectPassword() {
        LoginPageStep.goToLoginPage()
                .fillemail(Email)
                .fillpassword(incorrectPassword)
                .authorizeloginpage()
                .errormassage.shouldBe(Condition.visible, Duration.ofMillis(3000));
        Assert.assertTrue(LoginPageStep.errormassage.is(Condition.visible),"ავტორიზაციის ვალიდაციის შემოწმება");


    }

    @Test
    @Description(("წარუმატებელი ავტორიზაცია"))
    @Severity(SeverityLevel.BLOCKER)
    public void LoginPageIncorrectEmail() {
        LoginPageStep.goToLoginPage()
                .fillemail(incorrectEmail)
                .fillpassword(Password)
                .authorizeloginpage()
                .errormassage.shouldBe(Condition.visible, Duration.ofMillis(3000));
        Assert.assertTrue(LoginPageStep.errormassage.is(Condition.appear),"ავტორიზაციის ვალიდაციის შემოწმება");
    }
}