package com.hao.jstquery.bean;

import java.util.List;

public class THBean {


    /**
     * totalRow : 3
     * pageNumber : 1
     * firstPage : true
     * lastPage : true
     * totalPage : 1
     * pageSize : 20
     * list : [{"supplierName":"北京天士力医药有限公司","date":"2019-11-14 11:58:14","innName":"测试货品1","batchNo":"213432","returnSupplierNo":"GKTHD0000000002","manufacturerName":"美国 Devicor Medical Products,inc.","specification":"5","purchasePrice":10000,"tradeMark":"美国DevicorMedicalProducts,inc.","supplierUser":null,"tradeName":"测试货品1","tempcolumn":0,"articalNumber":"","rfid":"0001291161300557","temprownumber":1,"drugSerialNo":"YPJBXX008822"}]
     */

    private int totalRow;
    private int pageNumber;
    private boolean firstPage;
    private boolean lastPage;
    private int totalPage;
    private int pageSize;
    private List<THListBean> list;

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

    public List<THListBean> getList() {
        return list;
    }

    public void setList(List<THListBean> list) {
        this.list = list;
    }

    public static class THListBean {
        /**
         * supplierName : 北京天士力医药有限公司
         * date : 2019-11-14 11:58:14
         * innName : 测试货品1
         * batchNo : 213432
         * returnSupplierNo : GKTHD0000000002
         * manufacturerName : 美国 Devicor Medical Products,inc.
         * specification : 5
         * purchasePrice : 10000
         * tradeMark : 美国DevicorMedicalProducts,inc.
         * supplierUser : null
         * tradeName : 测试货品1
         * tempcolumn : 0
         * articalNumber :
         * rfid : 0001291161300557
         * temprownumber : 1
         * drugSerialNo : YPJBXX008822
         */

        private String supplierName;
        private String date;
        private String innName;
        private String batchNo;
        private String returnSupplierNo;
        private String manufacturerName;
        private String specification;
        private int purchasePrice;
        private String tradeMark;
        private String supplierUser;
        private String tradeName;
        private int tempcolumn;
        private String articalNumber;
        private String rfid;
        private int temprownumber;
        private String drugSerialNo;

        public String getSupplierName() {
            return supplierName;
        }

        public void setSupplierName(String supplierName) {
            this.supplierName = supplierName;
        }

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

        public String getBatchNo() {
            return batchNo;
        }

        public void setBatchNo(String batchNo) {
            this.batchNo = batchNo;
        }

        public String getReturnSupplierNo() {
            return returnSupplierNo;
        }

        public void setReturnSupplierNo(String returnSupplierNo) {
            this.returnSupplierNo = returnSupplierNo;
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

        public String getTradeMark() {
            return tradeMark;
        }

        public void setTradeMark(String tradeMark) {
            this.tradeMark = tradeMark;
        }

        public String getSupplierUser() {
            return supplierUser;
        }

        public void setSupplierUser(String supplierUser) {
            this.supplierUser = supplierUser;
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
