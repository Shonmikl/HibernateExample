package main.com.hiber.aop;

import org.springframework.stereotype.Component;

@Component("school")
public class SchoolLibrary {

    public void getBook() {
        System.out.println("SchoolLibrary: getBook()");
    }
}