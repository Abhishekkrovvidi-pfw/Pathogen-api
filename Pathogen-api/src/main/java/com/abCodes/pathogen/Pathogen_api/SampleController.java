package com.abCodes.pathogen.Pathogen_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/samples")
public class SampleController {

    @Autowired
    private SampleService sampleService;

    // POST /samples - Adds a new sample
    @PostMapping
    public Sample addSample(@RequestBody Sample sample) {
        sampleService.addSample(sample);
        return sample;
    }

    // GET /samples?status=positive - Filters samples by status
    @GetMapping
    public List<Sample> getSamples(@RequestParam(value = "status", required = false) String status) {
        if (status != null) {
            return sampleService.getSamplesByStatus(status);
        }
        return sampleService.getAllSamples();
    }
}
