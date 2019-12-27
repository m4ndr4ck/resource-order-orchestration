package com.tlf.oss.resourceorderorchestration.framework.adapters.out.persistence;

import com.tlf.oss.resourceorderorchestration.application.ports.out.CreateNetworkComponentOutPort;
import com.tlf.oss.resourceorderorchestration.application.ports.out.GetNetworkComponentOutPort;
import com.tlf.oss.resourceorderorchestration.domain.NetworkComponent;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
class NetworkComponentAdapter implements CreateNetworkComponentOutPort, GetNetworkComponentOutPort {

    @Autowired
    private final NetworkComponentRepository networkComponentRepository;

    private final NetworkComponentMapper networkComponentMapper;

    @Override
    public NetworkComponent createNetworkComponent(NetworkComponent networkComponent){
        NetworkComponentEntity entity = networkComponentRepository.save(networkComponentMapper.mapToMongoEntity(networkComponent));
        return networkComponentMapper.mapToDomainEntity(entity);
    }

    @Override
    public  NetworkComponent getNetworkComponent(String orderId){
        NetworkComponentEntity entity = networkComponentRepository.findById(orderId).get();
        return networkComponentMapper.mapToDomainEntity(entity);
    }
}
