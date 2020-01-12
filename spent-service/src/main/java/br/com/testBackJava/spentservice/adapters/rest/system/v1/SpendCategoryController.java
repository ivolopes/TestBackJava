package br.com.testBackJava.spentservice.adapters.rest.system.v1;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/spendCategory",
        produces = MediaType.APPLICATION_JSON_VALUE,
        consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_OCTET_STREAM_VALUE
        })
public class SpendCategoryController {

    @GetMapping
    public ResponseEntity<String> listaingByName(){
        return ResponseEntity.ok().body("Teste Listing by Name");
    }

}
