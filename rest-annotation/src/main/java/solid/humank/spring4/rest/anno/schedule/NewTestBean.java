/*
 * Copyright (c) Unistar Corp. 2015. All Rights Reserved.
 * 
 * Unistar DEV Team
 */
package solid.humank.spring4.rest.anno.schedule;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Title: solid.humank.spring4.rest.anno.schedule.NewTestBean<br>
 * Description: FIXME NewTestBean Description
 *
 * @author: kim
 * @version: 1.0
 */
public class NewTestBean extends QuartzJobBean {

    //@Async(value = "otherExecutor")
    /**
     * In this case, "otherExecutor" may be the name of any Executor bean in the Spring container, <br/>
     * or may be the name of a qualifier associated with any Executor, <br/>
     * e.g. as specified with the <qualifier> element or Spring’s @Qualifier annotation.
     */
    public void testAsyncSomething() {
        System.out.println("async firing something");
    }

    protected void executeInternal(JobExecutionContext ctx) throws JobExecutionException {
        // do the actual work
        System.out.println("do something");
    }
}
