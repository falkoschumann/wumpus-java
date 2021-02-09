/*
 * Hunt the Wumpus - Application
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.wumpus;

import de.muspellheim.wumpus.backend.MessageHandler;
import de.muspellheim.wumpus.frontend.UserInterface;

public class App {
  public static void main(String[] args) {
    var backend = new MessageHandler();
    var frontend = new UserInterface(backend);
    frontend.run();
  }
}
