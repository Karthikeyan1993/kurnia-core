package com.kgfsl.repository;

import com.kgfsl.entity.Proposer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("proposerRepository")
public interface ProposerRepository extends JpaRepository <Proposer, Long> {
}
