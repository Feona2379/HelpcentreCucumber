package cucumberTest;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Javacourse\\HelpcentreCucumber\\Features\\Test.feature",
    glue = {"steps"}

				)

public class Runner {
	

}
