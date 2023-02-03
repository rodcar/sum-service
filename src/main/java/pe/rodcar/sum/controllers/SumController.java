package pe.rodcar.sum.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.rodcar.sum.messages.requests.SumRequest;
import pe.rodcar.sum.messages.responses.SumResponse;
import pe.rodcar.sum.services.SumService;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/sum")
public class SumController {

    @Autowired
    private SumService sumService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SumResponse> sum(@Valid @RequestBody SumRequest request) {
        Double a = request.a();
        Double b = request.b();
        BigDecimal result = sumService.sum(a, b);
        return ResponseEntity.ok(SumResponse.builder().a(a).b(b).result(result).build());
    }

}