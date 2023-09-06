import StepObject.loginPageStep;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ChromeRunner;

import java.time.Duration;

import static DataObject.loginPageData.*;

public class loginPageTest extends ChromeRunner {
    loginPageStep loginPageStep = new loginPageStep();

    @Test
    @Description(("წარმატებული ავტორიზაცია"))
    @Severity(SeverityLevel.BLOCKER)
    public void loginPageCorrectdata() {
        loginPageStep.goToLoginPage()
                .fillemail(Email)
                .fillpassword(Password)
                .authorizeloginpage()
                .myProfile();
        Assert.assertTrue(loginPageStep.myProfile.is(Condition.visible),"პროფილის გვერდის არსებობის შემოწმება");


    }

    @Test
    @Description(("წარუმატებელი ავტორიზაცია"))
    @Severity(SeverityLevel.BLOCKER)
    public void loginPageIncorrectPassword() {
        loginPageStep.goToLoginPage()
                .fillemail(Email)
                .fillpassword(incorrectPassword)
                .authorizeloginpage()
                .errormassage.shouldBe(Condition.visible, Duration.ofMillis(3000));
        Assert.assertTrue(loginPageStep.errormassage.is(Condition.visible),"ავტორიზაციის ვალიდაციის შემოწმება");


    }

    @Test
    @Description(("წარუმატებელი ავტორიზაცია"))
    @Severity(SeverityLevel.BLOCKER)
    public void loginPageIncorrectEmail() {
        loginPageStep.goToLoginPage()
                .fillemail(incorrectEmail)
                .fillpassword(Password)
                .authorizeloginpage()
                .errormassage.shouldBe(Condition.visible, Duration.ofMillis(3000));
        Assert.assertTrue(loginPageStep.errormassage.is(Condition.appear),"ავტორიზაციის ვალიდაციის შემოწმება");
    }
}