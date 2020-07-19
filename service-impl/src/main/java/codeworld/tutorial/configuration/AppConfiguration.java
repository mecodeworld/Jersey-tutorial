package codeworld.tutorial.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author h.kanure
 *
 */
@Configuration
@ComponentScan(basePackages = "codeworld.tutorial.*")
@EnableAutoConfiguration
public class AppConfiguration {

}
