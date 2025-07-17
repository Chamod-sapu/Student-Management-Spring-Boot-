package com.studentmanager.demo.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StandardResponse {
    private int code; // Error code
    private String message; // The message we want to return
    private Object data; // JSON object

}
