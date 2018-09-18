package com.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class User implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private BigDecimal amount;

    /**
     * user
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return name 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 
     * @return amount 
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 
     * @param amount 
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}