package com.tlf.oss.resourceorderorchestration.application.ports.in;

import com.tlf.oss.resourceorderorchestration.application.ports.out.CreateNetworkComponentOutPort;
import com.tlf.oss.resourceorderorchestration.application.usecases.CreateNetworkComponentUseCase;
import com.tlf.oss.resourceorderorchestration.domain.NetworkComponent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Component
@Transactional
public class CreateNetworkComponentInPort implements CreateNetworkComponentUseCase {

    private NetworkComponent networkComponent;
    private final CreateNetworkComponentOutPort createNetworkComponentOutPort;

    /**
     * Persiste componente de rede.
     * @param
     * @return
     */
    @Override
    public NetworkComponent createNetworkComponent(CreateNetworkComponentCommand command){
        networkComponent = NetworkComponent.withoutId(null,
                command.getNetworkComponent().getName(),
                command.getNetworkComponent().getStatus());
        return createNetworkComponentOutPort.createNetworkComponent(networkComponent);

    }

}
