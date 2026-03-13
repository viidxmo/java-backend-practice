package com.viidxmo.backendpractice.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record GreetingRequest(
        @NotBlank(message = "name is required")
        @Size(min = 3, max = 10, message = "name must be 3-10 characters")
        String name
) {
}
