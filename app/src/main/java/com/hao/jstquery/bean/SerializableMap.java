package com.hao.jstquery.bean;

import java.io.Serializable;
import java.util.Map;

/**
 *序列化map供Bundle传递map使用
 */
@SuppressWarnings("serial")
public class SerializableMap implements Serializable {
    private Map<String, Object> map;

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }
}