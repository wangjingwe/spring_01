package com.wm.service.impl;

import com.wm.dao.BookDao;
import com.wm.dao.impl.BookDaoImpl;
import com.wm.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Wm
 * @description
 */
@SuppressWarnings({"all"})
@Service
@Scope("singleton")
public class BookServiceImpl implements BookService/*, InitializingBean, DisposableBean*/ {

    @Autowired
    private BookDao bookDao;


    @Value("wm")
    private String name;

    public void save() {
        //long start = System.currentTimeMillis();
        //System.out.println(start);
        //System.out.println("book service save ..." + name);
        //bookDao.save();
    }

    public void update() {
//        for (int i = 0; i < 100000; i++) {
//            System.out.println("book server update...");
//        }
    }

//    public void setBookDao(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }

//    @Override
//    public void destroy() throws Exception {
//        System.out.println("destroy..");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {  // 属性设置之后
//        System.out.println("init...");
//    }

    @PreDestroy
    public void destroy()  {
        System.out.println("destroy..");
    }

    @PostConstruct
    public void init() {  // 属性设置之后
        System.out.println("init...");
    }
}
