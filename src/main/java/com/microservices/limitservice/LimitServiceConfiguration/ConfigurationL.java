package com.microservices.limitservice.LimitServiceConfiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Bean;

@Configuration
@ConfigurationProperties("limits-service")
public class ConfigurationL {

    private int maximum;

    public ConfigurationL() {
    }

    private int minimum;


    public ConfigurationL(int maximum, int minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }
    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }


    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    @Override
    public String toString() {
        return "ConfigurationL{" +
                "maximum=" + maximum +
                ", minimum=" + minimum +
                '}';
    }

}
