package com.hao.jstquery.bean;

import java.util.List;

public class TKBean {


    /**
     * totalRow : 9
     * pageNumber : 1
     * firstPage : true
     * lastPage : true
     * totalPage : 1
     * pageSize : 20
     * list : [{"date":"2019-11-14 11:46:38","innName":"测试货品11","amount":1,"batchNo":"432432","groundingStatus":"TRUE","specification":"11","returnStorageNo":"GKTKD0000000009","tradeMark":"江苏省长丰医疗实业有限公司","productDate":"2019-11-01 00:00:00","returnUserName":"管理员","tradeName":"测试货品11","effDate":"2019-11-30 00:00:00","tempcolumn":0,"manufactoryName":"江苏省长丰医疗实业有限公司","rfid":"0001290259841864","supplyerName":"北京天士力医药有限公司","temprownumber":1}]
     */

    private int totalRow;
    private int pageNumber;
    private boolean firstPage;
    private boolean lastPage;
    private int totalPage;
    private int pageSize;
    private List<TKListBean> list;

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

    public List<TKListBean> getList() {
        return list;
    }

    public void setList(List<TKListBean> list) {
        this.list = list;
    }

    public static class TKListBean {
        /**
         * date : 2019-11-14 11:46:38
         * innName : 测试货品11
         * amount : 1
         * batchNo : 432432
         * groundingStatus : TRUE
         * specification : 11
         * returnStorageNo : GKTKD0000000009
         * tradeMark : 江苏省长丰医疗实业有限公司
         * productDate : 2019-11-01 00:00:00
         * returnUserName : 管理员
         * tradeName : 测试货品11
         * effDate : 2019-11-30 00:00:00
         * tempcolumn : 0
         * manufactoryName : 江苏省长丰医疗实业有限公司
         * rfid : 0001290259841864
         * supplyerName : 北京天士力医药有限公司
         * temprownumber : 1
         */

        private String date;
        private String innName;
        private int amount;
        private String batchNo;
        private String groundingStatus;
        private String specification;
        private String returnStorageNo;
        private String tradeMark;
        private String productDate;
        private String returnUserName;
        private String tradeName;
        private String effDate;
        private int tempcolumn;
        private String manufactoryName;
        private String rfid;
        private String supplyerName;
        private int temprownumber;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getInnName() {
            return innName;
        }

        public void setInnName(String innName) {
            this.innName = innName;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public String getBatchNo() {
            return batchNo;
        }

        public void setBatchNo(String batchNo) {
            this.batchNo = batchNo;
        }

        public String getGroundingStatus() {
            return groundingStatus;
        }

        public void setGroundingStatus(String groundingStatus) {
            this.groundingStatus = groundingStatus;
        }

        public String getSpecification() {
            return specification;
        }

        public void setSpecification(String specification) {
            this.specification = specification;
        }

        public String getReturnStorageNo() {
            return returnStorageNo;
        }

        public void setReturnStorageNo(String returnStorageNo) {
            this.returnStorageNo = returnStorageNo;
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

        public String getReturnUserName() {
            return returnUserName;
        }

        public void setReturnUserName(String returnUserName) {
            this.returnUserName = returnUserName;
        }

        public String getTradeName() {
            return tradeName;
        }

        public void setTradeName(String tradeName) {
            this.tradeName = tradeName;
        }

        public String getEffDate() {
            return effDate;
        }

        public void setEffDate(String effDate) {
            this.effDate = effDate;
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

        public String getRfid() {
            return rfid;
        }

        public void setRfid(String rfid) {
            this.rfid = rfid;
        }

        public String getSupplyerName() {
            return supplyerName;
        }

        public void setSupplyerName(String supplyerName) {
            this.supplyerName = supplyerName;
        }

        public int getTemprownumber() {
            return temprownumber;
        }

        public void setTemprownumber(int temprownumber) {
            this.temprownumber = temprownumber;
        }
    }
}
