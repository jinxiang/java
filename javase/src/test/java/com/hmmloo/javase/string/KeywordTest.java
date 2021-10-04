package com.hmmloo.javase.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KeywordTest {
  public static final char[] ORACLE_TEXT_INDEX_RESERVED_CHAR =
      new char[] {
        ',', '&', '?', '{', '}', '\\', '(', ')', '[', ']', '-', ';', '~', '|', '$', '!', '>', '*',
        '%', '_'
      };

  public static final String[] ORACLE_TEXT_INDEX_RESERVED_WORDS = {
    "ABOUT", "ACCUM", "BT", "BTG", "EQUIV", "FUZZY", "HASPATH", "INPATH", "MDATA", "MINUS", "NEAR",
    "NOT", "NT", "NTG", "NTI", "NTP", "OR", "PT", "RT", "SQE", "SYN", "TR", "TRSYN", "TT", "WITHIN"
  };

  @Test
  public void isKeyWord() {
    String str1 = "about";
    boolean flg = false;
    for (String str : ORACLE_TEXT_INDEX_RESERVED_WORDS) {
      flg = str.equalsIgnoreCase(str1.trim());
      if (flg) {
        break;
      }
    }
    Assertions.assertTrue(flg);
  }

  @Test
  public void isNotKeyWord() {
    String str1 = "abot";
    boolean flg = false;
    for (String str : ORACLE_TEXT_INDEX_RESERVED_WORDS) {
      flg = str.equalsIgnoreCase(str1.trim());
      if (flg) {
        break;
      }
    }
    Assertions.assertFalse(flg);
  }

  @Test
  public void replaceKeyword() {
    String str1 = "about thisabout not is".toUpperCase();
    for (String str : ORACLE_TEXT_INDEX_RESERVED_WORDS) {
      str1 = str1.replaceAll("\\b" + str + "\\b", "{" + str + "}");
    }
    Assertions.assertEquals("{ABOUT} THISABOUT {NOT} IS", str1);
  }

  @Test
  public void replaceKeyword1() {
    String str1 = "about thisabout not is within".toUpperCase();
    str1 =
        str1.replaceAll(
            "\\b(" + String.join("|", ORACLE_TEXT_INDEX_RESERVED_WORDS) + ")\\b", "{$1}");
    Assertions.assertEquals("{ABOUT} THISABOUT {NOT} IS {WITHIN}", str1);
  }
}
