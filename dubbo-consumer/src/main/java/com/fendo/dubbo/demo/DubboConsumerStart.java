/**
 * projectName: fendo-plus-boot
 * fileName: DubboConsumerStart.java
 * packageName: com.fendo.dubbo.demo.consumer
 * date: 2018-01-25 13:20
 * copyright(c) 2017-2020 xxx公司
 */
package com.fendo.dubbo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @version: V1.0
 * @author: fendo
 * @className: DubboConsumerStart
 * @packageName: com.fendo.dubbo.demo.consumer
 * @description: 消费端启动类
 * @data: 2018-01-25 13:20
 **/
@SpringBootApplication(scanBasePackages = "com.fendo.dubbo.demo.consumer")
public class DubboConsumerStart {
    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerStart.class,args);

    }
}
