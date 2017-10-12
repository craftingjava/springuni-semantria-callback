package com.springuni.springunisemantriacallback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lcsontos on 10/12/17.
 */
@RestController
public class SemantriaCallbackController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SemantriaCallbackController.class);

    @PostMapping("/callback.json")
    public void handleCallback(@RequestBody String body, @RequestHeader HttpHeaders headers) {
        LOGGER.info("Received callback; body: {}, headers: {}.", body, headers);
    }

}
