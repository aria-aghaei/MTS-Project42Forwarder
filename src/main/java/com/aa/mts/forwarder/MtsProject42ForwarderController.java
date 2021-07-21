package com.aa.mts.forwarder;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/forward")
public class MtsProject42ForwarderController {
	
	@GetMapping("/ping")
	public @ResponseBody String ping() {
		return "pong";
	}
	
	@PostMapping
	public @ResponseBody String forward(@RequestBody CellInfo formData) {
		
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<CellInfo> request = new HttpEntity<CellInfo>(formData, headers);
		ResponseEntity<String> out = restTemplate.exchange("http://localhost/api/mobility", HttpMethod.POST, request, String.class);
		return out.getBody();
	}

}
