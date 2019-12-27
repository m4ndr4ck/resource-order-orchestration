package com.tlf.oss.resourceorderorchestration.application.ports.in;

import com.tlf.oss.resourceorderorchestration.application.ports.out.GetNetworkComponentOutPort;
import com.tlf.oss.resourceorderorchestration.application.queries.GetNetworkComponentQuery;
import com.tlf.oss.resourceorderorchestration.domain.NetworkComponent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Component
@Transactional
public class GetNetworkComponentInPort implements GetNetworkComponentQuery {

    private final GetNetworkComponentOutPort getNetworkComponentOutPort;

    @Override
    public NetworkComponent getNetworkComponent(GetNetworkComponentCommand getNetworkComponentCommand){
        return getNetworkComponentOutPort.getNetworkComponent(getNetworkComponentCommand.getId());
    }
}
