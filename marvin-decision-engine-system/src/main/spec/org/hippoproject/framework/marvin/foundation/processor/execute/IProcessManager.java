/**
 * 
 */
package org.hippoproject.framework.marvin.foundation.processor.execute;

import java.util.List;

import org.hippoproject.framework.marvin.foundation.processor.config.ProcessorGraph;

/**
 */
public interface IProcessManager {
	
    public void setExecutor(IProcessExecutor executor);

    public IProcessExecutor getExecutor();

    public void executeProcesses(String processId, String ... args) throws Exception;

    public void registerProcess(ProcessorGraph processorGraph);

    public List<ProcessorGraph> getProcesses();
    
}
