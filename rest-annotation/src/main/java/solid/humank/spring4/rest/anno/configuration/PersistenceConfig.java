/*
* Copyright (c) Unistar Corp. 2015. All Rights Reserved.
* 
* Unistar DEV Team
*/
package solid.humank.spring4.rest.anno.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Title: solid.humank.spring4.rest.anno.configuration.PersistenceConfig<br>
 * Description: FIXME PersistenceConfig Description
 *
 * @author: kim
 * @version: 1.0
 */

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories
public class PersistenceConfig {

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
        emf.setPersistenceXmlLocation("classpath:/META-INF/persistence.xml");
        return emf ;
    }
}
