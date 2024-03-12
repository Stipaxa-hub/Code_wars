package org.example.OddEvenStringSort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenSortTest {
    @Test
    public void testSomething() {
        assertEquals("Wleclgltihuebredrf ofsheesenasnegrof", OddEvenSort.sortMyString("Wolfeschlegelsteinhausenbergerdorff"));
        assertEquals("MTINLHENLHENGUAIYAGNL EHOYTROYTROYLTMNLRIY", OddEvenSort.sortMyString("METHIONYLTHREONYLTHREONYGLUTAMINYLARGINYL"));
        assertEquals("PEMNUTAIRSOISLCVLAOOISS NUOOLRMCOCPCIIOOCNCNOI", OddEvenSort.sortMyString("PNEUMONOULTRAMICROSCOPICSILICOVOLCANOCONIOSIS"));
        assertEquals("PEDPEDHPPRTYODS SUOSUOYOAAHRIIM", OddEvenSort.sortMyString("PSEUDOPSEUDOHYPOPARATHYROIDISM"));
        assertEquals("FOCNUIIIIIIIAIN LCIACNHLPLFCTO", OddEvenSort.sortMyString("FLOCCINAUCINIHILIPILIFICATION"));
        assertEquals("SBEMTGYHC UDRAOLPI", OddEvenSort.sortMyString("SUBDERMATOGLYPHIC"));
    }

}