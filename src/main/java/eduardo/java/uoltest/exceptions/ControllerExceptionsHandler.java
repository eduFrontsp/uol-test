package eduardo.java.uoltest.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class ControllerExceptionsHandler {

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity threatNoSuchElementException(NoSuchElementException exception) {
        ExceptionDto dto = new ExceptionDto("não possui mais usuários disponíveis", "400");
        return ResponseEntity.badRequest().body(dto);
    }
}
