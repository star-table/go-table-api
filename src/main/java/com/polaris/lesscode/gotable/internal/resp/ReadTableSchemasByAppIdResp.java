package com.polaris.lesscode.gotable.internal.resp;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;

/**
 * 根据appId读取表头记录
 *
 */
@ApiModel("根据appId读取表头记录")
@Data
public class ReadTableSchemasByAppIdResp {
    List<TableSchemas> tables;
}
