/*
 * Hunt the Wumpus - Frontend
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.wumpus.frontend;

import de.muspellheim.wumpus.backend.LinkedList;

class JoinUtils {
  public static String join(LinkedList source) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < source.size(); ++i) {
      if (result.length() > 0) {
        result.append(" ");
      }
      result.append(source.get(i));
    }

    return result.toString();
  }
}
