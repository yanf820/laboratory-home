package org.hippoproject.framework.marvin.foundation.processor.flink;

import org.hippoproject.framework.marvin.foundation.processor.config.ProcessorNode;

/**
 */
public interface IFlinkProcessorAgent {

    public boolean isAsProducer();

    public ProcessorNode getProcessorNode();

    public Class getOutputType();

}
