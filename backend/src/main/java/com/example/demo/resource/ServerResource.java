package com.example.demo.resource;

import com.example.demo.model.Response;
import com.example.demo.service.implementation.ServerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static java.time.LocalDateTime.now;
import static java.util.Map.of;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/server")
@RequiredArgsConstructor
public class ServerResource {
    private final ServerServiceImpl serverService;

    @GetMapping("/list")
    public ResponseEntity<Response> getServers() {
        return ResponseEntity.ok(
            Response.builder()
                .timestamp(now())
                .data(of("servers", serverService.list(30)))
                .message("Servers retrieved")
                .status(OK)
                .statusCode(OK.value())
                .build()
        );
    }
}
