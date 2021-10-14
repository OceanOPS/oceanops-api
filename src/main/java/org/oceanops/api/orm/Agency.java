package org.oceanops.api.orm;

import org.oceanops.api.orm.auto._Agency;

import io.agrest.annotation.ClientReadable;

@ClientReadable(id= true, value = {
    "name", "nameShort", "description", "tel", "fax", "email", "address", "country", "weblink", "ref", "pogoMember"
})
public class Agency extends _Agency {

    private static final long serialVersionUID = 1L;

}
