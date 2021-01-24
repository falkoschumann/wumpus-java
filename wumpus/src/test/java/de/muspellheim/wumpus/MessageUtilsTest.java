/*
 * Hunt the Wumpus - Application
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.wumpus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MessageUtilsTest {
  @Test
  public void testGetMessage() {
    assertEquals("Hello      World!", MessageUtils.getMessage());
  }
}
