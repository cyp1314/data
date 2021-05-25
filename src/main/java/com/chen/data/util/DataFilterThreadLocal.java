package com.chen.data.util;

import com.chen.data.config.DataFilterMetaData;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DataFilterThreadLocal {
    private static final ThreadLocal<DataFilterMetaData> ThreadLocalDataFilter = new ThreadLocal<DataFilterMetaData>();
    public static void clear() {
        ThreadLocalDataFilter.remove();
    }
    public static void set(DataFilterMetaData metaData) {
        ThreadLocalDataFilter.set(metaData);
    }
    public static DataFilterMetaData get() {
        return ThreadLocalDataFilter.get();
    }
}
