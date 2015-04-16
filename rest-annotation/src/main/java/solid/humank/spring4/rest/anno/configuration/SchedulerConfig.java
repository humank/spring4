/*
 * Copyright (c) Unistar Corp. 2015. All Rights Reserved.
 * 
 * Unistar DEV Team
 */
package solid.humank.spring4.rest.anno.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import solid.humank.spring4.rest.anno.schedule.NewTestBean;

/**
 * Title: solid.humank.spring4.rest.anno.configuration.SchedulerConfig<br>
 * Description: FIXME SchedulerConfig Description
 *
 * @author: kim
 * @version: 1.0
 */
@Configuration
@EnableAsync
@EnableScheduling()
public class SchedulerConfig {

    //@Bean
//    public SchedulerFactoryBean setQuartzSettingProperties(){
//        SchedulerFactoryBean sfb = new SchedulerFactoryBean();
//        sfb.setConfigLocation(new ClassPathResource("quartz.properties"));
//        return sfb;
//    }


    /**
     * For Quartz usage..
     * @return
     */
    @Bean
    public JobDetailFactoryBean jobDetailFactoryBean(){
        JobDetailFactoryBean jfb = new JobDetailFactoryBean();
        jfb.setJobClass(NewTestBean.class);
        jfb.setGroup("kimGroup");
        return jfb;
    }

    @Bean
    public CronTriggerFactoryBean cronTriggerFactoryBean(){
        CronTriggerFactoryBean ctfb = new CronTriggerFactoryBean();
        ctfb.setJobDetail(jobDetailFactoryBean().getObject());
        return ctfb;
    }

    @Bean
    public SchedulerFactoryBean schedulerFactoryBean(){
        SchedulerFactoryBean sfb = new SchedulerFactoryBean();
        sfb.setConfigLocation(new ClassPathResource("quartz.properties"));
        sfb.setTriggers(cronTriggerFactoryBean().getObject());
        return sfb;
    }
}
