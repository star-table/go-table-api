package com.polaris.lesscode.gotable.internal.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 创建表
 *
 */
@ApiModel("创建表返回")
@Data
public class CreateTableResp {
    Long appId;
    @ApiModelProperty("表头数据")
    TableSchemas table;
}
