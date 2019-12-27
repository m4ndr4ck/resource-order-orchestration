package com.tlf.oss.resourceorderorchestration.application.queries;

import com.tlf.oss.resourceorderorchestration.domain.NetworkComponent;
import com.tlf.oss.resourceorderorchestration.framework.helpers.SelfValidating;
import lombok.EqualsAndHashCode;
import lombok.Value;

import javax.validation.constraints.NotNull;

public interface GetNetworkComponentQuery {

    NetworkComponent getNetworkComponent(GetNetworkComponentCommand getNetworkComponentCommand);

    @Value
    @EqualsAndHashCode(callSuper = false)
    class GetNetworkComponentCommand  extends SelfValidating<GetNetworkComponentCommand> {

        @NotNull
        private final String id;


        public GetNetworkComponentCommand(String id) {
            this.id = id;
        }
    }
}
