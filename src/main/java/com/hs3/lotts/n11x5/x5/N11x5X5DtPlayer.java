package com.hs3.lotts.n11x5.x5;

import com.hs3.lotts.n11x5.nx.N11x5DtPlayer;

import java.math.BigDecimal;

public class N11x5X5DtPlayer extends N11x5DtPlayer {
    private BigDecimal bonus = new BigDecimal("924").divide(new BigDecimal(2));

    protected void init() {
        setRemark("从01-11共11个号码中至少选择5个以上号码进行投注，每注需至少包括1个胆码及4个拖码。只要当期的5个开奖号码中有5个包含所选号码（每注包含5个号码），即为中奖");
        setExample("投注：01,02,03,04,05 开奖：01,02,03,04,05（不限顺序）");
    }

    public BigDecimal getBonus() {
        return this.bonus;
    }

    public String getQunName() {
        return "任选五";
    }

    protected int getSelectNum() {
        return 5;
    }

    protected int getWinNum() {
        return 5;
    }
}
