package solid.humank.spring4.rest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yikai on 2015/4/15.
 */

@RestController
@RequestMapping("/service/greeting")
public class HelloResource {
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String sayHello(@PathVariable String name) {

        return "Hello "+name+" to dineshonjava.com!!!";
    }
}
