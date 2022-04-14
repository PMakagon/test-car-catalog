package ru.embedika.testcarcatalog.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class SameCarExistException extends RuntimeException{

    public SameCarExistException(String message) {
        super(message);
    }
}
