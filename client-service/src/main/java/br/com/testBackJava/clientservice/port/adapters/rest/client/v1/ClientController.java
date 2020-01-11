package br.com.testBackJava.clientservice.port.adapters.rest.client.v1;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/client",
        produces = MediaType.APPLICATION_JSON_VALUE,
        consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_OCTET_STREAM_VALUE
        })
public class ClientController {

        @GetMapping
        public ResponseEntity<String> clientValidation(){
                return ResponseEntity.ok().body("Teste Client Validation");
        }

}
