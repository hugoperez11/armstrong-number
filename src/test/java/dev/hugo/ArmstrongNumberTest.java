package dev.hugo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArmstrongNumberTest {

    @Test
    public void testIsArmstrong() {
        assertTrue(ArmstrongNumber.isArmstrong(0));
        assertTrue(ArmstrongNumber.isArmstrong(1));
        assertTrue(ArmstrongNumber.isArmstrong(153));
        assertTrue(ArmstrongNumber.isArmstrong(370));
        assertTrue(ArmstrongNumber.isArmstrong(371));
       
        
        assertFalse(ArmstrongNumber.isArmstrong(123));
        assertFalse(ArmstrongNumber.isArmstrong(156));
        assertFalse(ArmstrongNumber.isArmstrong(999));
    }
}

