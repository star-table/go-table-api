package com.polaris.lesscode.gotable.internal.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CopyTablesRequest {
    Long srcAppId;
    List<Long> srcTableIds;
    Long dstAppId;
    Map<Long, Long> oldToNewPermission; //权限替换
}
