package com.login.test.controller;

import com.login.test.config.APIRoutes;
import com.login.test.service.ILoginService;
import com.login.test.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 *
 * @author willi
 */

@Controller
@RequestMapping(APIRoutes.RestAPI.USERS_V1)
public class UserController {
    
    @Autowired
    private IService service;
    
    @Autowired
    private ILoginService login;
    
    
}
