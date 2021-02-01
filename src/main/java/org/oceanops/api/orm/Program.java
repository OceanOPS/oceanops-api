package org.oceanops.api.orm;

import org.oceanops.api.orm.auto._Program;

import io.agrest.annotation.ClientReadable;

@ClientReadable(id = true, value = {
    "id", "name", "nameShort", "description", "active", "network", "wigosCode", "country", "cruisePrograms", "images", "linePrograms", "network",
    "programAgencies", "programContacts", "ptfs", "shipRecruitments", "weblinks"    
})
public class Program extends _Program {

    private static final long serialVersionUID = 1L;

}
