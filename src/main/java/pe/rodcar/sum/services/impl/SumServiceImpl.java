package pe.rodcar.sum.services.impl;

import org.springframework.stereotype.Service;
import pe.rodcar.sum.services.SumService;

import java.math.BigDecimal;

@Service
public class SumServiceImpl implements SumService {

    @Override
    public BigDecimal sum(Double a, Double b) {
        BigDecimal bigDecimalA = new BigDecimal(Double.toString(a));
        BigDecimal bigDecimalB = new BigDecimal(Double.toString(b));
        return bigDecimalA.add(bigDecimalB);
    }
}
