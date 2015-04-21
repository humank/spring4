/*
 * Copyright (c) Unistar Corp. 2015. All Rights Reserved.
 * 
 * Unistar DEV Team
 */
package solid.humank.spring4.rest.anno.schedule;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Service;
import solid.humank.spring4.rest.anno.configuration.QuartzJob;

/**
 * Title: solid.humank.spring4.rest.anno.schedule.MyBean<br>
 * Description: FIXME MyBean Description
 *
 * @author: kim
 * @version: 1.0
 */

@Service
@DisallowConcurrentExecution
public class MyBean implements Job {
    // @Autowired
    // private MyService myService;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        // System.out.println("Message: " + myService.getHelloWorld());
        System.out.println("Message:  yoyo ! " );
    }
}
