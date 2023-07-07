package com.polaris.lesscode.gotable.internal.req;

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
public class CreateSummeryTableRequest {
    Long appId;
    @ApiModelProperty("表头配置列表，汇总表是由极星传入，在组织初始化的时候")
    List<FieldParam> columns;
}
