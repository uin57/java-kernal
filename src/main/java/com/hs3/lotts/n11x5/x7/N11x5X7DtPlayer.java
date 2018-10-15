package com.hs3.lotts.n11x5.x7;

import com.hs3.lotts.n11x5.nx.N11x5DtPlayer;

import java.math.BigDecimal;

public class N11x5X7DtPlayer extends N11x5DtPlayer {
    private BigDecimal bonus = new BigDecimal("44").divide(new BigDecimal(2));

    protected void init() {
        setRemark("从01-11共11个号码中至少选择7个以上号码进行投注，每注需至少包括1个胆码及6个拖码。只要所选的每注7个号码当中，有5个和当期的5个开奖号码全部相同，即为中奖");
        setExample("投注：01,02,03,04,05,06,07 开奖：01,02,03,04,05（不限顺序）");
    }

    public BigDecimal getBonus() {
        return this.bonus;
    }

    public String getQunName() {
        return "任选七";
    }

    protected int getSelectNum() {
        return 7;
    }

    protected int getWinNum() {
        return 5;
    }
}
