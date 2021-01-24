/*
 * Hunt the Wumpus - Contract
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.wumpus.contract.messages.queries;

import java.util.Set;
import lombok.NonNull;
import lombok.Value;

@Value
public class RoomQueryResult {
  int room;
  int tunnel1LeadTo;
  int tunnel2LeadTo;
  int tunnel3LeadTo;
  @NonNull Set<Warning> warnings;

  enum Warning {
    Wumpus,
    Bat,
    Pit
  }
}