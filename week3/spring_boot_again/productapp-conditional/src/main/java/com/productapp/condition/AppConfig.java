package com.productapp.condition;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnProperty(name="prod.datasource.enabled", havingValue="true")
    @Primary
    public DataSourceConfig enableProdDatabase() {
        return new EnableProdDataSource();
    }

    @Bean
    @ConditionalOnMissingBean(EnableProdDataSource.class)
    public EnableDevDataSource enableDevDatabase() {
        return new EnableDevDataSource();
    }
}
