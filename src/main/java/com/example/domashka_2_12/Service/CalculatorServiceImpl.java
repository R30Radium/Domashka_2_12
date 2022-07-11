package com.example.domashka_2_12.Service;

import com.example.domashka_2_12.Exception.DivideOnZeroException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CalculatorServiceImpl implements CalculatorService{

    @Override
    public float plus(Float num1, Float num2) {
        return num1 + num2;
    }

    @Override
    public float minus(Float num1, Float num2) {
        return num1 - num2;
    }

    @Override
    public float multiply(Float num1, Float num2) {
        return num1 * num2;
    }

    @Override
    public float divide(Float num1, Float num2) {

        if (num2 ==0) {
            throw new DivideOnZeroException();
        }
        return num1 / num2;
    }
}


