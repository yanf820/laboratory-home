package org.hippoproject.framework.marvin.foundation.processor.flink;

import org.hippoproject.framework.marvin.foundation.component.IComponentProvider;
import org.hippoproject.framework.marvin.foundation.processor.config.ProcessorGraph;
import org.hippoproject.framework.marvin.foundation.processor.execute.IProcessExecutor;

/**
 * Created by shixin on 2016/11/2.
 */
public class FlinkProcessExecutor implements IProcessExecutor {

    private IComponentProvider componentProvider;

    public FlinkProcessExecutor(IComponentProvider componentProvider) {
        this.componentProvider = componentProvider;
    }

    @Override
    public void execute(ProcessorGraph processorGraph, String... args) throws Exception {
        FlinkProcessActuator actuator = new FlinkProcessActuator(this.componentProvider);
        actuator.initialize(processorGraph, args);
        actuator.launch();
    }
}
