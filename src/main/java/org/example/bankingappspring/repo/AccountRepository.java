package org.example.bankingappspring.repo;

import org.example.bankingappspring.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}