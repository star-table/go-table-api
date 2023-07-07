package com.polaris.lesscode.gotable.internal.api;

import com.polaris.lesscode.dc.internal.req.CreateTableReq;
import com.polaris.lesscode.gotable.internal.req.*;
import com.polaris.lesscode.gotable.internal.resp.*;
import feign.HeaderMap;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.polaris.lesscode.vo.Result;

import java.util.List;
import java.util.Map;

@RequestMapping("/inner/v1")
public interface GoTableApi {

    /**
     * code:
     * 0: 成功
     *
     * @param req
     * @return
     */
    @PostMapping(value = "/read/tableSchemas", consumes = MediaType.APPLICATION_JSON_VALUE)
    ReadTableSchemasResp readSchemas(@RequestBody() ReadTableSchemasRequest req,
                                             @RequestHeader(name = "X-MD-ORGID") String orgId,
                                             @RequestHeader(name = "X-MD-USERID") String userId);


    /**
     * code:
     * 0: 成功
     *
     * @param req
     * @return
     */
    @PostMapping(value = "/read/tableSchemasByAppId", consumes = MediaType.APPLICATION_JSON_VALUE)
    ReadTableSchemasByAppIdResp readSchemasByAppId(@RequestBody() ReadTableSchemasByAppIdRequest req,
                                     @RequestHeader(name = "X-MD-ORGID") String orgId,
                                     @RequestHeader(name = "X-MD-USERID") String userId);

    /**
     * code:
     * 0: 成功
     *
     * @param req
     * @return
     */
    @PostMapping(value = "/table/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    CreateTableResp create(@RequestBody() CreateTableRequest req,
                           @RequestHeader(name = "X-MD-ORGID") String orgId,
                           @RequestHeader(name = "X-MD-USERID") String userId);

    /**
     * code:
     * 0: 成功
     *
     * @param req
     * @return
     */
    @PostMapping(value = "/table/createSummery", consumes = MediaType.APPLICATION_JSON_VALUE)
    CreateSummeryTableResp createSummery(@RequestBody() CreateSummeryTableRequest req,
                                         @RequestHeader(name = "X-MD-ORGID") String orgId,
                                         @RequestHeader(name = "X-MD-USERID") String userId);

    /**
     * code:
     * 0: 成功
     *
     * @param req
     * @return
     */
    @PostMapping(value = "/table/createMultiSummery", consumes = MediaType.APPLICATION_JSON_VALUE)
    CreateMultiSummeryTableResp createMultiSummery(@RequestBody() CreateMultiSummeryTableRequest req,
                                         @RequestHeader(name = "X-MD-ORGID") String orgId,
                                         @RequestHeader(name = "X-MD-USERID") String userId);

    /**
     * code:
     * 0: 成功
     *
     * @param req
     * @return
     */
    @PostMapping(value = "/table/copy", consumes = MediaType.APPLICATION_JSON_VALUE)
    CopyTablesResp copyTables(@RequestBody() CopyTablesRequest req,
                                         @RequestHeader(name = "X-MD-ORGID") String orgId,
                                         @RequestHeader(name = "X-MD-USERID") String userId);
    /**
     * code:
     * 0: 成功
     *
     * @param req
     * @return
     */
    @PostMapping(value = "/read/tables", consumes = MediaType.APPLICATION_JSON_VALUE)
    ReadTablesResp readTables(@RequestBody() ReadTablesRequest req,
                              @RequestHeader(name = "X-MD-ORGID") String orgId,
                              @RequestHeader(name = "X-MD-USERID") String userId);

    /**
     * code:
     * 0: 成功
     *
     * @param req
     * @return
     */
    @PostMapping(value = "/read/table", consumes = MediaType.APPLICATION_JSON_VALUE)
    ReadTableResp readTable(@RequestBody() ReadTableRequest req,
                              @RequestHeader(name = "X-MD-ORGID") String orgId,
                              @RequestHeader(name = "X-MD-USERID") String userId);

    /**
     * code:
     * 0: 成功
     *
     * @param req
     * @return
     */
    @PostMapping(value = "/read/summeryTableId", consumes = MediaType.APPLICATION_JSON_VALUE)
    ReadSummeryTableIdResp readSummeryTableId(@RequestBody() ReadSummeryTableIdRequest req,
                              @RequestHeader(name = "X-MD-ORGID") String orgId,
                              @RequestHeader(name = "X-MD-USERID") String userId);

    @PostMapping(value = "/rows/exchangeCondition", consumes = MediaType.APPLICATION_JSON_VALUE)
    ExchangeConditionResp exchangeCondition(@RequestBody() ExchangeConditionRequest req,
                                                   @RequestHeader(name = "X-MD-ORGID") String orgId,
                                                   @RequestHeader(name = "X-MD-USERID") String userId);
}
