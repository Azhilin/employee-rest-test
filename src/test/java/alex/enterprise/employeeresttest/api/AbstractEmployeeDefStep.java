package alex.enterprise.employeeresttest.api;

import alex.enterprise.employeeresttest.EmployeeRestTestApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = EmployeeRestTestApplication.class)
@SpringBootTest
public abstract class AbstractEmployeeDefStep {
}
