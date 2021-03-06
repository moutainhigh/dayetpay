package com.sevenpay.bms.accounting.cncbdatasource.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sevenpay.bms.accounting.cncbdatasource.bean.BalCncbDataSource;
import com.sevenpay.bms.accounting.cncbdatasource.dao.BalCncbDataSourceDao;



@Service
public class BalCncbDataSourceService {
	@Autowired
	private BalCncbDataSourceDao dao;

	public List<BalCncbDataSource> selectCncbDataSourceList(BalCncbDataSource cncbDataSource) {
		return dao.selectCncbDataSourceList(cncbDataSource);
	}

}
