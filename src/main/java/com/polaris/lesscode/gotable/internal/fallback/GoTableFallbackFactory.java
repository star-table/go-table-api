/**
 *
 */
package com.polaris.lesscode.gotable.internal.fallback;

import com.polaris.lesscode.consts.ApplicationConsts;
import com.polaris.lesscode.feign.AbstractBaseFallback;
import com.polaris.lesscode.gotable.internal.api.GoTableApi;
import com.polaris.lesscode.gotable.internal.req.*;
import com.polaris.lesscode.gotable.internal.resp.*;
import com.polaris.lesscode.vo.Result;
import feign.HeaderMap;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;

/**
 * @author admin
 *
 */
@Component
public class GoTableFallbackFactory extends AbstractBaseFallback implements FallbackFactory<GoTableApi> {

    @Override
    public GoTableApi create(Throwable cause) {
        return new GoTableApi() {
            @Override
            public ReadTableSchemasResp readSchemas(@RequestBody() ReadTableSchemasRequest req,
                  @RequestHeader(name = "X-MD-ORGID") String orgId,
                  @RequestHeader(name = "X-MD-USERID") String userId) {
                return wrappDeal( "go-table.http", cause, () -> {
                    return new ReadTableSchemasResp();
                });
            }

            @Override
            public ReadTableSchemasByAppIdResp readSchemasByAppId(@RequestBody() ReadTableSchemasByAppIdRequest req,
                                                    @RequestHeader(name = "X-MD-ORGID") String orgId,
                                                    @RequestHeader(name = "X-MD-USERID") String userId) {
                return wrappDeal( "go-table.http", cause, () -> {
                    return new ReadTableSchemasByAppIdResp();
                });
            }

            @Override
            public  CreateTableResp create(@RequestBody() CreateTableRequest req,
                                           @RequestHeader(name = "X-MD-ORGID") String orgId,
                                           @RequestHeader(name = "X-MD-USERID") String userId) {
                return wrappDeal( "go-table.http", cause, () -> {
                    return new CreateTableResp();
                });
            }

            @Override
            public  CreateSummeryTableResp createSummery(@RequestBody() CreateSummeryTableRequest req,
                                                         @RequestHeader(name = "X-MD-ORGID") String orgId,
                                                         @RequestHeader(name = "X-MD-USERID") String userId) {
                return wrappDeal("go-table.http", cause, () -> {
                    return new CreateSummeryTableResp();
                });
            }

            @Override
            public  CreateMultiSummeryTableResp createMultiSummery(@RequestBody() CreateMultiSummeryTableRequest req,
                                                         @RequestHeader(name = "X-MD-ORGID") String orgId,
                                                         @RequestHeader(name = "X-MD-USERID") String userId) {
                return wrappDeal("go-table.http", cause, () -> {
                    return new CreateMultiSummeryTableResp();
                });
            }

            @Override
            public  CopyTablesResp copyTables(@RequestBody() CopyTablesRequest req,
                                              @RequestHeader(name = "X-MD-ORGID") String orgId,
                                              @RequestHeader(name = "X-MD-USERID") String userId) {
                return wrappDeal("go-table.http", cause, () -> {
                    return new CopyTablesResp();
                });
            }

            @Override
            public  ReadTablesResp readTables(@RequestBody() ReadTablesRequest req,
                                              @RequestHeader(name = "X-MD-ORGID") String orgId,
                                              @RequestHeader(name = "X-MD-USERID") String userId) {
                return wrappDeal("go-table.http", cause, () -> {
                    return new ReadTablesResp();
                });
            }

            @Override
            public ReadTableResp readTable(@RequestBody() ReadTableRequest req,
                                              @RequestHeader(name = "X-MD-ORGID") String orgId,
                                              @RequestHeader(name = "X-MD-USERID") String userId) {
                return wrappDeal("go-table.http", cause, () -> {
                    return new ReadTableResp();
                });
            }

            @Override
            public ReadSummeryTableIdResp readSummeryTableId(@RequestBody() ReadSummeryTableIdRequest req,
                                                                 @RequestHeader(name = "X-MD-ORGID") String orgId,
                                                                 @RequestHeader(name = "X-MD-USERID") String userId) {
                return wrappDeal("go-table.http", cause, () -> {
                    return new ReadSummeryTableIdResp();
                });
            }

            @Override
            public ExchangeConditionResp exchangeCondition(@RequestBody() ExchangeConditionRequest req,
                                                             @RequestHeader(name = "X-MD-ORGID") String orgId,
                                                             @RequestHeader(name = "X-MD-USERID") String userId) {
                return wrappDeal("go-table.http", cause, () -> {
                    return new ExchangeConditionResp();
                });
            }
        };
    }

}
