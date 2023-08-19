package com.nowonbun.stockSearcher2.dao;

import com.nowonbun.stockSearcher2.AbstractDao;
import com.nowonbun.stockSearcher2.entity.Stocklist;

public class StocklistDao extends AbstractDao<Stocklist> {
	protected StocklistDao() {
		super(Stocklist.class);
	}
}
