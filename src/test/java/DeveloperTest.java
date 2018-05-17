import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("John", "L091871Y", 15000.00);
    }



    @Test
    public void hasName(){
        assertEquals("John", developer.getEmployeeName());
    }

    @Test
    public void hasnIno(){
        assertEquals("L091871Y", developer.getEmployeeNIno());
    }

    @Test
    public void hasSalary(){
        assertEquals(15000.00, developer.getEmployeeSalary(), 0.01);
    }


    @ Test
    public void getRaiseSalary(){
        developer.raiseSalary(15000.00);
        assertEquals(16000.00, developer.getEmployeeSalary(), 0.01);
    }

    @Test
    public void getPayBonus(){
        developer.payBonus(15000.00);
        assertEquals(16500.00, developer.getEmployeeSalary(), 0.01);
    }
}
