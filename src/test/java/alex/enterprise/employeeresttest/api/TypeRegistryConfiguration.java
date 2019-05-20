package alex.enterprise.employeeresttest.api;

import alex.enterprise.employeeresttest.api.employee.model.Employee;
import alex.enterprise.employeeresttest.core.emuns.HttpMethod;
import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.cucumberexpressions.ParameterType;
import io.cucumber.datatable.DataTableType;

import java.util.Locale;
import java.util.Map;

import static java.util.Locale.ENGLISH;

public class TypeRegistryConfiguration implements TypeRegistryConfigurer {
    @Override
    public Locale locale() {
        return ENGLISH;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        typeRegistry.defineParameterType(
                new ParameterType<>(
                        "httpMethod",
                        "",
                        HttpMethod.class,
                        HttpMethod::getByStringValue));

        typeRegistry.defineDataTableType(new DataTableType(
                Employee.class,
                (Map<String,String> row) -> new Employee(
                        Integer.valueOf(row.get("id")),
                        row.get("name"),
                        row.get("passportNumber"),
                        row.get("education")
                )
        ));
    }

}
