package com.QuesTyme.security;

import com.QuesTyme.dto.UserDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtAuthResponse {

	private String token;
	private UserDto user;
}
