package com.polaris.lesscode.gotable.internal.resp;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.util.List;

/**
 */
@Data
public class TableSchemas {
    @ApiModelProperty("表id")
    Long tableId;

    @ApiModelProperty("表名字")
    String name;

    @ApiModelProperty("表头配置列表")
    List<JSONObject> columns;
}
