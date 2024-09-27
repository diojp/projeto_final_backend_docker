package com.gov.aesa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gov.aesa.model.AcudeVO;

@Repository
public interface AcudeRepository extends JpaRepository<AcudeVO, Long> {

	AcudeVO findByNome(String nome);
}
