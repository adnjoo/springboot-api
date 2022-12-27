package com.example.demo.repo;

import com.example.demo.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author drewpew
 * @version 1.0
 * @since 12/27/2022
 */
public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
}
