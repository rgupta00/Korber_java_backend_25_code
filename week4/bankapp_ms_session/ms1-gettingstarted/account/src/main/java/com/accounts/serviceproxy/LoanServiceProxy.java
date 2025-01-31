package com.accounts.serviceproxy;

import com.accounts.dto.LoanDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "loans", url = "http://localhost:8090")
public interface LoanServiceProxy {
    @GetMapping("api/fetch")
    public LoanDto getByMobile(@RequestParam(name="mobile") String mobile);
}
