package com.bankapp.controller;

import com.bankapp.config.SecUser;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HelloController {


    @GetMapping("home")
    public String home() {
        return "Hello home";
    }
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping("admin")
    public String admin(@AuthenticationPrincipal SecUser secUser) {
        System.out.println(secUser.getUsername());
        System.out.println(secUser.getAuthorities());
        System.out.println(secUser.getPassword());
        return "Hello admin";
    }
    @PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_MGR')")
    @GetMapping("mgr")
    public String mgr() {
        return "Hello mgr";
    }
    @PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_MGR') or hasAuthority('ROLE_CLERK')")
    @GetMapping("clerk")
    public String clerk() {
        return "Hello clerk";
    }
}
