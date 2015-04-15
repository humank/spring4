/*
 * Copyright (c) Unistar Corp. 2015. All Rights Reserved.
 * 
 * Unistar DEV Team
 */
package solid.humank.spring4.rest.anno.configuration;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import solid.humank.spring4.rest.anno.schedule.MyBean;

/**
 * Title: solid.humank.spring4.rest.anno.configuration.ApplicationConfig<br>
 * Description: FIXME ApplicationConfig Description
 *
 * @author: kim
 * @version: 1.0
 */
@Configuration
@EnableScheduling
public class ApplicationConfig implements SchedulingConfigurer {

    @Bean
    public MyBean bean() {
        return new MyBean();
    }

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.setScheduler(taskExecutor());
    }

    @Bean(destroyMethod = "shutdown")
    public Executor taskExecutor() {
        return Executors.newScheduledThreadPool(10);
    }
}
