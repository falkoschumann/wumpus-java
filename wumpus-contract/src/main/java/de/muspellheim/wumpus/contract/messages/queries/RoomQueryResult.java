/*
 * Hunt the Wumpus - Contract
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.wumpus.contract.messages.queries;

import de.muspellheim.wumpus.contract.data.Item;
import java.util.Set;
import lombok.NonNull;
import lombok.Value;

@Value
public class RoomQueryResult {
  int room;
  int tunnel1LeadsTo;
  int tunnel2LeadsTo;
  int tunnel3LeadsTo;
  @NonNull Set<Item> warnings;
}
