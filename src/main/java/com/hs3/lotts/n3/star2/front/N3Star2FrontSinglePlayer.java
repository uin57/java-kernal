package com.hs3.lotts.n3.star2.front;

import com.hs3.lotts.LotteryUtils;
import com.hs3.lotts.NumberView;
import com.hs3.lotts.PlayerBase;
import com.hs3.utils.ListUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class N3Star2FrontSinglePlayer extends PlayerBase {
    private BigDecimal bonus = new BigDecimal("200").divide(new BigDecimal(2));
    private String qunName = "前二";
    private String groupName = "直选";
    private String title = "单式";
    private List<Integer> nums = new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(0), Integer.valueOf(1),
            Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6),
            Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(9)}));

    protected void init() {
        setRemark("每位至少选择一个号码，竞猜开奖号码的前二位，号码和位置都对应即中奖");
        setExample("投注：45* 开奖：45* 即中奖");
    }

    protected int index() {
        return 0;
    }

    public BigDecimal getBonus() {
        return this.bonus;
    }

    public String getTitle() {
        return this.title;
    }

    public NumberView[] getNumView() {
        return null;
    }

    public Integer getCount(String bets) {
        List<String> lines = ListUtils.toList(bets, "\\s+");
        for (String line : lines) {
            List<Integer> n = LotteryUtils.toIntListByLength(line, 1);
            if (n.size() != 2) {
                return Integer.valueOf(0);
            }
            if (n.retainAll(this.nums)) {
                return Integer.valueOf(0);
            }
        }
        return Integer.valueOf(lines.size());
    }

    public BigDecimal getWin(String bets, List<Integer> openNums) {
        BigDecimal win = new BigDecimal("0");
        int o1 = ((Integer) openNums.get(index())).intValue();
        int o2 = ((Integer) openNums.get(index() + 1)).intValue();

        List<String> lines = ListUtils.toList(bets, "\\s+");
        for (String line : lines) {
            List<Integer> n = LotteryUtils.toIntListByLength(line, 1);
            if ((((Integer) n.get(0)).intValue() == o1) && (((Integer) n.get(1)).intValue() == o2)) {
                win = win.add(this.bonus);
            }
        }
        return win;
    }

    public String getQunName() {
        return this.qunName;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public Map<String, BigDecimal> ifOpenWin(String bets) {
        Map<String, BigDecimal> result = new HashMap();
        String format = null;
        if (index() == 0) {
            format = "%s-";
        } else {
            format = "-%s";
        }
        List<String> lines = ListUtils.toList(bets, "\\s+");
        for (String line : lines) {
            String b = String.format(format, new Object[]{line});
            addMap(result, b, getBonus());
        }
        return result;
    }
}
