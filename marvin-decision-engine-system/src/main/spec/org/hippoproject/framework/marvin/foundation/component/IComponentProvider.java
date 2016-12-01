package org.hippoproject.framework.marvin.foundation.component;

import java.io.Serializable;

/**
 */
public interface IComponentProvider extends Serializable {

    public Object getComponent(String componentId);

}
