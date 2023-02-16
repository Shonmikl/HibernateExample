package main.com.hiber.aop;

import org.springframework.stereotype.Component;

@Component("library")
public class UniLibrary  {

    public void getBook() {
        System.out.println("<---UniLibrary: getBook()");
    }

    public void returnBook() {
        System.out.println("--->UniLibrary: returnBook()");
    }

    public void getMagazine() {
        System.out.println("<---UniLibrary: getMagazine()");
    }

    public void returnMagazine() {
        System.out.println("--->UniLibrary: returnMagazine()");
    }

    public void addMagazine() {
        System.out.println("+++>UniLibrary: addMagazine()");
    }

    public void addBook() {
        System.out.println("+++>UniLibrary: addBook()");
    }
}