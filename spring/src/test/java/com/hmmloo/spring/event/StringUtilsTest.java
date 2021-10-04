package com.hmmloo.spring.event;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

public class StringUtilsTest {
    public static final String[] ORACLE_TEXT_INDEX_RESERVED_WORDS = {
            "ABOUT", "ACCUM", "BT", "BTG", "EQUIV", "FUZZY", "HASPATH", "INPATH", "MDATA", "MINUS", "NEAR",
            "NOT", "NT", "NTG", "NTI", "NTP", "OR", "PT", "RT", "SQE", "SYN", "TR", "TRSYN", "TT", "WITHIN"
    };

    @Test
    public void replaceKeyword1() {
        String str1 = "about thisabout not is within".toUpperCase();
        String str2 =
                StringUtils.replace(str1,
                        "\\b(" + String.join("|", ORACLE_TEXT_INDEX_RESERVED_WORDS) + ")\\b", "{$1}");
        Assertions.assertEquals("{ABOUT} THISABOUT {NOT} IS {WITHIN}", str2);
    }
}
