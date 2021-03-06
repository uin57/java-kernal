package com.hs3.lotts.n11x5.x2.group;

import com.hs3.lotts.n11x5.nx.N11x5Player;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N11x5Star2GroupPlayer extends N11x5Player {
    private BigDecimal bonus = new BigDecimal("110").divide(new BigDecimal(2));
    private String qunName = "前二";
    private String groupName = "组选";

    protected void init() {
        setRemark("从01-11共11个号码中选择2个不重复的号码组成一注，所选号码与当期顺序摇出的5个号码中 的前2个号码相同，且顺序不限，即为中奖");
        setExample("投注：01,02 开奖：01,02,*,*,*（不限顺序）");
    }

    public BigDecimal getBonus() {
        return this.bonus;
    }

    public String getQunName() {
        return this.qunName;
    }

    public String getGroupName() {
        return this.groupName;
    }

    protected int getSelectNum() {
        return 2;
    }

    protected int getWinNum() {
        return 2;
    }

    protected List<Integer> getIndexs() {
        return Arrays.asList(new Integer[]{Integer.valueOf(0), Integer.valueOf(1)});
    }

    public BigDecimal getWin(String bets, List<Integer> openNums) {
        List<Integer> opens = new ArrayList();
        opens.add((Integer) openNums.get(0));
        opens.add((Integer) openNums.get(1));

        return super.getWin(bets, opens);
    }
}
