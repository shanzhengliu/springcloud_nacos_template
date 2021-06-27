package nacosConfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/config")
@RefreshScope
@RestController
public class ConfigController {
    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @GetMapping("/get")
    public boolean get() {
        return useLocalCache;
    }


}
