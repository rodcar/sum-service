package pe.rodcar.sum.services.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pe.rodcar.sum.services.SumService;

import java.math.BigDecimal;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SumServiceImplTest {

    @Autowired
    private SumService sumService;

    @Test
    void debeSumarDosNumerosEnterosPositivos() {
        // dado
        Double a = 50.0;
        Double b = 75.0;
        // cuando
        BigDecimal result = sumService.sum(a, b);
        // entonces
        BigDecimal expected = new BigDecimal("125.0");
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void debeSumarDosNumerosEnterosNegativos() {
        // dado
        Double a = -50.0;
        Double b = -1.0;
        // cuando
        BigDecimal result = sumService.sum(a, b);
        // entonces
        BigDecimal expected = new BigDecimal("-51.0");
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void debeSumarDosDecimalesPositivos() {
        // dado
        Double a = 145.4123;
        Double b = 5.5544;
        // cuando
        BigDecimal result = sumService.sum(a, b);
        // entonces
        BigDecimal expected = new BigDecimal("150.9667");
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void debeSumarDosDecimalesNegativos() {
        // dado
        Double a = -60.4331;
        Double b = -100.222;
        // cuando
        BigDecimal result = sumService.sum(a, b);
        // entonces
        BigDecimal expected = new BigDecimal("-160.6551");
        assertThat(result).isEqualTo(expected);
    }
}