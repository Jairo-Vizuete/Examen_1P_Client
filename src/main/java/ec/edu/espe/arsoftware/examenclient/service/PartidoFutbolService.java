package ec.edu.espe.arsoftware.examenclient.service;

import ec.edu.espe.arsoftware.examenclient.wsdl.ObtenerPartidoFutbolPorFechaRequest;
import ec.edu.espe.arsoftware.examenclient.wsdl.ObtenerPartidoFutbolPorFechaResponse;
import ec.edu.espe.arsoftware.examenclient.wsdl.PartidoFutbol;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

@Service
@Slf4j
@Component("PartidoFutbol")
public class PartidoFutbolService extends WebServiceGatewaySupport {

    private String endpoint = "http://localhost:8080/ws/partidoFutbol.wsdl";

    public List<PartidoFutbol> listarPorFecha() {

        ZonedDateTime fechaActual = ZonedDateTime.now();
        LocalDateTime fechaOpt = fechaActual.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().atStartOfDay();
        ObtenerPartidoFutbolPorFechaRequest request = new ObtenerPartidoFutbolPorFechaRequest();
        request.setFecha(fechaOpt);
        ObtenerPartidoFutbolPorFechaResponse response = (ObtenerPartidoFutbolPorFechaResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint, request);

        log.info("Los partidos en fechas son {} ", response.getPartidoFutbol().toString());

        return response.getPartidoFutbol();

    }
}
