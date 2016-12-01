package org.hippoproject.framework.marvin.foundation.processor;

import org.hippoproject.framework.marvin.foundation.processor.config.ProcessorGraph;

/**
 */
public interface IProcessActuator {

    public void initialize(ProcessorGraph graph, String ... args);

    public void launch() throws Exception;

    public void shutdown() throws Exception;

    public boolean isLaunched();

}
