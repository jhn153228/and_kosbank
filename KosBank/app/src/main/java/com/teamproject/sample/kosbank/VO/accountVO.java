package com.teamproject.sample.kosbank.VO;

import java.sql.Timestamp;

public class accountVO {
    String account;
    String id;
    int accountPW;
    int balance;
    String accountType;
    String accountState;
    String acc_state_content;
    Timestamp delete_date;
    Timestamp sleep_date;
    Timestamp new_date;
    int accountLimit;
    int oneLimit;
    int reset_accountLimit;
    int reset_oneLimit;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAccountPW() {
        return accountPW;
    }

    public void setAccountPW(int accountPW) {
        this.accountPW = accountPW;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountState() {
        return accountState;
    }

    public void setAccountState(String accountState) {
        this.accountState = accountState;
    }

    public String getAcc_state_content() {
        return acc_state_content;
    }

    public void setAcc_state_content(String acc_state_content) {
        this.acc_state_content = acc_state_content;
    }

    public Timestamp getDelete_date() {
        return delete_date;
    }

    public void setDelete_date(Timestamp delete_date) {
        this.delete_date = delete_date;
    }

    public Timestamp getSleep_date() {
        return sleep_date;
    }

    public void setSleep_date(Timestamp sleep_date) {
        this.sleep_date = sleep_date;
    }

    public Timestamp getNew_date() {
        return new_date;
    }

    public void setNew_date(Timestamp new_date) {
        this.new_date = new_date;
    }

    public int getAccountLimit() {
        return accountLimit;
    }

    public void setAccountLimit(int accountLimit) {
        this.accountLimit = accountLimit;
    }

    public int getOneLimit() {
        return oneLimit;
    }

    public void setOneLimit(int oneLimit) {
        this.oneLimit = oneLimit;
    }

    public int getReset_accountLimit() {
        return reset_accountLimit;
    }

    public void setReset_accountLimit(int reset_accountLimit) {
        this.reset_accountLimit = reset_accountLimit;
    }

    public int getReset_oneLimit() {
        return reset_oneLimit;
    }

    public void setReset_oneLimit(int reset_oneLimit) {
        this.reset_oneLimit = reset_oneLimit;
    }
}
