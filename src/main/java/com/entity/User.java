package com.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class User implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 余额
     */
    private BigDecimal amount;

    /**
     * user
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     * @return id 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 用户名
     * @return name 用户名
     */
    public String getName() {
        return name;
    }

    /**
     * 用户名
     * @param name 用户名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 余额
     * @return amount 余额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 余额
     * @param amount 余额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}