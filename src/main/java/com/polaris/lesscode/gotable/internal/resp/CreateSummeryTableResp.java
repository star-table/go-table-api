package com.polaris.lesscode.gotable.internal.resp;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * 创建汇总表返回
 *
 */
@ApiModel("创建汇总表返回")
@Data
public class CreateSummeryTableResp {
    Long appId;
    Long tableId;
}
