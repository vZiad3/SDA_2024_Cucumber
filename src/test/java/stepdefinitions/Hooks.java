//package stepdefinitions;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Scenario;
//import org.junit.Before;
//import org.openqa.selenium.TakesScreenshot;
//import utilities.Driver;
//
//public class Hooks {
//@Before
//public void setUp(Scenario scenario){
//        System.out.println("Before scenario: Setting up the environment....");
//        System.out.println("Scenario id: " + scenario.getId());
//        System.out.println("Scenario name: " + scenario.getName());
//        System.out.println("Scenario isFailed: " + scenario.isFailed());
//       // if(scenario.isFailed()){
//            //=((TakesScreenshot) Driver.getDriver()).getScreenshotAs()
//        //}
//    }
//
//
//    @After
//    public void tearDown(Scenario scenario){
//        System.out.println("After the scenario, cleaning up the test");
//        System.out.println(" scenario status:" + scenario.getStatus() );
//    }
//}
