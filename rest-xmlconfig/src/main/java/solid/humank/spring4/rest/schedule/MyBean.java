/*
 * Copyright (c) Unistar Corp. 2015. All Rights Reserved.
 * 
 * Unistar DEV Team
 */
package solid.humank.spring4.rest.schedule;

import org.springframework.stereotype.Component;

/**
 * Title: solid.humank.spring4.rest.schedule.MyBean<br>
 * Description: FIXME MyBean Description
 *
 * @author: kim
 * @version: 1.0
 */


@Component("myBean")
public class MyBean {

    public void printMessage() {

        System.out.println("I am called by MethodInvokingJobDetailFactoryBean using SimpleTriggerFactoryBean");
    }

}
