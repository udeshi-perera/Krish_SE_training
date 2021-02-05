package com.menu.menuservice.controller;

import com.menu.menuservice.service.MenuService;
import commonproject.model.customer.Customer;
import commonproject.model.menu.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MenuController {

    @Autowired
    MenuService menuService;

    @RequestMapping(value = "/menu", method = RequestMethod.POST)
    public Menu save(@RequestBody Menu menu) {
        return menuService.save(menu);
    }

    @RequestMapping(value = "/menu", method = RequestMethod.PUT)
    public ResponseEntity<Menu> update(@RequestBody Menu menu) {
        Menu updateMenu = menuService.update(menu);
        return ResponseEntity.ok().body(updateMenu);
    }

    @RequestMapping(value = "/menu",method = RequestMethod.GET)
    public Menu viewByMenuCode(@RequestParam(value = "code")String code){
        return menuService.findMenuByFoodCode(code);
    }



}
