package com.hao.jstquery.bean;

import com.bin.david.form.annotation.SmartColumn;
import com.bin.david.form.annotation.SmartTable;

public class ZSBean {

    public String sub;
    public String value;

    public ZSBean(String sub, String value) {
        this.sub = sub;
        this.value = value;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
