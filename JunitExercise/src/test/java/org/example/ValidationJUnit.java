package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//import static org.hamcrest.MatcherAssert.assertThat;
//import org.hamcrest.CoreMatchers;

public class ValidationJUnit {

    static ValidationBO validationBO = null;

    @BeforeClass
    public static void init(){
        validationBO = new ValidationBO();
    }

    @Before
    public void init1(){
        validationBO = new ValidationBO();
    }

    @Test
    public void testValidBookingId(){
        Assert.assertEquals(validationBO.validateBookingId("123456"),"Valid booking Id");
    }

    @Test
    public void testInvalidBookingId(){
        Assert.assertEquals(validationBO.validateBookingId("123ab"),"Invalid booking Id");
        Assert.assertEquals(validationBO.validateBookingId(" "),"Invalid booking Id");
        Assert.assertEquals(validationBO.validateBookingId(null),"Invalid booking Id");
    }

}
