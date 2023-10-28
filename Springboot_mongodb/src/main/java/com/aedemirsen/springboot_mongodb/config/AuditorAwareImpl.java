package com.aedemirsen.springboot_mongodb.config;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;
import java.util.UUID;

public class AuditorAwareImpl implements AuditorAware<UUID> {

    @Override
    public Optional<UUID> getCurrentAuditor() {
        // TODO: get the user from the security context
        return Optional.of(UUID.randomUUID());
    }
}
