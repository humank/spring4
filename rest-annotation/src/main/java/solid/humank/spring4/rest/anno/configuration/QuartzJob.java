/*
 * Copyright (c) Unistar Corp. 2015. All Rights Reserved.
 * 
 * Unistar DEV Team
 */
package solid.humank.spring4.rest.anno.configuration;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import java.lang.annotation.*;

/**
 * Title: solid.humank.spring4.rest.anno.configuration.QuartzJob<br>
 * Description: FIXME QuartzJob Description
 *
 * @author: kim
 * @version: 1.0
 */

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
@Scope("prototype")
public @interface QuartzJob {

    String name();

    String group() default "DEFAULT_GROUP";

    String cronExp();

}
