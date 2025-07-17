package com.studentmanager.demo.advisor;

import com.studentmanager.demo.exception.BadRequest;
import com.studentmanager.demo.exception.NotFoundException;
import com.studentmanager.demo.utils.StandardResponse;
import org.apache.coyote.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionHandling {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<StandardResponse> handleNotFoundException(NotFoundException ex) {
        return new ResponseEntity<StandardResponse>(
                new StandardResponse(
                        404,
                        "Not Found",
                        ex.getMessage()

                ),
                HttpStatus.CREATED
                );
    }

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<StandardResponse> handleBadRequestException(BadRequest e){
        return new ResponseEntity<StandardResponse>(
                new StandardResponse(
                        400,
                        "Bad Request",
                        e.getMessage()
                ),
                HttpStatus.CREATED
        );
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,String>> handleValidationErrors(MethodArgumentNotValidException e){
        Map<String,String> errors = new HashMap<>();

        e.getBindingResult().getFieldErrors().forEach(error -> {
            errors.put(error.getField(), error.getDefaultMessage());
        });
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

}
