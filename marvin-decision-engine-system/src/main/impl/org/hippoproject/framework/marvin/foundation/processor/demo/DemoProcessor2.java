/**
 * 
 */
package org.hippoproject.framework.marvin.foundation.processor.demo;

import org.hippoproject.framework.marvin.foundation.processor.BaseProcessor;
import org.hippoproject.framework.marvin.foundation.processor.IProcessInput;
import org.hippoproject.framework.marvin.foundation.processor.IProcessOutput;

/**
 * @author shixin
 *
 */
public class DemoProcessor2 extends BaseProcessor {

	public void processDemoBean(DemoBean1 b, IProcessInput input, IProcessOutput output) throws Exception {
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% " + b);
	}
	
}
