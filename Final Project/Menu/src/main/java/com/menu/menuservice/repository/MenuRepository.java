package com.menu.menuservice.repository;

import commonproject.model.menu.Menu;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MenuRepository extends JpaRepository<Menu,Integer>  {

    Menu findByCode(String code);
}
