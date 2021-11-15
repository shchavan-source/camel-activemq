package org.redhat.fusesource;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.builder.RouteBuilder;

import javax.jms.ConnectionFactory;

public class CamelR extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        from("amqp:queue:testQ?concurrentConsumers=5")
                .log("${body}");

    }
}
