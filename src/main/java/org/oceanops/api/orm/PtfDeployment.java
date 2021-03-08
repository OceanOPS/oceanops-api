package org.oceanops.api.orm;

/*import java.nio.ByteBuffer;

import com.esri.core.geometry.Geometry;
import com.esri.core.geometry.GeometryEngine;
import com.esri.core.geometry.ogc.OGCGeometry;*/

import org.oceanops.api.orm.auto._PtfDeployment;

import io.agrest.annotation.ClientReadable;

@ClientReadable(id = true, value = {
    "id","cruiseName", "ctd", "ctdRef", "ctdo2", "density", "deplDate", "deplHeight", "deplSpeed", "label", "lat", "lon", 
    "maxMooringDepth", "noSite", "refStationId", "score", "shape", "shipName", "windSpeed",
    "contact", "country", "cruise", "deplMethod", "deplType", "packType", "ship"})
public class PtfDeployment extends _PtfDeployment {

    private static final long serialVersionUID = 1L;
    
}
