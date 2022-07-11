package com.example.domashka_2_12.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DivideOnZeroException extends IllegalArgumentException{

    public DivideOnZeroException(){
        super("Ошибка деления на 0");    }
}
