package com.hao.jstquery.bean;

import java.util.List;

public class ZDBean {


    /**
     * resUrl : http://www.361web.net/jst/res/files/
     * code : 200
     * data : {"totalRow":14,"pageNumber":1,"firstPage":true,"lastPage":true,"totalPage":1,"pageSize":20,"list":[{"sort_inx":1,"file_path":"157511883675307226.pdf","create_time":"2019-11-30 21:00:23","id":5,"title":"北京积水潭医院医用耗材管理办法","content":null},{"sort_inx":2,"file_path":"157511889021565835.pdf","create_time":"2019-11-30 21:01:24","id":6,"title":"北京积水潭医院医用耗材管理委员会专家管理办法","content":null},{"sort_inx":3,"file_path":"157511918333898876.pdf","create_time":"2019-11-30 21:06:10","id":7,"title":"北京积水潭医院医用耗材管理委员会医用耗材遴选制度","content":null},{"sort_inx":4,"file_path":"157511921714632995.pdf","create_time":"2019-11-30 21:06:50","id":8,"title":"北京积水潭医院关于医用耗材论证会票决制的有关规定","content":null},{"sort_inx":5,"file_path":"157511927083104640.pdf","create_time":"2019-11-30 21:07:45","id":9,"title":"北京积水潭医院关于遴选医疗耗材的品牌有关规定","content":null},{"sort_inx":6,"file_path":"157511931654092048.pdf","create_time":"2019-11-30 21:08:21","id":10,"title":"北京积水潭医院医用耗材临时采购管理制度","content":null},{"sort_inx":7,"file_path":"157511933313235569.pdf","create_time":"2019-11-30 21:08:46","id":11,"title":"北京积水潭医院医用耗材议价原则","content":null},{"sort_inx":8,"file_path":"157511934171714846.pdf","create_time":"2019-11-30 21:08:55","id":12,"title":"北京积水潭医院医用耗材供应商管理规定","content":null},{"sort_inx":9,"file_path":"157511935958015107.pdf","create_time":"2019-11-30 21:09:13","id":13,"title":"北京积水潭医院医疗器械二级库管理制度","content":null},{"sort_inx":10,"file_path":"157511938749628429.pdf","create_time":"2019-11-30 21:09:30","id":14,"title":"北京积水潭医院医用耗材使用监测及评价管理制度","content":null},{"sort_inx":11,"file_path":"157511939449166691.pdf","create_time":"2019-11-30 21:09:50","id":15,"title":"北京积水潭医院物资供应管理系统权限管理制度","content":null},{"sort_inx":12,"file_path":"157511941663946845.pdf","create_time":"2019-11-30 21:10:08","id":16,"title":"北京积水潭医院医用耗材委员会委员廉洁自律规范","content":null},{"sort_inx":13,"file_path":"157511944363220109.pdf","create_time":"2019-11-30 21:10:28","id":17,"title":"北京积水潭医院医疗器械供应商代表管理制度","content":null},{"sort_inx":14,"file_path":"157511945199996626.pdf","create_time":"2019-11-30 21:10:46","id":18,"title":"北京积水潭医院医用耗材采购管理制度","content":null}]}
     * success : true
     * mess : 成功
     */

    private String resUrl;
    private int code;
    private DataBean data;
    private boolean success;
    private String mess;

    public String getResUrl() {
        return resUrl;
    }

    public void setResUrl(String resUrl) {
        this.resUrl = resUrl;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

    public static class DataBean {
        /**
         * totalRow : 14
         * pageNumber : 1
         * firstPage : true
         * lastPage : true
         * totalPage : 1
         * pageSize : 20
         * list : [{"sort_inx":1,"file_path":"157511883675307226.pdf","create_time":"2019-11-30 21:00:23","id":5,"title":"北京积水潭医院医用耗材管理办法","content":null},{"sort_inx":2,"file_path":"157511889021565835.pdf","create_time":"2019-11-30 21:01:24","id":6,"title":"北京积水潭医院医用耗材管理委员会专家管理办法","content":null},{"sort_inx":3,"file_path":"157511918333898876.pdf","create_time":"2019-11-30 21:06:10","id":7,"title":"北京积水潭医院医用耗材管理委员会医用耗材遴选制度","content":null},{"sort_inx":4,"file_path":"157511921714632995.pdf","create_time":"2019-11-30 21:06:50","id":8,"title":"北京积水潭医院关于医用耗材论证会票决制的有关规定","content":null},{"sort_inx":5,"file_path":"157511927083104640.pdf","create_time":"2019-11-30 21:07:45","id":9,"title":"北京积水潭医院关于遴选医疗耗材的品牌有关规定","content":null},{"sort_inx":6,"file_path":"157511931654092048.pdf","create_time":"2019-11-30 21:08:21","id":10,"title":"北京积水潭医院医用耗材临时采购管理制度","content":null},{"sort_inx":7,"file_path":"157511933313235569.pdf","create_time":"2019-11-30 21:08:46","id":11,"title":"北京积水潭医院医用耗材议价原则","content":null},{"sort_inx":8,"file_path":"157511934171714846.pdf","create_time":"2019-11-30 21:08:55","id":12,"title":"北京积水潭医院医用耗材供应商管理规定","content":null},{"sort_inx":9,"file_path":"157511935958015107.pdf","create_time":"2019-11-30 21:09:13","id":13,"title":"北京积水潭医院医疗器械二级库管理制度","content":null},{"sort_inx":10,"file_path":"157511938749628429.pdf","create_time":"2019-11-30 21:09:30","id":14,"title":"北京积水潭医院医用耗材使用监测及评价管理制度","content":null},{"sort_inx":11,"file_path":"157511939449166691.pdf","create_time":"2019-11-30 21:09:50","id":15,"title":"北京积水潭医院物资供应管理系统权限管理制度","content":null},{"sort_inx":12,"file_path":"157511941663946845.pdf","create_time":"2019-11-30 21:10:08","id":16,"title":"北京积水潭医院医用耗材委员会委员廉洁自律规范","content":null},{"sort_inx":13,"file_path":"157511944363220109.pdf","create_time":"2019-11-30 21:10:28","id":17,"title":"北京积水潭医院医疗器械供应商代表管理制度","content":null},{"sort_inx":14,"file_path":"157511945199996626.pdf","create_time":"2019-11-30 21:10:46","id":18,"title":"北京积水潭医院医用耗材采购管理制度","content":null}]
         */

        private int totalRow;
        private int pageNumber;
        private boolean firstPage;
        private boolean lastPage;
        private int totalPage;
        private int pageSize;
        private List<ZDListBean> list;

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

        public List<ZDListBean> getList() {
            return list;
        }

        public void setList(List<ZDListBean> list) {
            this.list = list;
        }

        public static class ZDListBean {
            /**
             * sort_inx : 1
             * file_path : 157511883675307226.pdf
             * create_time : 2019-11-30 21:00:23
             * id : 5
             * title : 北京积水潭医院医用耗材管理办法
             * content : null
             */

            private int sort_inx;
            private String file_path;
            private String create_time;
            private int id;
            private String title;
            private String content;

            public int getSort_inx() {
                return sort_inx;
            }

            public void setSort_inx(int sort_inx) {
                this.sort_inx = sort_inx;
            }

            public String getFile_path() {
                return file_path;
            }

            public void setFile_path(String file_path) {
                this.file_path = file_path;
            }

            public String getCreate_time() {
                return create_time;
            }

            public void setCreate_time(String create_time) {
                this.create_time = create_time;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }
        }
    }
}
