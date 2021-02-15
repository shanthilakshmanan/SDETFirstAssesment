package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Shanthi_bkp\\CRD_Project\\Study Materials\\ManipalPro\\SeleniumManipalPro_CucumberTestProj\\SDETAssessment1\\src\\test\\resources\\Feature\\01elearnLogin.feature",
//		"C:\\Shanthi_bkp\\CRD_Project\\Study Materials\\ManipalPro\\SeleniumManipalPro_CucumberTestProj\\SDETAssessment1\\src\\test\\resources\\Feature\\02elearnEmail.feature"
		}
,glue= {"Steps"}
,monochrome=true
,dryRun=false

		)
public class ElearnTestRunner {

}
