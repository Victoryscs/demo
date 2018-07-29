package com.ryfchina.demo;

import org.apache.catalina.connector.Connector;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

/**
 * @author vmuser017
 */
@SpringBootApplication
public class TestApplication extends SpringBootServletInitializer {

        @Value("${http.port}")
        private int httpPort;

        public static void main(String[] args) {	SpringApplication.run(TestApplication.class, args);
        }
        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
            return builder.sources(TestApplication.class);
        }
        // 此模式是http 和https并存
        @Bean
        public EmbeddedServletContainerFactory servletContainer() {
            TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
            tomcat.addAdditionalTomcatConnectors(createHttpConnector());
            return tomcat;
        }

        private Connector createHttpConnector() {
            Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
            connector.setScheme("http");
            connector.setPort(httpPort);
            connector.setSecure(false);
            return connector;
        }
    }

