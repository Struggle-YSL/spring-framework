package org.springframework.test.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(value = "org.springframework.test.service")
public class AppConfig {
}
