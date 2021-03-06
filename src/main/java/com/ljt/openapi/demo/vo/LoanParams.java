package com.ljt.openapi.demo.vo;

import java.util.List;


public class LoanParams {
  /**
   * 个人借款人信息
   */
  private CsCust cs_cust;

  /**
   * 企业借款人信息
   */
  private CpCust cp_cust;
  /**
   * 联系人信息
   */
  private List<LoanContact> contacts;
  /**
   * 资金需求信息
   */
  private LoanFac fac;
  /**
   * 担保信息
   */
  private List<LoanCol> col;
  
  /**
   * callbackURL:授信状态变更后通知回调URL
   */
  private String callbackURL;

  public CsCust getCs_cust() {
    return cs_cust;
  }

  public void setCs_cust(CsCust cs_cust) {
    this.cs_cust = cs_cust;
  }

  public CpCust getCp_cust() {
    return cp_cust;
  }

  public void setCp_cust(CpCust cp_cust) {
    this.cp_cust = cp_cust;
  }

  public List<LoanContact> getContacts() {
    return contacts;
  }

  public void setContacts(List<LoanContact> contacts) {
    this.contacts = contacts;
  }

  public LoanFac getFac() {
    return fac;
  }

  public void setFac(LoanFac fac) {
    this.fac = fac;
  }

  public List<LoanCol> getCol() {
    return col;
  }

  public void setCol(List<LoanCol> col) {
    this.col = col;
  }

  public String getCallbackURL() {
    return callbackURL;
  }

  public void setCallbackURL(String callbackURL) {
    this.callbackURL = callbackURL;
  }

}
