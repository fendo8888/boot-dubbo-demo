/**
 * projectName: fendo-plus-boot
 * fileName: DemoConsumerController.java
 * packageName: com.fendo.dubbo.demo.consumer
 * date: 2018-01-25 13:18
 * copyright(c) 2017-2020 xxx公司
 */
package com.fendo.dubbo.demo.consumer;

import com.fendo.dubbo.demo.api.DemoService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version: V1.0
 * @author: fendo
 * @className: DemoConsumerController
 * @packageName: com.fendo.dubbo.demo.consumer
 * @description: 消费端
 * @data: 2018-01-25 13:18
 **/
@RestController
public class DemoConsumerController {

    @Reference(version = "1.0.0",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:12345")
    private DemoService demoService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return demoService.sayHello(name);
    }

}