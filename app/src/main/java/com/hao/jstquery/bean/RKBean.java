package com.hao.jstquery.bean;

import java.util.List;

public class RKBean {


    /**
     * totalRow : 24
     * pageNumber : 1
     * firstPage : true
     * lastPage : false
     * totalPage : 2
     * pageSize : 20
     * list : [{"supplierName":"北京天士力医药有限公司","innName":"测试货品2","batchNo":"123d3","inPageNo":"GKRKD0000000038","inDate":"2019-11-15 10:57:46","specification":"6","inCheckUserName":"管理员","tradeMark":"s苏州碧迪医疗器械有限公司","productDate":"2019-11-01 00:00:00","effDate":"2019-11-23 00:00:00","tradeName":"测试货品2","tempcolumn":0,"inAmount":1,"manufactoryName":"苏州碧迪医疗器械有限公司","articalNumber":"","rfid":"0001310095478528","temprownumber":1,"inItemId":145}]
     */

    private int totalRow;
    private int pageNumber;
    private boolean firstPage;
    private boolean lastPage;
    private int totalPage;
    private int pageSize;
    private List<RKListBean> list;

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

    public List<RKListBean> getList() {
        return list;
    }

    public void setList(List<RKListBean> list) {
        this.list = list;
    }

    public static class RKListBean {
        /**
         * supplierName : 北京天士力医药有限公司
         * innName : 测试货品2
         * batchNo : 123d3
         * inPageNo : GKRKD0000000038
         * inDate : 2019-11-15 10:57:46
         * specification : 6
         * inCheckUserName : 管理员
         * tradeMark : s苏州碧迪医疗器械有限公司
         * productDate : 2019-11-01 00:00:00
         * effDate : 2019-11-23 00:00:00
         * tradeName : 测试货品2
         * tempcolumn : 0
         * inAmount : 1
         * manufactoryName : 苏州碧迪医疗器械有限公司
         * articalNumber :
         * rfid : 0001310095478528
         * temprownumber : 1
         * inItemId : 145
         */

        private String supplierName;
        private String innName;
        private String batchNo;
        private String inPageNo;
        private String inDate;
        private String specification;
        private String inCheckUserName;
        private String tradeMark;
        private String productDate;
        private String effDate;
        private String tradeName;
        private int tempcolumn;
        private int inAmount;
        private String manufactoryName;
        private String articalNumber;
        private String rfid;
        private int temprownumber;
        private int inItemId;

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

        public String getBatchNo() {
            return batchNo;
        }

        public void setBatchNo(String batchNo) {
            this.batchNo = batchNo;
        }

        public String getInPageNo() {
            return inPageNo;
        }

        public void setInPageNo(String inPageNo) {
            this.inPageNo = inPageNo;
        }

        public String getInDate() {
            return inDate;
        }

        public void setInDate(String inDate) {
            this.inDate = inDate;
        }

        public String getSpecification() {
            return specification;
        }

        public void setSpecification(String specification) {
            this.specification = specification;
        }

        public String getInCheckUserName() {
            return inCheckUserName;
        }

        public void setInCheckUserName(String inCheckUserName) {
            this.inCheckUserName = inCheckUserName;
        }

        public String getTradeMark() {
            return tradeMark;
        }

        public void setTradeMark(String tradeMark) {
            this.tradeMark = tradeMark;
        }

        public String getProductDate() {
            return productDate;
        }

        public void setProductDate(String productDate) {
            this.productDate = productDate;
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

        public int getTempcolumn() {
            return tempcolumn;
        }

        public void setTempcolumn(int tempcolumn) {
            this.tempcolumn = tempcolumn;
        }

        public int getInAmount() {
            return inAmount;
        }

        public void setInAmount(int inAmount) {
            this.inAmount = inAmount;
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

        public int getInItemId() {
            return inItemId;
        }

        public void setInItemId(int inItemId) {
            this.inItemId = inItemId;
        }
    }
}
