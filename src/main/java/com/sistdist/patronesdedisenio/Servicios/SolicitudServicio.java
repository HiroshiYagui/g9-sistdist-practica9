package com.sistdist.patronesdedisenio.Servicios;

import org.springframework.stereotype.Service;

import com.sistdist.patronesdedisenio.Entidades.Reclamo;
import com.sistdist.patronesdedisenio.Entidades.ReclamoSolicitud;
import com.sistdist.patronesdedisenio.Utils.ColaSolicitud;
import com.sistdist.patronesdedisenio.Utils.Estrategias.EstrategiaPrimero;
import com.sistdist.patronesdedisenio.Utils.Estrategias.EstrategiaResolverPrimero;

@Service
public class SolicitudServicio {
    
    public ReclamoSolicitud ObtenerReclamo(){
        System.out.println("Servicio Activado");
        return ColaSolicitud.getCola().sacarReclamo();
    }

    public void PonerReclamo(ReclamoSolicitud reclamoSolicitud){
        System.out.println("Servicio Activado");
        Reclamo reclamo= new Reclamo.ReclamoBuilder(reclamoSolicitud.getComentario())
                                    .AddNombre(reclamoSolicitud.getNombre())
                                    .AddEmail(reclamoSolicitud.getEmail())
                                    .build();
        System.out.println(reclamoSolicitud.getComentario());
        System.out.println(reclamo.getComentario());
        ColaSolicitud.getCola().ponerReclamo(reclamo);
    }

    public void CambiarTipoDeLectura(int opcion){
        System.out.println("Servicio Activado");
        switch(opcion){
            case 1: ColaSolicitud.getCola().cambiarEstrategia(new EstrategiaPrimero());break;
            case 2: ColaSolicitud.getCola().cambiarEstrategia(new EstrategiaResolverPrimero());break;
            default: break;
        }
        
    }
}
