package pl.javastart.kalkulatorpodaku;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TaxCalculatorTest {

    private TaxCalculator taxCalculator;

    @Test
    public void souldReturn0For0(){
        // given
        TaxCalculator taxCalculator = new TaxCalculator();
        int income = 0;

        // when
        double tax = taxCalculator.calculateTax(income);

        // then
        assertThat(tax, is(0.0));
    }


    @Test
    public void souldReturn8444For50000(){
        // given
        TaxCalculator taxCalculator = new TaxCalculator();
        int income = 50000;

        // when
        double tax = taxCalculator.calculateTax(income);

        // then
        assertThat(tax, is(8444.));

    }

    @Test
    public void souldReturn19470For100000(){
        // given
        TaxCalculator taxCalculator = new TaxCalculator();
        int income = 100000;

        // when
        double tax = taxCalculator.calculateTax(income);

        // then
        assertThat(tax, is(19470.));

    }






}
