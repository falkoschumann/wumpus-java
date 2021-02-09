/*
 * Hunt the Wumpus - Frontend
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.wumpus.frontend;

import de.muspellheim.wumpus.contract.MessageHandling;

public class UserInterface {
  private final MessageHandling messageHandling;

  public UserInterface(MessageHandling messageHandling) {
    this.messageHandling = messageHandling;
  }

  public void run() {}
}
