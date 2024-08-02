package dev.hugo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArmstrongNumberTest {

    @Test
    public void testConstructorAndGetter() {
        ArmstrongNumber armstrongNumber = new ArmstrongNumber(153);
        assertEquals(153, armstrongNumber.getNumber());
    }

    @Test
    public void testSetter() {
        ArmstrongNumber armstrongNumber = new ArmstrongNumber(153);
        armstrongNumber.setNumber(370);
        assertEquals(370, armstrongNumber.getNumber());
    }

    @Test
    public void testIsArmstrongTrue() {
        ArmstrongNumber armstrongNumber1 = new ArmstrongNumber(153);
        ArmstrongNumber armstrongNumber2 = new ArmstrongNumber(370);
        ArmstrongNumber armstrongNumber3 = new ArmstrongNumber(371);
        ArmstrongNumber armstrongNumber4 = new ArmstrongNumber(407);

        assertTrue(armstrongNumber1.isArmstrong());
        assertTrue(armstrongNumber2.isArmstrong());
        assertTrue(armstrongNumber3.isArmstrong());
        assertTrue(armstrongNumber4.isArmstrong());
    }

    @Test
    public void testIsArmstrongFalse() {
        ArmstrongNumber armstrongNumber = new ArmstrongNumber(123);
        assertFalse(armstrongNumber.isArmstrong());
    }

    @Test
    public void testNegativeNumber() {
        ArmstrongNumber armstrongNumber = new ArmstrongNumber(-153);
        assertFalse(armstrongNumber.isArmstrong());
    }

    @Test
    public void testSingleDigitNumbers() {
        for (int i = 0; i < 10; i++) {
            ArmstrongNumber armstrongNumber = new ArmstrongNumber(i);
            assertTrue(armstrongNumber.isArmstrong());
        }
    }
}
