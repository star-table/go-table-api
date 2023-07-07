package com.polaris.lesscode.gotable.internal.resp;

import lombok.Data;

import java.util.List;

@Data
public class ReadTablesResp {
    Long appId;
    List<TableMeta> tables;
}
