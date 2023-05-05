package com.example.springboot_swagger.controller;

import com.example.springboot_swagger.entity.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {
    @GetMapping()
    @Operation(
            description = "Get Users Service",
            responses = {
                    @ApiResponse(responseCode = "400",ref = "badRequest"),
                    @ApiResponse(responseCode = "500",ref = "internalServerError"),
                    @ApiResponse(responseCode = "200",ref = "successfulResponse")
            }
    )
    public List<User> getUsers() {
        return User.dummyUsers();
    }
}
