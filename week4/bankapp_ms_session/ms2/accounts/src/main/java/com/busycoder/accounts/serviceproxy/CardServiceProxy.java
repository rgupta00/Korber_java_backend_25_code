package com.busycoder.accounts.serviceproxy;

import com.busycoder.accounts.dto.CardDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient(name = "card-service", url = "http://localhost:9090")
public interface CardServiceProxy {
    @GetMapping(path = "api/fetch")
    public CardDto findByMobileNumber(@RequestParam(name="mobile") String mobile);
}
