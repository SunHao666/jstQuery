package com.hao.jstquery.bean;

import java.util.List;

public class KCBean {


    /**
     * totalRow : 19
     * pageNumber : 1
     * firstPage : true
     * lastPage : true
     * totalPage : 1
     * pageSize : 20
     * list : [{"inStorageGroundingAmount":0,"innName":"测试货品3","inStorageNotGroundingAmount":1,"specification":"7","inUnit":"支","tradeMark":"s上海浦东金环医疗用品股份有限公司","tradeName":"测试货品3","tempcolumn":0,"manufactoryName":"上海浦东金环医疗用品股份有限公司","outStorageAmount":0,"supplyerName":"北京天士力医药有限公司","temprownumber":1,"drugSerialNo":"YPJBXX008824","batchNumber":"21e21e"}]
     */

    private int totalRow;
    private int pageNumber;
    private boolean firstPage;
    private boolean lastPage;
    private int totalPage;
    private int pageSize;
    private List<KCListBean> list;

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

    public List<KCListBean> getList() {
        return list;
    }

    public void setList(List<KCListBean> list) {
        this.list = list;
    }

    public static class KCListBean {
        /**
         * inStorageGroundingAmount : 0
         * innName : 测试货品3
         * inStorageNotGroundingAmount : 1
         * specification : 7
         * inUnit : 支
         * tradeMark : s上海浦东金环医疗用品股份有限公司
         * tradeName : 测试货品3
         * tempcolumn : 0
         * manufactoryName : 上海浦东金环医疗用品股份有限公司
         * outStorageAmount : 0
         * supplyerName : 北京天士力医药有限公司
         * temprownumber : 1
         * drugSerialNo : YPJBXX008824
         * batchNumber : 21e21e
         */

        private int inStorageGroundingAmount;
        private String innName;
        private int inStorageNotGroundingAmount;
        private String specification;
        private String inUnit;
        private String tradeMark;
        private String tradeName;
        private int tempcolumn;
        private String manufactoryName;
        private int outStorageAmount;
        private String supplyerName;
        private int temprownumber;
        private String drugSerialNo;
        private String batchNumber;

        public int getInStorageGroundingAmount() {
            return inStorageGroundingAmount;
        }

        public void setInStorageGroundingAmount(int inStorageGroundingAmount) {
            this.inStorageGroundingAmount = inStorageGroundingAmount;
        }

        public String getInnName() {
            return innName;
        }

        public void setInnName(String innName) {
            this.innName = innName;
        }

        public int getInStorageNotGroundingAmount() {
            return inStorageNotGroundingAmount;
        }

        public void setInStorageNotGroundingAmount(int inStorageNotGroundingAmount) {
            this.inStorageNotGroundingAmount = inStorageNotGroundingAmount;
        }

        public String getSpecification() {
            return specification;
        }

        public void setSpecification(String specification) {
            this.specification = specification;
        }

        public String getInUnit() {
            return inUnit;
        }

        public void setInUnit(String inUnit) {
            this.inUnit = inUnit;
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

        public String getManufactoryName() {
            return manufactoryName;
        }

        public void setManufactoryName(String manufactoryName) {
            this.manufactoryName = manufactoryName;
        }

        public int getOutStorageAmount() {
            return outStorageAmount;
        }

        public void setOutStorageAmount(int outStorageAmount) {
            this.outStorageAmount = outStorageAmount;
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

        public String getDrugSerialNo() {
            return drugSerialNo;
        }

        public void setDrugSerialNo(String drugSerialNo) {
            this.drugSerialNo = drugSerialNo;
        }

        public String getBatchNumber() {
            return batchNumber;
        }

        public void setBatchNumber(String batchNumber) {
            this.batchNumber = batchNumber;
        }
    }
}
