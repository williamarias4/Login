package com.login.test.controller;

import com.login.test.config.APIRoutes;
import com.login.test.dto.UserDto;
import com.login.test.service.ILoginService;
import com.login.test.service.IService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.modelmapper.ModelMapper;

/**
 *
 * @author willi
 */
@RestController
@RequestMapping(APIRoutes.API.USERS_V1)
public class UserController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private IService service;

    @Autowired
    private ILoginService login;

    @GetMapping(APIRoutes.RestAPI.GET_ALL)
    public List<UserDto> getAllUsers() {

        return (List<UserDto>) service.getAll().stream().map(user -> modelMapper
                .map(user, UserDto.class)).collect(Collectors.toList());
    }
}
