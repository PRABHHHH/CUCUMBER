package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//From here i want ot execute the cucumber file
//i want to run the Login.feature File

@RunWith(Cucumber.class)
//Where is Cucumber Class //PATH
//Glue is telling us where the implementation are under which package
@CucumberOptions(features = {"src/test/resources/Login/Login.feature"},
glue = {"Defination"},dryRun = false,
plugin = {"html:testoutput/cucumber.html","junit:testoutput/cucumber.xml"})   

//dry run will not execute the defination file

public class TestRunner {

}
