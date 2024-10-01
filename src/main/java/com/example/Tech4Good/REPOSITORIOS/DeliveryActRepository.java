package com.example.Tech4Good.REPOSITORIOS;

import com.example.Tech4Good.MODELOS.DeliveryAct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryActRepository extends JpaRepository <DeliveryAct, Long> {
}
