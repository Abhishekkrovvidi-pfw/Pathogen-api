package com.abCodes.pathogen.Pathogen_api;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SampleRepository extends JpaRepository<Sample,String> {

    List<Sample> findByClassificationIgnoreCase(String classification);
}
