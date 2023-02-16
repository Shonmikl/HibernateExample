package main.com.hiber.aop;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("book")
@Getter
public class Book {

    @Value("War and Peace")
    private String name;
}