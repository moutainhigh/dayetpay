package com.sevenpay.bms.accounting.refund.mapper;

import org.apache.ibatis.annotations.Param;

import com.sevenpay.bms.common.annotation.MapperScanSabs;

@MapperScanSabs
public interface SmallMapper {

	/**
	 * 根据clearId更改订单状态
	 * @param clearId
	 * @return
	 */
	int updateBussorder(@Param("clearId")String clearId,@Param("state")String state);

}
