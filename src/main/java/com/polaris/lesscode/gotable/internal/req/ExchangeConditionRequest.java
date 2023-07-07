package com.polaris.lesscode.gotable.internal.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExchangeConditionRequest {
    Long tableId;
    String condition;
}
