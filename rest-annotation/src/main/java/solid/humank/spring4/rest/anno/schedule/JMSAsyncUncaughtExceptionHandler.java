/*
* Copyright (c) Unistar Corp. 2015. All Rights Reserved.
* 
* Unistar DEV Team
*/
package solid.humank.spring4.rest.anno.schedule;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;

import java.lang.reflect.Method;

/**
 * Title: solid.humank.spring4.rest.anno.schedule.JMSAsyncUncaughtExceptionHandler<br>
 * Description: FIXME JMSAsyncUncaughtExceptionHandler Description
 *
 * @author: kim
 * @version: 1.0
 */
public class JMSAsyncUncaughtExceptionHandler implements AsyncUncaughtExceptionHandler{

    @Override
    public void handleUncaughtException(Throwable throwable, Method method, Object... objects) {

        System.out.println("async job failed");
    }
}
