package pe.rodcar.sum.messages.requests;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.format.annotation.NumberFormat;

@Data
public class SumRequest {
    @NotNull
    @NumberFormat
    private final Double a;
    @NotNull
    @NumberFormat
    private final Double b;
}
