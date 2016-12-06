/**
 * 
 */
package org.hippoproject.framework.marvin.foundation.processor.demo;

import org.hippoproject.framework.marvin.foundation.component.ClassInstantiationComponentProvider;
import org.hippoproject.framework.marvin.foundation.component.IComponentProvider;
import org.hippoproject.framework.marvin.foundation.processor.config.ProcessorGraph;
import org.hippoproject.framework.marvin.foundation.processor.config.ProcessorGraphBuilder;
import org.hippoproject.framework.marvin.foundation.processor.config.ProcessorNodeBuilder;
import org.hippoproject.framework.marvin.foundation.processor.execute.DefaultProcessManager;
import org.hippoproject.framework.marvin.foundation.processor.execute.IProcessManager;
import org.hippoproject.framework.marvin.foundation.processor.flink.FlinkProcessExecutor;
import org.hippoproject.framework.marvin.foundation.processor.standalone.StandaloneProcessExecutor;

/**
 * @author shixin
 *
 */
public class ProcessorLaunchDemo {

	public static void main(String[] args) throws Exception {
	
		String executeProcessId = null;
        String[] executeProcessArgs = null;

        if(args.length > 0) {
            executeProcessId = args[0];
        }
        if(args.length > 2) {
            executeProcessArgs = new String[args.length-1];
            System.arraycopy(args, 1,executeProcessArgs, 0, executeProcessArgs.length);
        }else{
            executeProcessArgs = new String[0];
        }
        
        String executorType = System.getProperty("mx.processor.executorType", "flink");
		
	    IComponentProvider componentProvider = new ClassInstantiationComponentProvider();
	    
	    StandaloneProcessExecutor standaloneProcessExecutor = new StandaloneProcessExecutor(componentProvider);
	    FlinkProcessExecutor flinkProcessExecutor = new FlinkProcessExecutor(componentProvider);
	    IProcessManager processManager = new DefaultProcessManager();
	    
	    if("flink".equals(executorType)){
	    	processManager.setExecutor(flinkProcessExecutor);
	    }else{
	    	processManager.setExecutor(standaloneProcessExecutor);
	    }

	    //register graph
	    processManager.registerProcess(makeDemoProcessorGraph());
	    
	    //startup
        if(executeProcessId != null) {
            processManager.executeProcesses(executeProcessId, executeProcessArgs);
        }else{
            processManager.executeProcesses("demoprocessorgraph");
        }

	}

	private static ProcessorGraph makeDemoProcessorGraph() {
		ProcessorGraph graph = ProcessorGraphBuilder.createWithId("demoprocessorgraph")
	            .addNode(ProcessorNodeBuilder.createWithId("input")
	                    .withComponentId("org.hippoproject.framework.marvin.foundation.processor.demo.DemoProducer")
	                    .withParallelism(1)
	                    .withOutputType(DemoDatum.class)
	            )
	            .addNode(ProcessorNodeBuilder.createWithId("output")
	                    .withComponentId("org.hippoproject.framework.marvin.foundation.processor.demo.DemoProcessor")
	                    .withParallelism(5)
	                    .withOutputType(DemoBean1.class)
	                    .from("input")
	            )
	            .addNode(ProcessorNodeBuilder.createWithId("writer")
	                    .withComponentId("org.hippoproject.framework.marvin.foundation.processor.demo.DemoProcessor2")
	                    .withParallelism(5)
	                    .from("output")
	            )
	            .build();
		System.out.println(">>>> " + graph);
		return graph;
	}
}
