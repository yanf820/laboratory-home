package org.hippoproject.framework.marvin.foundation.processor.flink;

import org.apache.flink.streaming.api.functions.source.SourceFunction;
import org.hippoproject.framework.marvin.foundation.processor.ICollector;

/**
 */
public class SourceContextProxyCollector implements ICollector {

    private SourceFunction.SourceContext sourceContext;
    private int collectCounter;

    public SourceContextProxyCollector(SourceFunction.SourceContext sourceContext) {
        this.sourceContext = sourceContext;
        this.collectCounter = 0;
    }

    @Override
    public void collect(Object object) {
        this.collectCounter++;
        this.sourceContext.collect(object);
    }

    public void reset(){
        this.collectCounter = 0;
    }

    public boolean hasObjectsCollectted(){
        return this.collectCounter > 0;
    }
}
