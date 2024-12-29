package com.devsuperior.dsclient.repositories;

import com.devsuperior.dsclient.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
