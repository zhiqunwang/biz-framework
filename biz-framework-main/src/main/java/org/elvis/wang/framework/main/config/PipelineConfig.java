package org.elvis.wang.framework.main.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by zhiqun.wang on 2019/6/30 09:52
 */

@Configuration
@ImportResource(locations= {"classpath:application-pipeline.xml"})
public class PipelineConfig {
}
