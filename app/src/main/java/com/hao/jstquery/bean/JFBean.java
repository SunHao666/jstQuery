package com.hao.jstquery.bean;

import java.util.List;

public class JFBean {


    /**
     * totalRow : 2
     * pageNumber : 1
     * firstPage : true
     * lastPage : true
     * totalPage : 1
     * pageSize : 20
     * list : [{"date":"2019-11-15 14:18:03","supplierName":"北京天士力医药有限公司","patientName":"ljj","innName":"测试货品11","batchNo":"34234","manufacturerName":"江苏省长丰医疗实业有限公司","specification":"11","spdBizDeptName":"创七病区(新街口)","manufacturerCode":"MANU000024","supplierCode":"GYS000100","purchasePrice":100000,"userName":"管理员","tradeMark":"江苏省长丰医疗实业有限公司","admNo":"123","cancelFlag":"1","tradeName":"测试货品11","tempcolumn":0,"usePageNo":"GKJFD0000000001","rfid":"0001290691576261","temprownumber":1,"drugSerialNo":"YPJBXX008827"}]
     */

    private int totalRow;
    private int pageNumber;
    private boolean firstPage;
    private boolean lastPage;
    private int totalPage;
    private int pageSize;
    private List<JFListBean> list;

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

    public List<JFListBean> getList() {
        return list;
    }

    public void setList(List<JFListBean> list) {
        this.list = list;
    }

    public static class JFListBean {
        /**
         * date : 2019-11-15 14:18:03
         * supplierName : 北京天士力医药有限公司
         * patientName : ljj
         * innName : 测试货品11
         * batchNo : 34234
         * manufacturerName : 江苏省长丰医疗实业有限公司
         * specification : 11
         * spdBizDeptName : 创七病区(新街口)
         * manufacturerCode : MANU000024
         * supplierCode : GYS000100
         * purchasePrice : 100000
         * userName : 管理员
         * tradeMark : 江苏省长丰医疗实业有限公司
         * admNo : 123
         * cancelFlag : 1
         * tradeName : 测试货品11
         * tempcolumn : 0
         * usePageNo : GKJFD0000000001
         * rfid : 0001290691576261
         * temprownumber : 1
         * drugSerialNo : YPJBXX008827
         */

        private String date;
        private String supplierName;
        private String patientName;
        private String innName;
        private String batchNo;
        private String manufacturerName;
        private String specification;
        private String spdBizDeptName;
        private String manufacturerCode;
        private String supplierCode;
        private int purchasePrice;
        private String userName;
        private String tradeMark;
        private String admNo;
        private String cancelFlag;
        private String tradeName;
        private int tempcolumn;
        private String usePageNo;
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

        public String getPatientName() {
            return patientName;
        }

        public void setPatientName(String patientName) {
            this.patientName = patientName;
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

        public String getSpdBizDeptName() {
            return spdBizDeptName;
        }

        public void setSpdBizDeptName(String spdBizDeptName) {
            this.spdBizDeptName = spdBizDeptName;
        }

        public String getManufacturerCode() {
            return manufacturerCode;
        }

        public void setManufacturerCode(String manufacturerCode) {
            this.manufacturerCode = manufacturerCode;
        }

        public String getSupplierCode() {
            return supplierCode;
        }

        public void setSupplierCode(String supplierCode) {
            this.supplierCode = supplierCode;
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

        public String getAdmNo() {
            return admNo;
        }

        public void setAdmNo(String admNo) {
            this.admNo = admNo;
        }

        public String getCancelFlag() {
            return cancelFlag;
        }

        public void setCancelFlag(String cancelFlag) {
            this.cancelFlag = cancelFlag;
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

        public String getUsePageNo() {
            return usePageNo;
        }

        public void setUsePageNo(String usePageNo) {
            this.usePageNo = usePageNo;
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
