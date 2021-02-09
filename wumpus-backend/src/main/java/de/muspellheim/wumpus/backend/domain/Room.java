/*
 * Hunt the Wumpus - Backend
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.wumpus.backend.domain;

import lombok.Value;

@Value
public class Room {
  int roomNumber;
  int tunnel1LeadsTo;
  int tunnel2LeadsTo;
  int tunnel3LeadsTo;
}
