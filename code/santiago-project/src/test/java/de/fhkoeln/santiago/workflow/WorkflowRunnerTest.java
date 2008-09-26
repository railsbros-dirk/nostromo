/*
 * WorkflowRunnerTest.java
 *
 * Version 1.0  Sep 25, 2008
 *
 * Copyright notice
 *
 * Brief description
 *
 * (c) 2008 by dbreuer
 */
package de.fhkoeln.santiago.workflow;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import de.fhkoeln.santiago.workflow.storage.MapProcessStoreImpl;


/**
 * Documentation comment without implementation details. 
 * Use implementation comments to describe details of the implementation.
 * Comment lines should not be longer than 70 characters.
 *
 * @author dbreuer
 * @version 1.0  Sep 25, 2008
 *
 */
public class WorkflowRunnerTest {
  
  private YamlWorkflowDefinition workflowDefinition;
  private MapProcessStoreImpl processStore;

  /**
   * Test method for {@link de.fhkoeln.santiago.workflow.WorkflowRunner#run()}.
   */
  @Test
  public void testRun() {
    try {
      workflowDefinition = new YamlWorkflowDefinition("res/workflow_definition/abstract_workflow_definition.yml");
      processStore = new MapProcessStoreImpl();
    
      WorkflowRunner runner = new WorkflowRunner();
      runner.setDefinition(workflowDefinition);
      runner.setProcessStore(processStore);
      
      runner.run();
    
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
