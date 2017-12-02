package com.minna.sharingeconomy.member.domain;

import lombok.Builder;
import lombok.Getter;

/**
 * @author Dennis Kim
 */
@Getter
@Builder
public class Member {
	private String firstName;
	private String lastName;
	private String userId;
	private String password;
	private String email;
	private String phoneNumber;
}
