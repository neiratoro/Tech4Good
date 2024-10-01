package com.example.Tech4Good.SERVICIOS;

import com.example.Tech4Good.MODELOS.BeneficiaryOrganization;
import com.example.Tech4Good.REPOSITORIOS.BeneficiaryOrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeneficiaryOrganizationImplementation implements BeneficiaryOrganizationService{

    @Autowired
    private BeneficiaryOrganizationRepository beneficiaryOrganizationRepository;

    @Override
    public List<BeneficiaryOrganization> getAllBeneficiaryOrganizations() {
        return beneficiaryOrganizationRepository.findAll();
    }
}
