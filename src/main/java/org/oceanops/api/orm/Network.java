package org.oceanops.api.orm;

import org.oceanops.api.orm.auto._Network;

import io.agrest.annotation.ClientReadable;

@ClientReadable(id = true, value = {
    "name", "nameShort", "description", "rank", "parentNetworkId", "wigosCode"
})
public class Network extends _Network {

    private static final long serialVersionUID = 1L;

}
