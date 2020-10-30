//package StepDefinitions;
//
//import Pages.DialogContent;
//import Utilities.Driver;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import org.openqa.selenium.WebDriver;
//
//public class LoginSteps {
//
//    WebDriver driver;
//
//    @Given("^Navigate to basqar$")
//    public void navigate_to_basqar() {
//        driver = Driver.getDriver();
//        driver.get("https://test.basqar.techno.study/");
//    }
//
//    @When("^Enter username and password and click Login button$")
//    public void enter_username_and_password_and_click_Login_button()  {
//
//        DialogContent dialogContent = new DialogContent(driver);
//
//        //dialogContent.username.sendKeys("daulet2030@gmail.com");
//        dialogContent.findElementAndSendKeysFunction("username","daulet2030@gmail.com");
//        //dialogContent.password.sendKeys("TechnoStudy123@");
//        dialogContent.findElementAndSendKeysFunction("password","TechnoStudy123@");
//
////        try {
////            Thread.sleep(3000);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//
//        //dialogContent.loginButton.click();
//        dialogContent.findElementAndClickFunction("loginButton");
//
//        //dialogContent.gotItBtn.click();
//        dialogContent.findElementAndClickFunction("gotItBtn");
//
//
//        /**
//         * Siteyle ilgili yaptığım genel işlemler
//         * 1- bir butona tıklamak ne gerekiyor: bekleme , kaydırma gerekebiliyor.
//         * 2- bir inputa veri göndermek için ne gerekiyor : bekleme, kaydırma, clear
//         */
//    }
//
//    @Then("^User should login successfully$")
//    public void user_should_login_successfully() {
//
//    }
//
//}
