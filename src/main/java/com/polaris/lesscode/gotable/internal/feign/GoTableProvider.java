/**
 * 
 */
package com.polaris.lesscode.gotable.internal.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.polaris.lesscode.consts.ApplicationConsts;
import com.polaris.lesscode.gotable.internal.api.GoTableApi;
import com.polaris.lesscode.gotable.internal.fallback.GoTableFallbackFactory;

/**
 * @author Bomb.
 *
 */
@FeignClient(name = "go-table.http", fallbackFactory = GoTableFallbackFactory.class)
public interface GoTableProvider extends GoTableApi {

}
