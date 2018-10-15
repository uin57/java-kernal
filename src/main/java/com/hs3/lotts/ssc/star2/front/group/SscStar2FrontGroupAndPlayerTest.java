package com.hs3.lotts.ssc.star2.front.group;

import com.hs3.lotts.PlayerBase;
import com.hs3.lotts.ssc.SscBaseTest;

import java.util.List;

import org.junit.Test;

public class SscStar2FrontGroupAndPlayerTest
        extends SscBaseTest {
    private PlayerBase p = new SscStar2FrontGroupAndPlayer();

    @Test
    public void testIfOpenWin() {
        String content = "1,2,3,4,5,6,7,8,9";
        doTest(this.p, content);
    }

    protected String getKey(List<Integer> openNum) {
        return String.format("%d%d---", new Object[]{openNum.get(0), openNum.get(1)});
    }
}
