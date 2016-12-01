package org.hippoproject.framework.marvin.foundation.processor.standalone;

import org.hippoproject.framework.marvin.foundation.component.IComponentProvider;
import org.hippoproject.framework.marvin.foundation.processor.config.ProcessorGraph;
import org.hippoproject.framework.marvin.foundation.processor.execute.IProcessExecutor;

/**
 */
public class StandaloneProcessExecutor implements IProcessExecutor {

    private IComponentProvider componentProvider;

    public StandaloneProcessExecutor(IComponentProvider componentProvider) {
        this.componentProvider = componentProvider;
    }

    @Override
    public void execute(ProcessorGraph processGraph, String... args) throws Exception {
        StandaloneProcessActuator actuator = new StandaloneProcessActuator(this.componentProvider);
        actuator.setMaxPending(100000);
        actuator.initialize(processGraph, args);
        actuator.launch();
    }
}
