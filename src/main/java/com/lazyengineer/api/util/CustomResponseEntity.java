package com.lazyengineer.api.util;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomResponseEntity<T> {
    private T data;
    private String message;
    private String status;
}
