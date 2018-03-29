package pl.javastart.kalkulatorpodaku;

import org.springframework.stereotype.Component;

@Component
public class TaxCalculator {

    public double calculateTax(double income) {
        // TODO zaimplementuj obliczanie podaktu wg skali podatkowej

        if (income < 556.02)
            return 0;

        if (income > 556.02 & income < 85528)
                return Math.round((income*0.18)-556.02);

        else
            return Math.round(14839.02 + ((income-85528)*0.32));

    }

}
