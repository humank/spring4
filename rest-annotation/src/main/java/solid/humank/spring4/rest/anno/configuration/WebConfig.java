package solid.humank.spring4.rest.anno.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by yikai on 2015/4/15.
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "solid.humank.spring4.rest.anno")
public class WebConfig {
}
