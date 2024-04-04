package me.dio.controller.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import me.dio.service.exception.BusinessException;
import me.dio.service.exception.NotFoundException;

// Controlador de exceções global para lidar com diferentes tipos de exceções
@RestControllerAdvice
public class GlobalExceptionHandler {

    // Logger para registrar exceções
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    // Manipulador de exceção para BusinessException
    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<String> handleBusinessException(BusinessException ex) {
        // Retorna uma resposta com status 422 (Unprocessable Entity) e a mensagem de exceção
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
    }

    // Manipulador de exceção para NotFoundException
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<String> handleNoContentException() {
        // Retorna uma resposta com status 404 (Not Found) e uma mensagem padrão
        return new ResponseEntity<>("Resource ID not found.", HttpStatus.NOT_FOUND);
    }

    // Manipulador de exceção genérico para qualquer outra exceção não tratada
    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> handleUnexpectedException(Throwable unexpectedException) {
        // Retorna uma resposta com status 500 (Internal Server Error) e uma mensagem genérica
        String message = "Unexpected server error.";
        LOGGER.error(message, unexpectedException); // Registra a exceção no log
        return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
