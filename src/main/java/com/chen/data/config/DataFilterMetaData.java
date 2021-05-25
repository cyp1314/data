package com.chen.data.config;

import com.chen.data.enums.DataFilterTypeEnum;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class DataFilterMetaData {

    public DataFilterTypeEnum filterType;

    private long userId;
    private long deptId;

    private Set<Long> deptIds;

    private String sql;

}
