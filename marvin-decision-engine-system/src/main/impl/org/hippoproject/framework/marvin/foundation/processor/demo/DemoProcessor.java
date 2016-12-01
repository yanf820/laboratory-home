package org.hippoproject.framework.marvin.foundation.processor.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.hippoproject.framework.marvin.foundation.processor.BaseProcessor;
import org.hippoproject.framework.marvin.foundation.processor.IProcessInput;
import org.hippoproject.framework.marvin.foundation.processor.IProcessOutput;

/**
 */
public class DemoProcessor extends BaseProcessor {

    private static AtomicLong index = new AtomicLong(0);

    public void processDatum(DemoDatum datum, IProcessInput input, IProcessOutput output) throws Exception {

        //logger.info("DemoProcessor process task:{}", datum);
        if(index.getAndIncrement() % 10000 == 0){
        	System.out.println("DemoProcessor process task:" + datum + " " + Thread.currentThread().getId() + "  " + index.get());
        	DemoBean1 b = new DemoBean1();
        	b.setContent("Hello " + index.get());
        	output.getCollector().collect(b);
        }

    }

}
