package com.example.training_system.util;


import com.example.training_system.util.impl.JacksonUtil;

public interface JsonUtil {
    /**
     * 对象序列化为json
     * @param obj
     * @return
     */
    String assemble(Object obj);

    /**
     * json反序列化为对象
     * @param json
     * @param clazz
     * @return
     * @param <T>
     */
    <T> T analysis(String json, Class<T> clazz);


    /**
     * 获取工具类
     * @return
     */
    static JsonUtil get() {
        return new JacksonUtil();
    }
}
