package com.wm;

import com.wm.dao.BookDao;
import com.wm.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Wm
 * @description
 */
public class APP {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookDao bookDao = (BookDao) ctx.getBean(BookDao.class);
        bookDao.save();
        BookService bookService = ctx.getBean(BookService.class);
        bookService.save();
        ctx.close();
    }

}
