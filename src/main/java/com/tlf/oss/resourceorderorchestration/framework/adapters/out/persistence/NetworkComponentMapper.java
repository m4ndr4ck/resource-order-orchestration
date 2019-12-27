package com.tlf.oss.resourceorderorchestration.framework.adapters.out.persistence;

import com.tlf.oss.resourceorderorchestration.domain.NetworkComponent;
import org.springframework.stereotype.Component;

@Component
class NetworkComponentMapper {

    NetworkComponentEntity mapToMongoEntity(NetworkComponent networkComponent) {
        return new NetworkComponentEntity(
                networkComponent.getId().isPresent() ? null : null,
                networkComponent.getName(), networkComponent.getStatus().toString());
    }

    NetworkComponent mapToDomainEntity(NetworkComponentEntity networkComponent){
        return NetworkComponent.withId(
                networkComponent.getId(),
                networkComponent.getName(),
                NetworkComponent.STATUS.valueOf(networkComponent.getSTATUS())
                );
    }

}