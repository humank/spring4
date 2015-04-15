/*
 * Copyright (c) Unistar Corp. 2015. All Rights Reserved.
 * 
 * Unistar DEV Team
 */
package solid.humank.spring4.rest.schedule;

import org.springframework.stereotype.Component;

/**
 * Title: solid.humank.spring4.rest.schedule.AnotherBean<br>
 * Description: FIXME AnotherBean Description
 *
 * @author: kim
 * @version: 1.0
 */


@Component("anotherBean")
public class AnotherBean {

    public void printAnotherMessage() {
        System.out.println("I am called by Quartz jobBean using CronTriggerFactoryBean");
    }

}
