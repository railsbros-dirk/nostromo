/*
 * MusicOMatWithMediaObject.java
 *
 * Version 1.0  Jan 12, 2009
 *
 * Copyright notice
 *
 * Brief description
 *
 * (c) 2009 by dbreuer
 */
package de.fhkoeln.santiago.codesamples;

import java.net.URI;

import de.fhkoeln.cosima.media.MediaComponent;
import de.fhkoeln.cosima.media.Media;
import de.fhkoeln.cosima.services.IODescriptor;
import de.fhkoeln.cosima.util.Logger;
import de.fhkoeln.santiago.components.ffmpeg.FFMpegMerger;
import de.fhkoeln.santiago.components.jmf.MediaAction;

public class MusicOMatWithMediaObject extends AbstractComponent {
  
  public IODescriptor _execute() {
    IODescriptor output = new IODescriptor();
    
    MediaComponent outputMedia = new Media();
    outputMedia.setName("SlideshowWithMusic");
    
    MediaComponent movieFile = getBroker().retrieve(getInput.getDescriptorElements()[0]);
    MediaComponent audioFile = getBroker().retrieve(getInput.getDescriptorElements()[1]);
    
    MediaAction action = new FFMpegMerger(movieFile, audioFile, outputMedia);
    action.performAction();
    
    URI mediaUri = getBroker().store(outputMedia);
    output.add(mediaUri.toString());
    
    return output;
  }

}