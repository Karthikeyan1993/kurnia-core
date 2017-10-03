package com.kgfsl.controller;

import com.kgfsl.entity.Proposer;
import com.kgfsl.repository.ProposerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class ProposerController {

    private final ProposerRepository proposerRepository;

    @Autowired
    public ProposerController(@Qualifier("proposerRepository") ProposerRepository proposerRepository) {
        this.proposerRepository = proposerRepository;
    }

    @RequestMapping(value = "proposer", method = RequestMethod.GET)
    public List <Proposer> proposerList( ) {
        return this.proposerRepository.findAll();
    }
}
