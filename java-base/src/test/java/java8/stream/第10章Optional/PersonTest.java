package java8.stream.第10章Optional;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void getCarInsuranceName() {
        Person person = new Person();
        String carInsuranceName = person.getCarInsuranceName(person);
    }

    @Test
    public void getCarInsuranceNameFirst() {
        Person person = new Person();
        String carInsuranceNameFirst = person.getCarInsuranceNameFirst(person);
        System.out.println(carInsuranceNameFirst);
    }
    @Test
    public void getCarInsuranceNameSafe(){
        Person person = new Person();
        String carInsuranceNameSafe = person.getCarInsuranceNameSafe(person);
        assertEquals("unknown",carInsuranceNameSafe);
    }
}