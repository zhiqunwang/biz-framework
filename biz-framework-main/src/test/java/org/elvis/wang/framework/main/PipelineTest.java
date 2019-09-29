package org.elvis.wang.framework.main;

import org.elvis.wang.framework.api.dto.DemoRequest;
import org.elvis.wang.framework.api.dto.Response;
import org.elvis.wang.framework.biz.pipeline.Pipeline;
import org.elvis.wang.framework.biz.pipeline.context.DefaultHandlerContext;
import org.elvis.wang.framework.biz.pipeline.handleritem.demo.PerDemoHandlerItem;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhiqun.wang on 2019/7/3 07:19
 */
public class PipelineTest extends ApplicationBaseTest {

    private Logger logger = LoggerFactory.getLogger(PerDemoHandlerItem.class);

    @Autowired
    private Pipeline demoPipeline;

    @Test
    public void testSuccessPipeline(){

        DemoRequest request = new DemoRequest();
        request.setUserId(100000L);
        Response<Long> response = demoPipeline.execute(request,new DefaultHandlerContext());
        logger.info("执行结果返回，response={}",response.getData());
    }

}
