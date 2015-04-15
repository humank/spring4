/*
 * Copyright (c) Unistar Corp. 2015. All Rights Reserved.
 * 
 * Unistar DEV Team
 */
package solid.humank.spring4.rest.schedule;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Title: solid.humank.spring4.rest.schedule.SimpleJob<br>
 * Description: FIXME SimpleJob Description
 *
 * @author: kim
 * @version: 1.0
 */
public class SimpleJob implements Job {
    public void execute(JobExecutionContext context) throws JobExecutionException {
        // 通过上下文获取
        JobKey jobKey = context.getJobDetail().getKey();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println("集群列子1：" + jobKey + " 在 " + dateFormat.format(new Date()) + " 时运行");
    }
}
