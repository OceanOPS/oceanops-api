package org.oceanops.api.orm;

import org.oceanops.api.orm.auto._Telecom;

import io.agrest.annotation.ClientReadable;

@ClientReadable(id = true, value = {
	"num","refProg","startDate","endDate", "frequency", "telecomFormat", "telecomService", "telecomType"})
public class Telecom extends _Telecom {

    private static final long serialVersionUID = 1L;

}
