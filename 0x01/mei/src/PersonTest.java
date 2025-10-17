import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    private Person pessoa;

    @BeforeEach
    public void setup() {
        pessoa = new Person();
        pessoa.setName("Paul");
        pessoa.setSurname("McCartney");
        pessoa.setBirthDate(new Date(100, 0, 1));
        pessoa.setAnotherCompanyOwner(true);
        pessoa.setPensioner(true);
        pessoa.setPublicServer(true);
    }

    @Test
    public void show_full_name() {
        assertEquals("Paul McCartney", pessoa.fullName());
    }

    @Test
    public void test_calculateYearlySalary() {
        pessoa.setSalary(1200);
        assertEquals(14400, pessoa.calculateYearlySalary());
    }

    @Test
    public void person_is_MEI() {
        pessoa.setAnotherCompanyOwner(false);
        pessoa.setPensioner(false);
        pessoa.setPublicServer(false);
        assertTrue(pessoa.isMEI());
    }

    @Test
    public void person_is_not_MEI() {
        pessoa.setAnotherCompanyOwner(true);
        pessoa.setPensioner(true);
        pessoa.setPublicServer(true);
        assertFalse(pessoa.isMEI());
    }
}