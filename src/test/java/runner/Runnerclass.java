package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import iptbase.Baseclass;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Gateway\\eclipse-workspace\\Limeroadipt\\src\\test\\java\\feature\\lime.feature",
glue="stepdef",
monochrome=true,dryRun=false,plugin= {"pretty",
		"html:Reports/Limeroadipt.html",
		"json:Reports/Limeroadipt.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class Runnerclass extends Baseclass
{

	}
	

