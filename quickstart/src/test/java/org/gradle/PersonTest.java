package org.gradle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class PersonTest {
	private Person person;

	@Before
    public void before() {
        person = new Person("Erik", 26, "8505535", "male", "Bolivia");
    }

    @Test
    public void canConstructAPersonWithAName() {
        assertEquals("Erik", person.getName());
    }

    @Test
    public void Test1() {
        assertEquals(26, person.getAge());
    }

    @Test
    public void Test2() {
        assertEquals("8505535", person.getCi());
    }

    @Test
    public void Test3() {
        assertEquals("male", person.getGenero());
    }

    @Test
    public void Test4() {
         assertFalse(person.getCi().equals("8328245"));
    }

    @Test
    public void Test5() {
        assertFalse(person.getGenero().equals("female"));
    }

    @Test
    public void Test6() {
        assertFalse(person.getAge() == 30);
    }

    @Test
    public void Test7() {
        assertFalse(person.getName().equals("Larry"));
    }

    @Test
    public void Test8() {
        assertFalse(person.getName().equals("Mario"));
    }

    @Test
    public void Test9() {
        assertFalse(person.getCountry().equals("brasil"));
    }

    @Test
    public void Test10() {
        assertEquals("Bolivia", person.getCountry());
    }
}
