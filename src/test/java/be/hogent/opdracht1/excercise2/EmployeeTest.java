package be.hogent.opdracht1.excercise2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void getFullName() {
        Employee employee = new Employee("Joske", "Vermeulen");
        Assertions.assertThat(employee.getFullName()).isEqualTo("Joske Vermeulen");
        Assertions.assertThat(employee.getEmployeeID()).isEqualTo("1");
        Assertions.assertThat(employee.toString()).isEqualTo("EmployeeID 1 : Joske Vermeulen");
    }
}
