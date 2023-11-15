package com.example.demo.qualifiedbean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("second")
public class SecondService implements MyInterface {
    @Override
    public String getDescription() {
        return "second";
    }
}
