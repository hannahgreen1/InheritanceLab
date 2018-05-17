import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Lisa", "W123456C", 1500.00);
    }



    @Test
    public void hasName(){
        assertEquals("Lisa", databaseAdmin.getEmployeeName());
    }

    @Test
    public void hasnIno(){
        assertEquals("W123456C", databaseAdmin.getEmployeeNIno());
    }

    @Test
    public void hasSalary(){
        assertEquals(1500.00, databaseAdmin.getEmployeeSalary(), 0.01);
    }


    @ Test
    public void getRaiseSalary(){
        databaseAdmin.raiseSalary(1500.00);
        assertEquals(2500.00, databaseAdmin.getEmployeeSalary(), 0.01);
    }

    @Test
    public void getPayBonus(){
        databaseAdmin.payBonus(1500.00);
        assertEquals(1650.00, databaseAdmin.getEmployeeSalary(), 0.01);
    }
}
