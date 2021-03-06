package com.hzdongcheng.persistent.sequence;

import com.hzdongcheng.toolkits.EduException;

/**
 * <p>Title: 智能柜系统</p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2018</p>
 *
 * <p>Company: 杭州东城电子有限公司</p>
 *
 * @author zxy
 * @version 1.0
 */
public class SeqTradeWaterID extends Sequence {
    private static String SEQUENCE_NAME = SeqTradeWaterID.class.getSimpleName();

    public SeqTradeWaterID() {
    }

    protected void doGetCurrentMaxValue() throws EduException {
        executeSelectForUpdate(SEQUENCE_NAME);
    }
}
