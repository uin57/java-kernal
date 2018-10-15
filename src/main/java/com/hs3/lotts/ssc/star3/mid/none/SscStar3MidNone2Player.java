package com.hs3.lotts.ssc.star3.mid.none;

import com.hs3.lotts.ssc.star3.front.none.SscStar3FrontNone2Player;

public class SscStar3MidNone2Player
        extends SscStar3FrontNone2Player {
    protected void init() {
        setRemark("从0-9中至少选择2个号码投注，竞猜开奖号码中三位中包含这2个号码，包含即中奖");
        setExample("投注：1，2  开奖：*12x*（不限顺序） 即中奖");
    }

    public String getQunName() {
        return "中三";
    }

    protected int index() {
        return 1;
    }
}
