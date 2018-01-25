/**
 * projectName: fendo-plus-boot
 * fileName: DefaultDemoService.java
 * packageName: com.fendo.dubbo.demo
 * date: 2018-01-25 12:36
 * copyright(c) 2017-2020 xxx公司
 */
package com.fendo.dubbo.demo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.fendo.dubbo.demo.api.DemoService;

/**
 * @version: V1.0
 * @author: fendo
 * @className: DefaultDemoService
 * @packageName: com.fendo.dubbo.demo
 * @description: 服务提供者
 * @data: 2018-01-25 12:36
 **/
@Service(
        version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class DefaultDemoService implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }

}
