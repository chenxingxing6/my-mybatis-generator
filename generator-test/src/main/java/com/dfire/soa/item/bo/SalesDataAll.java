package com.dfire.soa.item.bo;

/**
 * 
 * @author lanxinghua
 * @date 2018/10/20
 */
public class SalesDataAll {

    /**
     * ID
     */
    private Long id;

    /**
     * 商场ID
     */
    private String mallEntityId;

    /**
     * 店铺entity_id
     */
    private String shopEntityId;

    /**
     * 上报的销售金额
     */
    private Long userSalesAmount;

    /**
     * 审核的笔数
     */
    private Integer auditSalesCount;

    /**
     * 审核的销售金额
     */
    private Long auditSalesAmount;

    /**
     * 销售确认书销售金额
     */
    private Long bookSalesAmount;

    /**
     * 上报的笔数
     */
    private Integer userSalesCount;

    /**
     * 日期 201801
     */
    private String date;

    /**
     * 是否有效
     */
    private Byte isValid;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 修改人
     */
    private String opUser;

    /**
     * 修改时间
     */
    private Long opTime;

    /**
     * 版本号
     */
    private Short lastVer;

    /**
     * 审批状态 1待审核 2已审核
     */
    private Byte status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMallEntityId() {
        return mallEntityId;
    }

    public void setMallEntityId(String mallEntityId) {
        this.mallEntityId = mallEntityId;
    }

    public String getShopEntityId() {
        return shopEntityId;
    }

    public void setShopEntityId(String shopEntityId) {
        this.shopEntityId = shopEntityId;
    }

    public Long getUserSalesAmount() {
        return userSalesAmount;
    }

    public void setUserSalesAmount(Long userSalesAmount) {
        this.userSalesAmount = userSalesAmount;
    }

    public Integer getAuditSalesCount() {
        return auditSalesCount;
    }

    public void setAuditSalesCount(Integer auditSalesCount) {
        this.auditSalesCount = auditSalesCount;
    }

    public Long getAuditSalesAmount() {
        return auditSalesAmount;
    }

    public void setAuditSalesAmount(Long auditSalesAmount) {
        this.auditSalesAmount = auditSalesAmount;
    }

    public Long getBookSalesAmount() {
        return bookSalesAmount;
    }

    public void setBookSalesAmount(Long bookSalesAmount) {
        this.bookSalesAmount = bookSalesAmount;
    }

    public Integer getUserSalesCount() {
        return userSalesCount;
    }

    public void setUserSalesCount(Integer userSalesCount) {
        this.userSalesCount = userSalesCount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Byte getIsValid() {
        return isValid;
    }

    public void setIsValid(Byte isValid) {
        this.isValid = isValid;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getOpUser() {
        return opUser;
    }

    public void setOpUser(String opUser) {
        this.opUser = opUser;
    }

    public Long getOpTime() {
        return opTime;
    }

    public void setOpTime(Long opTime) {
        this.opTime = opTime;
    }

    public Short getLastVer() {
        return lastVer;
    }

    public void setLastVer(Short lastVer) {
        this.lastVer = lastVer;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}