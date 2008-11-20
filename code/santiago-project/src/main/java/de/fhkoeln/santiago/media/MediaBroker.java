/*
 * MediaBroker.java
 *
 * Version 1.0  Nov 16, 2008
 *
 * Copyright notice
 *
 * Brief description
 *
 * (c) 2008 by dbreuer
 */
package de.fhkoeln.santiago.media;

/**
 * Interface for a Media Broker. It defines methods to store and
 * receive AbstractMedia Objects. Furthermore a method is provided to
 * query the overall objects known by the broker.
 * 
 * @author dbreuer
 * @version 1.0 Nov 16, 2008
 */
public interface MediaBroker {

  /**
   * @param media
   */
  public void store(AbstractMedia media);

  /**
   * @return
   */
  public int knownElements();

  /**
   * @param string
   * @return
   */
  public AbstractMedia retrieve(String mediaId);

  /**
   * Clears the whole broker
   */
  public void clearAll();

  /**
   * @return true if the Broker knows no elements
   */
  public boolean isEmtpy();

}
