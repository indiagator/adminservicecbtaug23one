package com.cbt.adminservicecbtaug23one;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1")
public class MainRestController {


    @Autowired
    UserdetailRepository userdetailRepository;

    @Autowired
    UsertypelinkRepository usertypelinkRepository;

    @GetMapping("get/user/all/BUYER")
    public List<Optional<Userdetail>> getAllBuyers()
    {

        return usertypelinkRepository.findByType("BUYER").stream().map(usertypelink -> {

            return userdetailRepository.findById(usertypelink.getUsername());

        }).collect(Collectors.toList());

    }


}
