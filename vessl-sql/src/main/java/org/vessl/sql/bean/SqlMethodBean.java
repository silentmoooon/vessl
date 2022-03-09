package org.vessl.sql.bean;

import lombok.Data;
import lombok.ToString;
import org.vessl.sql.constant.MethodReturnMode;

@Data
@ToString
public class SqlMethodBean {
    private String name;
    private String type;
    private String sql;
    private MethodReturnMode returnMode;
}
