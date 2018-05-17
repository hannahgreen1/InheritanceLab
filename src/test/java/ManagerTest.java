import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bob", "NI232578C", 12000.00, "Testing");
    }

    @Test
    public void hasName(){
        assertEquals("Bob", manager.getEmployeeName());
    }

    @Test
    public void hasnIno(){
        assertEquals("NI232578C", manager.getEmployeeNIno());
    }

    @Test
    public void hasSalary(){
        assertEquals(12000.00, manager.getEmployeeSalary(), 0.01);
    }

    @Test
    public void hasdeptName(){
        assertEquals("Testing", manager.getDeptName());
    }

    @ Test
    public void getRaiseSalary(){
        manager.raiseSalary(12000.00);
        assertEquals(13000.00, manager.getEmployeeSalary(), 0.01);
    }

    @Test
    public void getPayBonus(){
        manager.payBonus(12000.00);
        assertEquals(13200.00, manager.getEmployeeSalary(), 0.01);
    }
}
