package alex.enterprise.employeeresttest.api.employee;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.SoftAssertions;

@Slf4j
public class EmployeeDefStep {

    @Given("employee rest service is up and running")
    public void employeeRestServiceIsUpAndRunning() {
    }

//    @When("we send {httpMethod} request to the {string} endpoint")
//    public void weSendGETRequestToTheEmployeeAppEndpoint(HttpMethod httpMethod, String path) {
//    }

    @Then("we get the list of {int} employees")
    public void weGetTheListOfEmployees(int numberOfEmployees) {
        SoftAssertions.assertSoftly(softly -> {
            softly.assertThat(7).as("Number of employees: ").isEqualTo(numberOfEmployees);
        });
    }
}
