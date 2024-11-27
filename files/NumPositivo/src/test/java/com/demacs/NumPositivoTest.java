package com.demacs;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumPositivoTest{

    public NumPositivo np = new NumPositivo();

    @Test
    public void testEPositivo() {

        assertTrue("YES", np.ePositivo(1));
        assertTrue("YES", np.ePositivo(2));
        assertTrue("YES", np.ePositivo(3));
        assertTrue("YES", np.ePositivo(4));

    }

    @Test
    public void testENegativoOZero(){

        assertFalse("YES", np.ePositivo(-1));
        assertFalse("YES", np.ePositivo(0));
        assertFalse("YES", np.ePositivo(-2));
        assertFalse("YES", np.ePositivo(-3));
        assertFalse("YES", np.ePositivo(0));

    }

}