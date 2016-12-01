package org.hippoproject.framework.marvin.foundation.processor;

import java.io.Serializable;

/**
 */
public interface IProcessInput extends Serializable {

    public Object getInputObject();

    public boolean hasInputObject();

}
