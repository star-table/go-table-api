package com.polaris.lesscode.gotable.internal.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.polaris.lesscode.form.internal.sula.FieldParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateTableRequest {
    @ApiModelProperty("appId")
    Long appId;
    @ApiModelProperty("表名")
    String name;
    @ApiModelProperty("基础字段，用于创建的时候从组织的基本字段里面捞")
    List<String> basicColumns;

    List<String> notNeedSummeryColumnIds;

    @ApiModelProperty("是否建立存储表，因为很多app其实并不需要存储数据，只需要表头")
    @JsonProperty(value = "isNeedStoreTable")
    boolean isNeedStoreTable;
    @JsonProperty(value = "isNeedColumn")
    boolean isNeedColumn;

    Integer appType;

    @ApiModelProperty("表头配置列表，汇总表是由极星传入，在组织初始化的时候")
    List<FieldParam> columns;
}
