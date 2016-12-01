package org.hippoproject.framework.marvin.foundation.processor;

import java.io.Serializable;

/**
 */
public interface IProcessor extends Serializable {

    public void activate(IProcessActivateContext activateContext) throws Exception;

    public void deactivate() throws Exception;

    public void process(IProcessInput input, IProcessOutput output) throws Exception;


}
