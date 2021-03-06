package com.sevenpay.bms.basemanager.aggregatepayment.merchant.mapper;

import com.sevenpay.bms.basemanager.aggregatepayment.merchant.bean.TdMerchantChannel;
import com.sevenpay.bms.common.annotation.MapperScanCombinedmaster;

@MapperScanCombinedmaster
public interface TdMerchantChannelOperationMapper {

	public int insertMerchantChannel(TdMerchantChannel channel);
	
	public int updateMerchantChannel(TdMerchantChannel channel);
	
	public int deleteMerchantChannel(TdMerchantChannel channel);
}
