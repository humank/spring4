/*
* Copyright (c) Unistar Corp. 2015. All Rights Reserved.
* 
* Unistar DEV Team
*/
package solid.humank.spring4.rest.anno.schedule;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * Title: solid.humank.spring4.rest.anno.schedule.MyBean<br>
 * Description: FIXME MyBean Description
 *
 * @author: kim
 * @version: 1.0
 */
public class MyBean {
    @Scheduled(fixedRate=5000)
    public void printMessage() {
        System.out.println("I am called by Spring scheduler");
    }
}
