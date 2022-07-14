package com.sistdist.patronesdedisenio.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistdist.patronesdedisenio.Entidades.ReclamoSolicitud;
import com.sistdist.patronesdedisenio.Servicios.SolicitudServicio;

import static org.springframework.http.ResponseEntity.status;


@RestController
@RequestMapping("/v1")
public class SolicitudControlador {
    
    @Autowired
    private SolicitudServicio solicitudServicio;


    @GetMapping("/sacar")
    public ResponseEntity<ReclamoSolicitud> sacarReclamo(){
        System.out.println("Solicitud Sacar adquirida");
        return status(HttpStatus.OK).body(solicitudServicio.ObtenerReclamo());
    }

    @PostMapping("/poner")
    public ResponseEntity<String> ponerReclamo(@RequestBody ReclamoSolicitud reclamoSolicitud){
        System.out.println("Solicitud Poner adquirida");
        solicitudServicio.PonerReclamo(reclamoSolicitud);
        return status(HttpStatus.OK).body("Reclamo Puesto");
    }

    @PostMapping("/cambiar/{opcion}")
    public ResponseEntity<String> cambiarTipo(@PathVariable int opcion){
        System.out.println("Solicitud Cambiar adquirida");
        solicitudServicio.CambiarTipoDeLectura(opcion);
        return status(HttpStatus.OK).body("Tipo Cambiado");
    }
}
