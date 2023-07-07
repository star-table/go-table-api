package com.polaris.lesscode.gotable.internal.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author roamer
 * @version v1.0
 * @date 2020-11-24 14:19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReadTableSchemasRequest {
    @ApiModelProperty("表ids")
    private List<Long> tableIds;

    @JsonProperty(value = "isNeedCommonColumn")
    boolean isNeedCommonColumn;

    @JsonProperty(value = "isNeedDescription")
    boolean isNeedDescription;
}
