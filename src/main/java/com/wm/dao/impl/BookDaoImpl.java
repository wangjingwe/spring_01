package com.wm.dao.impl;

import com.wm.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author Wm
 * @description
 */
//@Component
@Repository   // 使用注解的形式定义bean
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save ...");
    }
}
