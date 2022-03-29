package com.pig4cloud.pig.common.feign.security;

import com.pig4cloud.pig.common.core.constant.SecurityConstants;
import feign.RequestInterceptor;
import feign.RequestTemplate;

public class SecurityInterceptor implements RequestInterceptor {
	@Override
	public void apply(RequestTemplate requestTemplate) {
		requestTemplate.header(SecurityConstants.FROM,SecurityConstants.FROM_IN);
	}
}
