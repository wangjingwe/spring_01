package com.wm;

import com.wm.config.SpringConfig;
import com.wm.dao.BookDao;
import com.wm.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Wm
 * @description
 */
public class APPForAnno {
    public static void main(String[] args) {
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

//        BookDao bookDao = ctx.getBean(BookDao.class);
//        bookDao.save();
        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();
        bookService.update();
        ctx.close();
    }
}
