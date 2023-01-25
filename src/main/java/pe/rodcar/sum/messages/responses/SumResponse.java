package pe.rodcar.sum.messages.responses;

import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
public class SumResponse {
    private final Double a;
    private final Double b;
    private final BigDecimal result;
}
