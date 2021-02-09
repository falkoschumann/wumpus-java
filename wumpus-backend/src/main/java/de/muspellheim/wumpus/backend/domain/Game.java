/*
 * Hunt the Wumpus - Backend
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.wumpus.backend.domain;

import java.util.List;

public class Game {
  private final List<Room> rooms;

  public Game() {
    rooms =
        List.of(
            new Room(1, 2, 5, 8),
            new Room(2, 1, 3, 10),
            new Room(3, 2, 4, 12),
            new Room(4, 3, 5, 14),
            new Room(5, 1, 4, 6),
            new Room(6, 5, 7, 15),
            new Room(7, 6, 8, 17),
            new Room(8, 1, 7, 9),
            new Room(9, 8, 10, 18),
            new Room(10, 2, 9, 11),
            new Room(11, 10, 12, 19),
            new Room(12, 3, 11, 13),
            new Room(13, 12, 14, 20),
            new Room(14, 4, 13, 15),
            new Room(15, 6, 14, 16),
            new Room(16, 15, 17, 20),
            new Room(17, 7, 16, 18),
            new Room(18, 9, 17, 19),
            new Room(19, 11, 18, 20),
            new Room(20, 13, 16, 19));
  }
}
