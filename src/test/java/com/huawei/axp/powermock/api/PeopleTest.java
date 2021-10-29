package com.huawei.axp.powermock.api;

import org.junit.*;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@PrepareForTest(People.class)
public class PeopleTest {

    @Mock
    private People onePeople;

    @BeforeClass
    public static void testBefore() {
        System.out.println("Build People!");
    }

    @Test
    public void testPeopleA() {
        onePeople = mock(People.class);
        when(onePeople.getAge()).thenReturn(1);
        when(onePeople.getName()).thenReturn("a");
        assertThat(onePeople.getAge(), is(1));
        assertThat(onePeople.getName(), is("a"));
    }

    @Test
    public void testPeopleB() {
        onePeople = mock(People.class);
        when(onePeople.getAge()).thenReturn(2);
        when(onePeople.getName()).thenReturn("b");
        assertThat(onePeople.getAge(), is(2));
        assertThat(onePeople.getName(), is("b"));
    }

    @AfterClass
    public static void testAfter() {
        System.out.println("Release People!");
    }
}
