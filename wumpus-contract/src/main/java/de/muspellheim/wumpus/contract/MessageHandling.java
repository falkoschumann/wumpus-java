/*
 * Hunt the Wumpus - Contract
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.wumpus.contract;

import de.muspellheim.wumpus.contract.messages.commands.CommandStatus;
import de.muspellheim.wumpus.contract.messages.commands.MoveCommand;
import de.muspellheim.wumpus.contract.messages.commands.ShootCommand;
import de.muspellheim.wumpus.contract.messages.commands.StartGameCommand;
import de.muspellheim.wumpus.contract.messages.queries.RoomQuery;
import de.muspellheim.wumpus.contract.messages.queries.RoomQueryResult;

public interface MessageHandling {
  CommandStatus handle(StartGameCommand command);

  CommandStatus handle(MoveCommand command);

  CommandStatus handle(ShootCommand command);

  RoomQueryResult handle(RoomQuery query);
}
