package main.com.hiber.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);


        UniLibrary uniLibrary = context.getBean("library", UniLibrary.class);
        uniLibrary.getBook();
        uniLibrary.returnMagazine();
        uniLibrary.addBook();
//        uniLibrary.getMagazine();
//        uniLibrary.returnBook();

//        SchoolLibrary school = context.getBean("school", SchoolLibrary.class);
//        Book book = context.getBean("book", Book.class);
//        school.getBook();


        context.close();
    }
}
