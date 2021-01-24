/*
 * Hunt the Wumpus - Frontend
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.wumpus.frontend;

import de.muspellheim.wumpus.backend.LinkedList;

public class StringUtils {
  public static String join(LinkedList source) {
    return JoinUtils.join(source);
  }

  public static LinkedList split(String source) {
    return SplitUtils.split(source);
  }
}
