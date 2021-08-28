package badcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegisterBusinessTest {
    // Test to fail

    //test to pass

    @Test
    @DisplayName("ทดสอบ ถ้าไม่ใส่ชื่อ")
    public void case01() {
        RegisterBusiness registerBusiness = new RegisterBusiness();
        try {
            registerBusiness.register(null, new Speaker());
            fail();
        } catch (ArgumentNullException e) {

        }
    }
}