package com.polaris.lesscode.gotable.internal.resp;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 读取表头
 *
 */
@ApiModel("读取表头(由table服务返回)")
@Data
@NoArgsConstructor
public class ReadTableSchemasResp {
    List<TableSchemas> tables;
}
