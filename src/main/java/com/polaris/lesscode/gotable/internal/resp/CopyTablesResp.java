package com.polaris.lesscode.gotable.internal.resp;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class CopyTablesResp {
    Long appId;
    List<TableSchemas> tables;
    Map<Long, Long> oldToNewTableId;
}
