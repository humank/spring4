/*
 * Copyright (c) Unistar Corp. 2015. All Rights Reserved.
 * 
 * Unistar DEV Team
 */
package solid.humank.spring4.rest.anno.configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.quartz.Job;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;

/**
 * Title: solid.humank.spring4.rest.anno.configuration.QuartzJobScheduleListener<br>
 * Description: FIXME QuartzJobScheduleListener Description
 *
 * @author: kim
 * @version: 1.0
 */
public class QuartzJobScheduleListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private Scheduler scheduler;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        ApplicationContext applicationContext = event.getApplicationContext();
        Map<String, Object> quartzJobBeans = applicationContext.getBeansWithAnnotation(QuartzJob.class);

        Set<String> beanNames = quartzJobBeans.keySet();

        List<CronTriggerFactoryBean> cronTriggerFactoryBeanList = new ArrayList<CronTriggerFactoryBean>();

        for (String beanName : beanNames) {
            Object object = quartzJobBeans.get(beanName);
            cronTriggerFactoryBeanList.add(buildCronTriggerBean(object));
        }
    }

    protected CronTriggerFactoryBean buildCronTriggerBean(Object job) {
        CronTriggerFactoryBean cronTriggerFactoryBean = null;
        QuartzJob quartzJobAnnotated = AnnotationUtils.findAnnotation(job.getClass(), QuartzJob.class);

        if (Job.class.isAssignableFrom(job.getClass())) {

            System.out.println("It is a quartz job");

            cronTriggerFactoryBean = new CronTriggerFactoryBean();
            cronTriggerFactoryBean.setCronExpression(quartzJobAnnotated.cronExp());
            cronTriggerFactoryBean.setBeanName(quartzJobAnnotated.name() + "_trigger");
            JobDetailFactoryBean jobDetailFactoryBean = new JobDetailFactoryBean();
            jobDetailFactoryBean.setBeanName(quartzJobAnnotated.name());
            jobDetailFactoryBean.setJobClass(job.getClass());
            cronTriggerFactoryBean.setJobDetail(jobDetailFactoryBean.getObject());

            try {
                scheduler.scheduleJob(jobDetailFactoryBean.getObject(),cronTriggerFactoryBean.getObject());
            } catch (SchedulerException e) {
                e.printStackTrace();
            }
        } else {
            throw new RuntimeException(job.getClass() + " doesn't implemented " + Job.class);
        }
        return cronTriggerFactoryBean;
    }
}
