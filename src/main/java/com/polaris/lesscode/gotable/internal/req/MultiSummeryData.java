package com.polaris.lesscode.gotable.internal.req;

import com.polaris.lesscode.form.internal.sula.FieldParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MultiSummeryData {
    Long appId;
    Integer tableType;
    List<FieldParam> columns;
}
