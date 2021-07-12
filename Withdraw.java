package com.fcs.service.lightwallet;

import java.math.BigDecimal;

import com.fcs.controller.api.WithdrawRequest;


public class Withdraw {

  private String to;
  private BigDecimal amount;
  private String data = "{\"gasValue\": \"0\"}";
  private String currency;
  private BigDecimal fee = BigDecimal.valueOf(0);
  private String description = "Withdraw from onstore.io";

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public BigDecimal getFee() {
    return fee;
  }

  public void setFee(BigDecimal fee) {
    this.fee = fee;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Withdraw() {}

  public Withdraw(WithdrawRequest withdrawRequest) {
    this.setTo(withdrawRequest.getTo());
    this.setAmount(withdrawRequest.getAmount());
    this.setDescription(withdrawRequest.getDescription());
    this.setCurrency(withdrawRequest.getCurrency());
  }
}
