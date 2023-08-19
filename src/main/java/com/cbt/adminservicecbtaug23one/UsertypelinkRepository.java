package com.cbt.adminservicecbtaug23one;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsertypelinkRepository extends JpaRepository<Usertypelink, String> {
    List<Usertypelink> findByType(String type);
}