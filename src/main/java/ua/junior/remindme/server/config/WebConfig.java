package ua.junior.remindme.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Вевдюк on 28.01.2016.
 */

@Configuration
@EnableWebMvc
@ComponentScan("ua.junior.remindme.server")
public class WebConfig extends WebMvcConfigurerAdapter{
}
