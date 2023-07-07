package com.polaris.lesscode.gotable.internal.enums;

public enum TableType {
    NORMAL(0),
    ISSUE_SUMMERY(1),
    CRM_SUMMERY(2)
    ;
    private Integer type;

    TableType(Integer t) {
        type = t;
    }

    public Integer getType() {
        return type;
    }
}
