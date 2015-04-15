/*
* Copyright (c) Unistar Corp. 2015. All Rights Reserved.
* 
* Unistar DEV Team
*/
package solid.humank.spring4.rest.schedule;

import org.junit.Test;
import org.quartz.*;
import org.quartz.impl.matchers.GroupMatcher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Title: solid.humank.spring4.rest.schedule.SimpleJobTest<br>
 * Description: FIXME SimpleJobTest Description
 *
 * @author: kim
 * @version: 1.0
 */
public class SimpleJobTest {

    public static void main(String[] args) throws SchedulerException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring4-servlet.xml");
    }

    //@Test
//    public void test() {
//
//        SimpleJobTest example = new SimpleJobTest();
//        try {
//            example.run();
//        } catch (SchedulerException e) {
//            e.printStackTrace();
//        }
//
//    }
}
