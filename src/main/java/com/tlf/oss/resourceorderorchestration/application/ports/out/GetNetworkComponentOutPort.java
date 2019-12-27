package com.tlf.oss.resourceorderorchestration.application.ports.out;

import com.tlf.oss.resourceorderorchestration.domain.NetworkComponent;

public interface GetNetworkComponentOutPort {

    NetworkComponent getNetworkComponent(String id);
}
