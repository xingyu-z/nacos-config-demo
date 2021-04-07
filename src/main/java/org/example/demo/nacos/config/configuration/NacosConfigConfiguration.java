package org.example.demo.nacos.config.configuration;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource("classpath:properties/nacos.properties")
@EnableNacosConfig(globalProperties = @NacosProperties)
@NacosPropertySource(dataId = "common.properties", autoRefreshed = true)
public class NacosConfigConfiguration {
}
