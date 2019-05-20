package alex.enterprise.employeeresttest.api.employee.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Employee {

    private Integer id;
    private String name;
    private String passportNumber;
    private String education;

}
