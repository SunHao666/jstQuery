package com.hao.jstquery.bean;

import java.util.List;

public class CKBean {


    /**
     * totalRow : 15
     * pageNumber : 1
     * firstPage : true
     * lastPage : true
     * totalPage : 1
     * pageSize : 20
     * list : [{"outAmount":1,"innName":"测试货品11","reviewStats":"FALSE","licenseNo":"12321323","tradeMark":"江苏省长丰医疗实业有限公司","fCode":"GREGREGG","effDate":"2019-11-30 00:00:00","tradeName":"测试货品11","outUserName":"刘义","supplierName":"北京天士力医药有限公司","buyPrice":100000,"outDate":"2019-11-14 14:48:49","batchNo":"432432","specification":"11","outPageNo":"GKCKD0000000018","productDate":"2019-11-01 00:00:00","outType":"1","originalSupplierName":"测试经销商1","outItemId":74,"unit":"支","sCode":"3G3G53","tempcolumn":0,"manufactoryName":"江苏省长丰医疗实业有限公司","articalNumber":"","rfid":"0001290259841864","temprownumber":1,"drugSerialNo":"YPJBXX008827"}]
     */

    private int totalRow;
    private int pageNumber;
    private boolean firstPage;
    private boolean lastPage;
    private int totalPage;
    private int pageSize;
    private List<CKListBean> list;

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

    public List<CKListBean> getList() {
        return list;
    }

    public void setList(List<CKListBean> list) {
        this.list = list;
    }

    public static class CKListBean {
        /**
         * outAmount : 1
         * innName : 测试货品11
         * reviewStats : FALSE
         * licenseNo : 12321323
         * tradeMark : 江苏省长丰医疗实业有限公司
         * fCode : GREGREGG
         * effDate : 2019-11-30 00:00:00
         * tradeName : 测试货品11
         * outUserName : 刘义
         * supplierName : 北京天士力医药有限公司
         * buyPrice : 100000
         * outDate : 2019-11-14 14:48:49
         * batchNo : 432432
         * specification : 11
         * outPageNo : GKCKD0000000018
         * productDate : 2019-11-01 00:00:00
         * outType : 1
         * originalSupplierName : 测试经销商1
         * outItemId : 74
         * unit : 支
         * sCode : 3G3G53
         * tempcolumn : 0
         * manufactoryName : 江苏省长丰医疗实业有限公司
         * articalNumber :
         * rfid : 0001290259841864
         * temprownumber : 1
         * drugSerialNo : YPJBXX008827
         */

        private int outAmount;
        private String innName;
        private String reviewStats;
        private String licenseNo;
        private String tradeMark;
        private String fCode;
        private String effDate;
        private String tradeName;
        private String outUserName;
        private String supplierName;
        private int buyPrice;
        private String outDate;
        private String batchNo;
        private String specification;
        private String outPageNo;
        private String productDate;
        private String outType;
        private String originalSupplierName;
        private int outItemId;
        private String unit;
        private String sCode;
        private int tempcolumn;
        private String manufactoryName;
        private String articalNumber;
        private String rfid;
        private int temprownumber;
        private String drugSerialNo;

        public int getOutAmount() {
            return outAmount;
        }

        public void setOutAmount(int outAmount) {
            this.outAmount = outAmount;
        }

        public String getInnName() {
            return innName;
        }

        public void setInnName(String innName) {
            this.innName = innName;
        }

        public String getReviewStats() {
            return reviewStats;
        }

        public void setReviewStats(String reviewStats) {
            this.reviewStats = reviewStats;
        }

        public String getLicenseNo() {
            return licenseNo;
        }

        public void setLicenseNo(String licenseNo) {
            this.licenseNo = licenseNo;
        }

        public String getTradeMark() {
            return tradeMark;
        }

        public void setTradeMark(String tradeMark) {
            this.tradeMark = tradeMark;
        }

        public String getFCode() {
            return fCode;
        }

        public void setFCode(String fCode) {
            this.fCode = fCode;
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

        public String getOutUserName() {
            return outUserName;
        }

        public void setOutUserName(String outUserName) {
            this.outUserName = outUserName;
        }

        public String getSupplierName() {
            return supplierName;
        }

        public void setSupplierName(String supplierName) {
            this.supplierName = supplierName;
        }

        public int getBuyPrice() {
            return buyPrice;
        }

        public void setBuyPrice(int buyPrice) {
            this.buyPrice = buyPrice;
        }

        public String getOutDate() {
            return outDate;
        }

        public void setOutDate(String outDate) {
            this.outDate = outDate;
        }

        public String getBatchNo() {
            return batchNo;
        }

        public void setBatchNo(String batchNo) {
            this.batchNo = batchNo;
        }

        public String getSpecification() {
            return specification;
        }

        public void setSpecification(String specification) {
            this.specification = specification;
        }

        public String getOutPageNo() {
            return outPageNo;
        }

        public void setOutPageNo(String outPageNo) {
            this.outPageNo = outPageNo;
        }

        public String getProductDate() {
            return productDate;
        }

        public void setProductDate(String productDate) {
            this.productDate = productDate;
        }

        public String getOutType() {
            return outType;
        }

        public void setOutType(String outType) {
            this.outType = outType;
        }

        public String getOriginalSupplierName() {
            return originalSupplierName;
        }

        public void setOriginalSupplierName(String originalSupplierName) {
            this.originalSupplierName = originalSupplierName;
        }

        public int getOutItemId() {
            return outItemId;
        }

        public void setOutItemId(int outItemId) {
            this.outItemId = outItemId;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public String getSCode() {
            return sCode;
        }

        public void setSCode(String sCode) {
            this.sCode = sCode;
        }

        public int getTempcolumn() {
            return tempcolumn;
        }

        public void setTempcolumn(int tempcolumn) {
            this.tempcolumn = tempcolumn;
        }

        public String getManufactoryName() {
            return manufactoryName;
        }

        public void setManufactoryName(String manufactoryName) {
            this.manufactoryName = manufactoryName;
        }

        public String getArticalNumber() {
            return articalNumber;
        }

        public void setArticalNumber(String articalNumber) {
            this.articalNumber = articalNumber;
        }

        public String getRfid() {
            return rfid;
        }

        public void setRfid(String rfid) {
            this.rfid = rfid;
        }

        public int getTemprownumber() {
            return temprownumber;
        }

        public void setTemprownumber(int temprownumber) {
            this.temprownumber = temprownumber;
        }

        public String getDrugSerialNo() {
            return drugSerialNo;
        }

        public void setDrugSerialNo(String drugSerialNo) {
            this.drugSerialNo = drugSerialNo;
        }
    }
}
