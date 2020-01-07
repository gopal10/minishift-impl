package com.gopal.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason="Employee Already Exist")
public class EmployeeAlreadyExist extends Exception {

}
