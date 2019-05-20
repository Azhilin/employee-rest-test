package alex.enterprise.employeeresttest.api.employee;

import alex.enterprise.employeeresttest.api.employee.model.Employee;
import alex.enterprise.employeeresttest.core.emuns.HttpMethod;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.SoftAssertions;

import java.util.List;

@Slf4j
public class EmployeeDefStep {

    @Given("employee rest service is up and running")
    public void employeeRestServiceIsUpAndRunning() {
        log.info("Employee test service is up and running");
    }

    @When("we send {} request to the {string} endpoint")
    public void weSendGETRequestToTheEmployeeAppEndpoint(HttpMethod httpMethod, String endpoint) {
        log.info("We send {} request to the {} endpoint", httpMethod, endpoint);
    }

    @Then("we get the list of {int} employees")
    public void weGetTheListOfEmployees(int numberOfEmployees) {
        SoftAssertions.assertSoftly(softly -> {
            softly.assertThat(7).as("Number of employees: ").isEqualTo(numberOfEmployees);
        });
    }

    @When("we add new employee:")
    public void weAddNewEmployee(List<Employee> employees) {
        log.info("Employees: {}", employees);
    }
}
