/*
 * Hunt the Wumpus - Backend
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.wumpus.backend;

import de.muspellheim.wumpus.contract.MessageHandling;
import de.muspellheim.wumpus.contract.messages.commands.CommandStatus;
import de.muspellheim.wumpus.contract.messages.commands.MoveCommand;
import de.muspellheim.wumpus.contract.messages.commands.ShootCommand;
import de.muspellheim.wumpus.contract.messages.commands.StartGameCommand;
import de.muspellheim.wumpus.contract.messages.queries.RoomQuery;
import de.muspellheim.wumpus.contract.messages.queries.RoomQueryResult;

public class MessageHandler implements MessageHandling {
  @Override
  public CommandStatus handle(StartGameCommand command) {
    return null;
  }

  @Override
  public CommandStatus handle(MoveCommand command) {
    return null;
  }

  @Override
  public CommandStatus handle(ShootCommand command) {
    return null;
  }

  @Override
  public RoomQueryResult handle(RoomQuery query) {
    return null;
  }
}
