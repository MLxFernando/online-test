package com.online.test.onlinetest.exceptions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ErrorDetails {
    private String message;
    private String details;
}
