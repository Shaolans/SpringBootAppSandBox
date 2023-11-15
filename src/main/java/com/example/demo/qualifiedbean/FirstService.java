package com.example.demo.qualifiedbean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("first")
public class FirstService implements MyInterface {
    @Override
    public String getDescription() {
        return "first";
    }
}
