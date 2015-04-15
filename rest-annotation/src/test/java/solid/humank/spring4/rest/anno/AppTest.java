/*
* Copyright (c) Unistar Corp. 2015. All Rights Reserved.
* 
* Unistar DEV Team
*/
package solid.humank.spring4.rest.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import solid.humank.spring4.rest.anno.configuration.ApplicationConfig;

/**
 * Title: solid.humank.spring4.rest.anno.AppTest<br>
 * Description: FIXME AppTest Description
 *
 * @author: kim
 * @version: 1.0
 */
public class AppTest {

    @SuppressWarnings({ "unused", "resource" })
    public static void main(String args[]){
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    }

}
