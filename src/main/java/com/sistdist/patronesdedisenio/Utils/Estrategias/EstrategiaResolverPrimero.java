package com.sistdist.patronesdedisenio.Utils.Estrategias;

import com.sistdist.patronesdedisenio.Entidades.ReclamoSolicitud;
import com.sistdist.patronesdedisenio.Utils.ColaSolicitud;
import com.sistdist.patronesdedisenio.Utils.EstrategiaCola;

public class EstrategiaResolverPrimero implements EstrategiaCola{

    @Override
    public ReclamoSolicitud ObtenerReclamo() {
       return ColaSolicitud.getCola().ResolverPrimero();
    }
    
}
