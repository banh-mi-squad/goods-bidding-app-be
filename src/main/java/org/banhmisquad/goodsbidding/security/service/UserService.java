package org.banhmisquad.goodsbidding.security.service;

import org.banhmisquad.goodsbidding.model.User;
import org.banhmisquad.goodsbidding.security.dto.AuthenticatedUserDto;
import org.banhmisquad.goodsbidding.security.dto.RegistrationRequest;
import org.banhmisquad.goodsbidding.security.dto.RegistrationResponse;


public interface UserService {

	User findByUsername(String username);

	RegistrationResponse registration(RegistrationRequest registrationRequest);

	AuthenticatedUserDto findAuthenticatedUserByUsername(String username);

}
