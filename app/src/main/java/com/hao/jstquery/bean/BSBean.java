package com.hao.jstquery.bean;

import java.util.List;

public class BSBean {

    /**
     * totalRow : 1
     * pageNumber : 1
     * firstPage : true
     * lastPage : true
     * totalPage : 1
     * pageSize : 20
     * list : [{"date":"2019-11-12 14:37:42","supplierName":"北京天士力医药有限公司","reportedLossNo":"GKBSD0000000001","innName":"测试货品3","batchNo":"2e12e","manufacturerName":"上海浦东金环医疗用品股份有限公司","specification":"7","purchasePrice":30000,"userName":"管理员","tradeMark":"s上海浦东金环医疗用品股份有限公司","tradeName":"测试货品3","tempcolumn":0,"articalNumber":"","rfid":"0001280696229034","temprownumber":1,"drugSerialNo":"YPJBXX008824"}]
     */

    private int totalRow;
    private int pageNumber;
    private boolean firstPage;
    private boolean lastPage;
    private int totalPage;
    private int pageSize;
    private List<ListBean> list;

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

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * date : 2019-11-12 14:37:42
         * supplierName : 北京天士力医药有限公司  供应商
         * reportedLossNo : GKBSD0000000001 //报损单号
         * innName : 测试货品3
         * batchNo : 2e12e
         * manufacturerName : 上海浦东金环医疗用品股份有限公司
         * specification : 7
         * purchasePrice : 30000
         * userName : 管理员
         * tradeMark : s上海浦东金环医疗用品股份有限公司
         * tradeName : 测试货品3
         * tempcolumn : 0
         * articalNumber :
         * rfid : 0001280696229034
         * temprownumber : 1
         * drugSerialNo : YPJBXX008824
         */

        private String date;
        private String supplierName;
        private String reportedLossNo;
        private String innName;
        private String batchNo;
        private String manufacturerName;
        private String specification;
        private int purchasePrice;
        private String userName;
        private String tradeMark;
        private String tradeName;
        private int tempcolumn;
        private String articalNumber;
        private String rfid;
        private int temprownumber;
        private String drugSerialNo;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getSupplierName() {
            return supplierName;
        }

        public void setSupplierName(String supplierName) {
            this.supplierName = supplierName;
        }

        public String getReportedLossNo() {
            return reportedLossNo;
        }

        public void setReportedLossNo(String reportedLossNo) {
            this.reportedLossNo = reportedLossNo;
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

        public String getManufacturerName() {
            return manufacturerName;
        }

        public void setManufacturerName(String manufacturerName) {
            this.manufacturerName = manufacturerName;
        }

        public String getSpecification() {
            return specification;
        }

        public void setSpecification(String specification) {
            this.specification = specification;
        }

        public int getPurchasePrice() {
            return purchasePrice;
        }

        public void setPurchasePrice(int purchasePrice) {
            this.purchasePrice = purchasePrice;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getTradeMark() {
            return tradeMark;
        }

        public void setTradeMark(String tradeMark) {
            this.tradeMark = tradeMark;
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
