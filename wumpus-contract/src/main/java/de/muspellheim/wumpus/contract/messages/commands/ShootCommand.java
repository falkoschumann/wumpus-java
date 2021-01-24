/*
 * Hunt the Wumpus - Contract
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.wumpus.contract.messages.commands;

import lombok.Value;

@Value
public class ShootCommand {
  int intoRoom;
}
