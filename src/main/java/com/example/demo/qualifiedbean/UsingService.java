package com.example.demo.qualifiedbean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UsingService {
    private final MyInterface first;
    private final MyInterface second;

    public UsingService(@Qualifier("first") MyInterface first, @Qualifier("second") MyInterface second) {
        this.first = first;
        this.second = second;
    }

    public String getDescription() {
        return first.getDescription() + "      " + second.getDescription();
    }
}
