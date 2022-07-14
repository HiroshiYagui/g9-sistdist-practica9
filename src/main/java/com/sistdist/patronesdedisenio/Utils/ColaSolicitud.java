package com.sistdist.patronesdedisenio.Utils;

import java.util.LinkedList;
import java.util.Queue;

import com.sistdist.patronesdedisenio.Entidades.Reclamo;
import com.sistdist.patronesdedisenio.Entidades.ReclamoSolicitud;
import com.sistdist.patronesdedisenio.Utils.Estrategias.EstrategiaPrimero;

public final class ColaSolicitud {
    private static ColaSolicitud INSTANCE;
    private Queue<Reclamo> cola =new LinkedList<Reclamo>();
    private EstrategiaCola estrategiaCola=new EstrategiaPrimero();
    
    private ColaSolicitud(){
    }


    public static ColaSolicitud getCola(){
        if(INSTANCE==null){
            INSTANCE=new ColaSolicitud();
        }
        return INSTANCE;
    }

    public void ponerReclamo(Reclamo reclamo){
        cola.add(reclamo);
        System.out.println("Cola Agregada");
        System.out.println(reclamo.getComentario());
    }

    public ReclamoSolicitud sacarReclamo(){
        System.out.println("Cola Sacada");
        ReclamoSolicitud ec=estrategiaCola.ObtenerReclamo();
        System.out.println(ec.getComentario());
        return ec;
    }

    public void cambiarEstrategia(EstrategiaCola estrategiaCola){
        System.out.println("Estrategia Cambiada");
        this.estrategiaCola=estrategiaCola;
    }

    public ReclamoSolicitud SacarPrimero(){
        System.out.println("Primero visto");
        Reclamo reclamo=cola.peek();
        return new ReclamoSolicitud(reclamo.getNombre(), reclamo.getEmail(), reclamo.getComentario()); 
    }

    public ReclamoSolicitud ResolverPrimero(){
        System.out.println("Primero Resuelto");
        Reclamo reclamo=cola.remove();

        return new ReclamoSolicitud(reclamo.getNombre(), reclamo.getEmail(), reclamo.getComentario()); 
    }

}
