package pe.rodcar.sum.messages.requests;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.format.annotation.NumberFormat;

public record SumRequest(@NotNull @NumberFormat Double a, @NotNull @NumberFormat Double b) {
}
