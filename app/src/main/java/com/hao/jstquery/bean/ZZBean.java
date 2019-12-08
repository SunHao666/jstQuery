package com.hao.jstquery.bean;

import java.util.List;

public class ZZBean {


    /**
     * totalRow : 3923
     * pageNumber : 1
     * firstPage : true
     * lastPage : false
     * totalPage : 197
     * pageSize : 20
     * list : [{"regNo":"国食药监械（进）字2012第2661479号（更）","supplierName":"北京天士力医药有限公司","innName":"一次性使用真空采血管","flag":"1","specification":"蓝色2.7ml 血凝管 透明标签","remark":"","reviewer":"刘阳","supplierCode":"GYS000100","expDate":"2016-04-22 00:00:00","url":"UPLOAD\\JST\\GYS000100\\REGISTRATIONCERTIFICATE\\国食药监械（进）字2012第2661479号（更）.pdf","effDate":"2012-04-23 00:00:00","tradeName":"2.7ml 血凝管","brank":"非可替","manfacturerName":"奥地利格雷那公司","tempcolumn":0,"reviewDate":"2016-09-19 18:01:33","manfacturerId":"MANU000224","createUser":"天士力主数据维护","id":1,"temprownumber":1,"createDate":"2016-08-10 13:39:55","drugSerialNo":"YPJBXX004819","status":"1"}]
     */

    private int totalRow;
    private int pageNumber;
    private boolean firstPage;
    private boolean lastPage;
    private int totalPage;
    private int pageSize;
    private List<ZZListBean> list;

    public int getTotalRow() {
        return totalRow;
    }

    public void setTotalRow(int totalRow) {
        this.totalRow = totalRow;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public boolean isFirstPage() {
        return firstPage;
    }

    public void setFirstPage(boolean firstPage) {
        this.firstPage = firstPage;
    }

    public boolean isLastPage() {
        return lastPage;
    }

    public void setLastPage(boolean lastPage) {
        this.lastPage = lastPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<ZZListBean> getList() {
        return list;
    }

    public void setList(List<ZZListBean> list) {
        this.list = list;
    }

    public static class ZZListBean {
        /**
         * regNo : 国食药监械（进）字2012第2661479号（更）
         * supplierName : 北京天士力医药有限公司
         * innName : 一次性使用真空采血管
         * flag : 1
         * specification : 蓝色2.7ml 血凝管 透明标签
         * remark :
         * reviewer : 刘阳
         * supplierCode : GYS000100
         * expDate : 2016-04-22 00:00:00
         * url : UPLOAD\JST\GYS000100\REGISTRATIONCERTIFICATE\国食药监械（进）字2012第2661479号（更）.pdf
         * effDate : 2012-04-23 00:00:00
         * tradeName : 2.7ml 血凝管
         * brank : 非可替
         * manfacturerName : 奥地利格雷那公司
         * tempcolumn : 0
         * reviewDate : 2016-09-19 18:01:33
         * manfacturerId : MANU000224
         * createUser : 天士力主数据维护
         * id : 1
         * temprownumber : 1
         * createDate : 2016-08-10 13:39:55
         * drugSerialNo : YPJBXX004819
         * status : 1
         */

        private String regNo;
        private String supplierName;
        private String innName;
        private String flag;
        private String specification;
        private String remark;
        private String reviewer;
        private String supplierCode;
        private String expDate;
        private String url;
        private String effDate;
        private String tradeName;
        private String brank;
        private String manfacturerName;
        private int tempcolumn;
        private String reviewDate;
        private String manfacturerId;
        private String createUser;
        private int id;
        private int temprownumber;
        private String createDate;
        private String drugSerialNo;
        private String status;

        public String getRegNo() {
            return regNo;
        }

        public void setRegNo(String regNo) {
            this.regNo = regNo;
        }

        public String getSupplierName() {
            return supplierName;
        }

        public void setSupplierName(String supplierName) {
            this.supplierName = supplierName;
        }

        public String getInnName() {
            return innName;
        }

        public void setInnName(String innName) {
            this.innName = innName;
        }

        public String getFlag() {
            return flag;
        }

        public void setFlag(String flag) {
            this.flag = flag;
        }

        public String getSpecification() {
            return specification;
        }

        public void setSpecification(String specification) {
            this.specification = specification;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getReviewer() {
            return reviewer;
        }

        public void setReviewer(String reviewer) {
            this.reviewer = reviewer;
        }

        public String getSupplierCode() {
            return supplierCode;
        }

        public void setSupplierCode(String supplierCode) {
            this.supplierCode = supplierCode;
        }

        public String getExpDate() {
            return expDate;
        }

        public void setExpDate(String expDate) {
            this.expDate = expDate;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getEffDate() {
            return effDate;
        }

        public void setEffDate(String effDate) {
            this.effDate = effDate;
        }

        public String getTradeName() {
            return tradeName;
        }

        public void setTradeName(String tradeName) {
            this.tradeName = tradeName;
        }

        public String getBrank() {
            return brank;
        }

        public void setBrank(String brank) {
            this.brank = brank;
        }

        public String getManfacturerName() {
            return manfacturerName;
        }

        public void setManfacturerName(String manfacturerName) {
            this.manfacturerName = manfacturerName;
        }

        public int getTempcolumn() {
            return tempcolumn;
        }

        public void setTempcolumn(int tempcolumn) {
            this.tempcolumn = tempcolumn;
        }

        public String getReviewDate() {
            return reviewDate;
        }

        public void setReviewDate(String reviewDate) {
            this.reviewDate = reviewDate;
        }

        public String getManfacturerId() {
            return manfacturerId;
        }

        public void setManfacturerId(String manfacturerId) {
            this.manfacturerId = manfacturerId;
        }

        public String getCreateUser() {
            return createUser;
        }

        public void setCreateUser(String createUser) {
            this.createUser = createUser;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getTemprownumber() {
            return temprownumber;
        }

        public void setTemprownumber(int temprownumber) {
            this.temprownumber = temprownumber;
        }

        public String getCreateDate() {
            return createDate;
        }

        public void setCreateDate(String createDate) {
            this.createDate = createDate;
        }

        public String getDrugSerialNo() {
            return drugSerialNo;
        }

        public void setDrugSerialNo(String drugSerialNo) {
            this.drugSerialNo = drugSerialNo;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}
