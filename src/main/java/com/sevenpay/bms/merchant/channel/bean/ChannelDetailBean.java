package com.sevenpay.bms.merchant.channel.bean;

import java.util.Date;

/**
 * 网关通道-商户号详情Bean
 *  * @author hongjiagui
 *
 */
public class ChannelDetailBean {
	/**
	 * 商户号
	 */
	private String merNo;
	/**
	 * 商户id
	 */
	private String merCustId;
	/**
	 * 支付类型    weixin-微信   alipay-支付宝  combined-聚合
	 */
	private String payType;
	/**
	 * 产品类型
	 */
	private String subPayType;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date modifyTime;
	/**
	 * 状态  0-可用  1-作废
	 */
	private String status;
	/**
	 * 商户key
	 */
	private String merKey;
	/**
	 * 预留字段
	 */
	private String reserved;
	public String getMerNo() {
		return merNo;
	}
	public void setMerNo(String merNo) {
		this.merNo = merNo;
	}
	public String getMerCustId() {
		return merCustId;
	}
	public void setMerCustId(String merCustId) {
		this.merCustId = merCustId;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getSubPayType() {
		return subPayType;
	}
	public void setSubPayType(String subPayType) {
		this.subPayType = subPayType;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMerKey() {
		return merKey;
	}
	public void setMerKey(String merKey) {
		this.merKey = merKey;
	}
	public String getReserved() {
		return reserved;
	}
	public void setReserved(String reserved) {
		this.reserved = reserved;
	}
	
	
}
