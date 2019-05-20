package alex.enterprise.employeeresttest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", tags = "@employee", glue = "alex.enterprise.employeeresttest.api", plugin = {"progress", "html:target/cucumber"})
public class EmployeeTestRunner {
}
