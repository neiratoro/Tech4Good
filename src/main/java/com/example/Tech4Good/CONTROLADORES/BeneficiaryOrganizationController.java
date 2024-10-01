package com.example.Tech4Good.CONTROLADORES;

import com.example.Tech4Good.MODELOS.BeneficiaryOrganization;
import com.example.Tech4Good.SERVICIOS.BeneficiaryOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BeneficiaryOrganizationController {

    @Autowired
    private BeneficiaryOrganizationService beneficiaryOrganizationService;

    @GetMapping("/beneficiarios")
    public ResponseEntity<List<BeneficiaryOrganization>> getAllBeneficiaryOrganizations(){
        return new ResponseEntity<>(beneficiaryOrganizationService.getAllBeneficiaryOrganizations(), HttpStatus.OK);
    }

}
