package com.sevenpay.bms.basemanager.aggregatepayment.merchant.dao;

import java.util.List;

import org.gyzb.platform.web.page.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sevenpay.bms.basemanager.aggregatepayment.merchant.bean.TdMerchantCollectDaily;
import com.sevenpay.bms.basemanager.aggregatepayment.merchant.mapper.TdMerchantCollectDailySelectMapper;

@Repository
public class TdMerchantCollectDailyDAO {
	
	@Autowired
	private TdMerchantCollectDailySelectMapper tdMerchantCollectDailySelectMapper;
	
	/**
	 * 查询商户每日汇集信息
	 * @param collectDaily
	 * @return
	 */
	@Page
	public List<TdMerchantCollectDaily> selectMerchantCollectDaily(TdMerchantCollectDaily collectDaily){
		
		return tdMerchantCollectDailySelectMapper.selectMerchantCollectDaily(collectDaily);
	}
}
