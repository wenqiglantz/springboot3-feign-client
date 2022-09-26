package com.github.wenqiglantz.service.demo.democlient;

import com.github.wenqiglantz.service.demo.data.DemoRequest;
import com.github.wenqiglantz.service.demo.data.DemoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(
        name = "demo-client",
        url = "${demo.urls.base-url}",
        configuration = DemoClientConfig.class
)
public interface DemoClient {

    @PostMapping(value = "${demo.urls.create-demo-record-url}", headers = {"Content-Type=application/json"})
    DemoResponse records(@RequestBody DemoRequest request);
}
