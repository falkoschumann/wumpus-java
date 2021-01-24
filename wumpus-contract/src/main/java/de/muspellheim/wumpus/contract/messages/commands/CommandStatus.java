/*
 * Hunt the Wumpus - Contract
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.wumpus.contract.messages.commands;

import lombok.EqualsAndHashCode;
import lombok.Value;

public abstract class CommandStatus {
  private CommandStatus() {}

  @Value
  @EqualsAndHashCode(callSuper = false)
  static class Success extends CommandStatus {}

  @Value
  @EqualsAndHashCode(callSuper = false)
  static class Failure extends CommandStatus {
    String ErrorMessage;
  }
}
