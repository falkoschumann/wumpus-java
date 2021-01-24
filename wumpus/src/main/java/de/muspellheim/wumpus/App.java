/*
 * Hunt the Wumpus - Application
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.wumpus;

import static de.muspellheim.wumpus.MessageUtils.getMessage;
import static de.muspellheim.wumpus.frontend.StringUtils.join;
import static de.muspellheim.wumpus.frontend.StringUtils.split;

import de.muspellheim.wumpus.backend.LinkedList;
import org.apache.commons.text.WordUtils;

public class App {
  public static void main(String[] args) {
    LinkedList tokens;
    tokens = split(getMessage());
    String result = join(tokens);
    System.out.println(WordUtils.capitalize(result));
  }
}
