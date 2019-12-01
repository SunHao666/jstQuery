package com.hao.jstquery.bean;

import java.util.List;

public class ZSInfo {

    /**
     * totalRow : 2
     * pageNumber : 1
     * firstPage : true
     * lastPage : true
     * totalPage : 1
     * pageSize : 20
     * list : [{"regNo":"12321323","inStorageNo":"GKRKD0000000036","innName":"测试货品11","inStorageDate":"2019-11-14 11:19:13","manufacturerName":"江苏省长丰医疗实业有限公司","purchasePrice":100000,"supplierCode":"GYS000100","chargeNo":"GKJFD0000000001","admNo":"123","cancelFlag":"1","tradeName":"测试货品11","effDate":"2019-11-30 00:00:00","firstCode":"F2F24F42F","deliveryDate":"2019-11-14 00:00:00","supplierName":"北京天士力医药有限公司","surgicalOperation":"测试手术名称","patientName":"ljj","batchNo":"34234","deliveryNo":"GKPSD000037","specification":"11","manufacturerCode":"MANU000024","spdBizDeptName":"创七病区(新街口)","userName":"管理员","productDate":"2019-11-01 00:00:00","tempcolumn":0,"articalNumber":"","rfid":"0001290691576261","secondCode":"G3G3G","chargeDate":"2019-11-15 14:18:03","temprownumber":1,"drugSerialNo":"YPJBXX008827"}]
     */

    private int totalRow;
    private int pageNumber;
    private boolean firstPage;
    private boolean lastPage;
    private int totalPage;
    private int pageSize;
    private List<ZSListBean> list;

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

    public List<ZSListBean> getList() {
        return list;
    }

    public void setList(List<ZSListBean> list) {
        this.list = list;
    }

    public static class ZSListBean {
        /**
         * regNo : 12321323
         * inStorageNo : GKRKD0000000036
         * innName : 测试货品11
         * inStorageDate : 2019-11-14 11:19:13
         * manufacturerName : 江苏省长丰医疗实业有限公司
         * purchasePrice : 100000
         * supplierCode : GYS000100
         * chargeNo : GKJFD0000000001
         * admNo : 123
         * cancelFlag : 1
         * tradeName : 测试货品11
         * effDate : 2019-11-30 00:00:00
         * firstCode : F2F24F42F
         * deliveryDate : 2019-11-14 00:00:00
         * supplierName : 北京天士力医药有限公司
         * surgicalOperation : 测试手术名称
         * patientName : ljj
         * batchNo : 34234
         * deliveryNo : GKPSD000037
         * specification : 11
         * manufacturerCode : MANU000024
         * spdBizDeptName : 创七病区(新街口)
         * userName : 管理员
         * productDate : 2019-11-01 00:00:00
         * tempcolumn : 0
         * articalNumber :
         * rfid : 0001290691576261
         * secondCode : G3G3G
         * chargeDate : 2019-11-15 14:18:03
         * temprownumber : 1
         * drugSerialNo : YPJBXX008827
         */

        private String regNo;
        private String inStorageNo;
        private String innName;
        private String inStorageDate;
        private String manufacturerName;
        private int purchasePrice;
        private String supplierCode;
        private String chargeNo;
        private String admNo;
        private String cancelFlag;
        private String tradeName;
        private String effDate;
        private String firstCode;
        private String deliveryDate;
        private String supplierName;
        private String surgicalOperation;
        private String patientName;
        private String batchNo;
        private String deliveryNo;
        private String specification;
        private String manufacturerCode;
        private String spdBizDeptName;
        private String userName;
        private String productDate;
        private int tempcolumn;
        private String articalNumber;
        private String rfid;
        private String secondCode;
        private String chargeDate;
        private int temprownumber;
        private String drugSerialNo;

        public String getRegNo() {
            return regNo;
        }

        public void setRegNo(String regNo) {
            this.regNo = regNo;
        }

        public String getInStorageNo() {
            return inStorageNo;
        }

        public void setInStorageNo(String inStorageNo) {
            this.inStorageNo = inStorageNo;
        }

        public String getInnName() {
            return innName;
        }

        public void setInnName(String innName) {
            this.innName = innName;
        }

        public String getInStorageDate() {
            return inStorageDate;
        }

        public void setInStorageDate(String inStorageDate) {
            this.inStorageDate = inStorageDate;
        }

        public String getManufacturerName() {
            return manufacturerName;
        }

        public void setManufacturerName(String manufacturerName) {
            this.manufacturerName = manufacturerName;
        }

        public int getPurchasePrice() {
            return purchasePrice;
        }

        public void setPurchasePrice(int purchasePrice) {
            this.purchasePrice = purchasePrice;
        }

        public String getSupplierCode() {
            return supplierCode;
        }

        public void setSupplierCode(String supplierCode) {
            this.supplierCode = supplierCode;
        }

        public String getChargeNo() {
            return chargeNo;
        }

        public void setChargeNo(String chargeNo) {
            this.chargeNo = chargeNo;
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

        public String getEffDate() {
            return effDate;
        }

        public void setEffDate(String effDate) {
            this.effDate = effDate;
        }

        public String getFirstCode() {
            return firstCode;
        }

        public void setFirstCode(String firstCode) {
            this.firstCode = firstCode;
        }

        public String getDeliveryDate() {
            return deliveryDate;
        }

        public void setDeliveryDate(String deliveryDate) {
            this.deliveryDate = deliveryDate;
        }

        public String getSupplierName() {
            return supplierName;
        }

        public void setSupplierName(String supplierName) {
            this.supplierName = supplierName;
        }

        public String getSurgicalOperation() {
            return surgicalOperation;
        }

        public void setSurgicalOperation(String surgicalOperation) {
            this.surgicalOperation = surgicalOperation;
        }

        public String getPatientName() {
            return patientName;
        }

        public void setPatientName(String patientName) {
            this.patientName = patientName;
        }

        public String getBatchNo() {
            return batchNo;
        }

        public void setBatchNo(String batchNo) {
            this.batchNo = batchNo;
        }

        public String getDeliveryNo() {
            return deliveryNo;
        }

        public void setDeliveryNo(String deliveryNo) {
            this.deliveryNo = deliveryNo;
        }

        public String getSpecification() {
            return specification;
        }

        public void setSpecification(String specification) {
            this.specification = specification;
        }

        public String getManufacturerCode() {
            return manufacturerCode;
        }

        public void setManufacturerCode(String manufacturerCode) {
            this.manufacturerCode = manufacturerCode;
        }

        public String getSpdBizDeptName() {
            return spdBizDeptName;
        }

        public void setSpdBizDeptName(String spdBizDeptName) {
            this.spdBizDeptName = spdBizDeptName;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getProductDate() {
            return productDate;
        }

        public void setProductDate(String productDate) {
            this.productDate = productDate;
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

        public String getSecondCode() {
            return secondCode;
        }

        public void setSecondCode(String secondCode) {
            this.secondCode = secondCode;
        }

        public String getChargeDate() {
            return chargeDate;
        }

        public void setChargeDate(String chargeDate) {
            this.chargeDate = chargeDate;
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
