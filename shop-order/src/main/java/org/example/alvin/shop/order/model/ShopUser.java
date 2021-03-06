package org.example.alvin.shop.order.model;

import java.math.BigDecimal;
import java.util.Date;

public class ShopUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_user.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_user.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_user.user_password
     *
     * @mbg.generated
     */
    private String userPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_user.user_mobile
     *
     * @mbg.generated
     */
    private String userMobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_user.user_reg_time
     *
     * @mbg.generated
     */
    private Date userRegTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_user.user_balance
     *
     * @mbg.generated
     */
    private BigDecimal userBalance;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_user
     *
     * @mbg.generated
     */
    public ShopUser(Long userId, String userName, String userPassword, String userMobile, Date userRegTime, BigDecimal userBalance) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userMobile = userMobile;
        this.userRegTime = userRegTime;
        this.userBalance = userBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_user
     *
     * @mbg.generated
     */
    public ShopUser() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_user.user_id
     *
     * @return the value of shop_user.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_user.user_id
     *
     * @param userId the value for shop_user.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_user.user_name
     *
     * @return the value of shop_user.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_user.user_name
     *
     * @param userName the value for shop_user.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_user.user_password
     *
     * @return the value of shop_user.user_password
     *
     * @mbg.generated
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_user.user_password
     *
     * @param userPassword the value for shop_user.user_password
     *
     * @mbg.generated
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_user.user_mobile
     *
     * @return the value of shop_user.user_mobile
     *
     * @mbg.generated
     */
    public String getUserMobile() {
        return userMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_user.user_mobile
     *
     * @param userMobile the value for shop_user.user_mobile
     *
     * @mbg.generated
     */
    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_user.user_reg_time
     *
     * @return the value of shop_user.user_reg_time
     *
     * @mbg.generated
     */
    public Date getUserRegTime() {
        return userRegTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_user.user_reg_time
     *
     * @param userRegTime the value for shop_user.user_reg_time
     *
     * @mbg.generated
     */
    public void setUserRegTime(Date userRegTime) {
        this.userRegTime = userRegTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_user.user_balance
     *
     * @return the value of shop_user.user_balance
     *
     * @mbg.generated
     */
    public BigDecimal getUserBalance() {
        return userBalance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_user.user_balance
     *
     * @param userBalance the value for shop_user.user_balance
     *
     * @mbg.generated
     */
    public void setUserBalance(BigDecimal userBalance) {
        this.userBalance = userBalance;
    }
}