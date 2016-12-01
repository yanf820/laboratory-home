/**
 * 
 */
package org.hippoproject.framework.marvin.foundation.processor.execute;

import org.hippoproject.framework.marvin.foundation.processor.config.ProcessorGraph;

/**
 */
public interface IProcessExecutor {

	public void execute(ProcessorGraph processorGraph, String ... args) throws Exception;
	
}
