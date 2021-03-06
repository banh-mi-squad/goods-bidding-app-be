package org.banhmisquad.goodsbidding.controller;

import org.banhmisquad.goodsbidding.security.dto.LoginRequest;
import org.banhmisquad.goodsbidding.security.dto.LoginResponse;
import org.banhmisquad.goodsbidding.security.jwt.JwtTokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/login")
public class LoginController {

	private final JwtTokenService jwtTokenService;

	@PostMapping
	public ResponseEntity<LoginResponse> loginRequest(@Valid @RequestBody LoginRequest loginRequest) {

		final LoginResponse loginResponse = jwtTokenService.getLoginResponse(loginRequest);

		return ResponseEntity.ok(loginResponse);
	}

}
