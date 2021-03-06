package com.royarn.api.entity;

import java.io.Serializable;

public class Shop implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_shop.id
     *
     * @mbggenerated Tue Oct 30 15:18:51 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_shop.name
     *
     * @mbggenerated Tue Oct 30 15:18:51 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_shop.remark
     *
     * @mbggenerated Tue Oct 30 15:18:51 CST 2018
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_shop.id
     *
     * @return the value of t_shop.id
     *
     * @mbggenerated Tue Oct 30 15:18:51 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_shop.id
     *
     * @param id the value for t_shop.id
     *
     * @mbggenerated Tue Oct 30 15:18:51 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_shop.name
     *
     * @return the value of t_shop.name
     *
     * @mbggenerated Tue Oct 30 15:18:51 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_shop.name
     *
     * @param name the value for t_shop.name
     *
     * @mbggenerated Tue Oct 30 15:18:51 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_shop.remark
     *
     * @return the value of t_shop.remark
     *
     * @mbggenerated Tue Oct 30 15:18:51 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_shop.remark
     *
     * @param remark the value for t_shop.remark
     *
     * @mbggenerated Tue Oct 30 15:18:51 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}