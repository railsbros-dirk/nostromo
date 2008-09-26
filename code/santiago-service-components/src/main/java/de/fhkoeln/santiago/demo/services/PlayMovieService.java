/*
 * PlayMovieService.java
 *
 * Version 1.0  Sep 25, 2008
 *
 * Copyright notice
 *
 * Brief description
 *
 * (c) 2008 by dbreuer
 */
package de.fhkoeln.santiago.demo.services;

import java.io.IOException;

import javax.media.NoPlayerException;

import de.fhkoeln.santiago.components.jmf.JMFPlayer;
import de.fhkoeln.santiago.components.jmf.MediaAction;
import de.fhkoeln.santiago.services.IODescriptor;


/**
 * Documentation comment without implementation details. 
 * Use implementation comments to describe details of the implementation.
 * Comment lines should not be longer than 70 characters.
 *
 * @author dbreuer
 * @version 1.0  Sep 25, 2008
 *
 */
public class PlayMovieService {
  
  private IODescriptor input;
  
  public IODescriptor execute() {
    IODescriptor output = new IODescriptor();
    
    try {
      MediaAction player = new JMFPlayer(input.first());
      player.performAction();
    } catch (NoPlayerException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    return output ;
  }

  public void setInput(IODescriptor input) {
    this.input = input;
  }

  public IODescriptor getInput() {
    return input;
  }
  
}