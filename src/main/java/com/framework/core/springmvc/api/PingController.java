package com.framework.core.springmvc.api;

import com.framework.core.springmvc.Constants;
import com.framework.core.springmvc.model.ResponseMessage;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = Constants.URI_API)
public class PingController{
   
    /**
     * check if the network connecting is ok.
     * @return 
     */
    @RequestMapping("/ping")
    public ResponseEntity<ResponseMessage> ping() {    
        return new ResponseEntity<>(ResponseMessage.info("connected"), HttpStatus.OK);
    }
    
}
