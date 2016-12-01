package org.hippoproject.framework.marvin.foundation.processor.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.hippoproject.framework.marvin.foundation.processor.BaseProcessor;
import org.hippoproject.framework.marvin.foundation.processor.ICollector;
import org.hippoproject.framework.marvin.foundation.processor.IProcessInput;
import org.hippoproject.framework.marvin.foundation.processor.IProcessOutput;

/**
 */
public class DemoProducer extends BaseProcessor {

    private static AtomicLong index = new AtomicLong(0);

    @Override
    protected void produce(IProcessInput input, IProcessOutput output) throws Exception {
        ICollector collector = output.getCollector();
        collector.collect(new DemoDatum());

        if(index.getAndIncrement() % 10000 == 0)
        System.out.println(">>> " + index.get());
    }
}
