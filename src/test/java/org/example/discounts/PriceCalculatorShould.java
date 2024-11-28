package org.example.discounts;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PriceCalculatorShould {

    @Test
    public void totalZeroWhenThereArePrices(){

        PriceCalculator calculator = new PriceCalculator();

        assertThat(calculator.getTotal(), is(0.0));
    }

}