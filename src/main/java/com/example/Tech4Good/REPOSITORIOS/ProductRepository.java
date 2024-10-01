package com.example.Tech4Good.REPOSITORIOS;

import com.example.Tech4Good.MODELOS.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository <Product, Long> {
}
