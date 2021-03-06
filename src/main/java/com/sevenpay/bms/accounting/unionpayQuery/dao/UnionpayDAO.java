package com.sevenpay.bms.accounting.unionpayQuery.dao;

import java.util.List;

import org.gyzb.platform.web.page.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sevenpay.bms.accounting.unionpayQuery.bean.BalUnionpaySevenResultEqual;
import com.sevenpay.bms.accounting.unionpayQuery.bean.BalUnionpaySevenResultEqualBean;
import com.sevenpay.bms.accounting.unionpayQuery.bean.BalUnionpaySevenResultException;
import com.sevenpay.bms.accounting.unionpayQuery.bean.BalUnionpaySevenResultExceptionBean;
import com.sevenpay.bms.accounting.unionpayQuery.bean.BalUnionpayUnionResultException;
import com.sevenpay.bms.accounting.unionpayQuery.bean.UnionpayUnionResultExceptionBean;
import com.sevenpay.bms.accounting.unionpayQuery.mapper.UnionpayResultMapper;

@Repository
public class UnionpayDAO {
	
	@Autowired
	private UnionpayResultMapper unionpayResultMapper;
	
	/**
	 * 银联存疑列表
	 * @param BalUnionpayUnionResultException
	 * @return
	 */
	@Page
	public List<BalUnionpayUnionResultException> selectImpeachList(UnionpayUnionResultExceptionBean BalUnionpayUnionResultException){
		return unionpayResultMapper.selectImpeachList(BalUnionpayUnionResultException);
	}
	/**
	 * 七分钱存疑列表
	 * @param balUnionpaySevenResultExceptionBean
	 * @return
	 */
	@Page
	public List<BalUnionpaySevenResultException> selectQfqImpeachList(BalUnionpaySevenResultExceptionBean balUnionpaySevenResultExceptionBean){
		return unionpayResultMapper.selectQfqImpeachList(balUnionpaySevenResultExceptionBean);
	}
	
	/**
	 * 差错报表
	 * @param balUnionpaySevenResultExceptionBean
	 * @return
	 */
	@Page
	public List<BalUnionpaySevenResultException> selectSlipList(BalUnionpaySevenResultExceptionBean balUnionpaySevenResultExceptionBean){
		return unionpayResultMapper.selectSlipList(balUnionpaySevenResultExceptionBean);
	}
	

	/**
	 * 一致报表
	 * @param balUnionpaySevenResultEqualBean
	 * @return
	 */
	@Page
	public List<BalUnionpaySevenResultEqual> selectFitList(BalUnionpaySevenResultEqualBean balUnionpaySevenResultEqualBean){
		return unionpayResultMapper.selectFitList(balUnionpaySevenResultEqualBean);
	}
}
