package com.dh.sm.users.newservice.rest;

import com.dh.sm.users.newservice.input.ContextCreateInput;
import com.dh.sm.users.newservice.model.Context;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;


/**
 * @author rveizaga
 */
@RestController
@RequestScope
@Validated
public class ContextCreateController {


    @PostMapping()
    public Context createContext(@RequestBody ContextCreateInput request) {
        throw  new UnsupportedOperationException("Implementation is pending");
    }
}