package dad.practica.pesemu.servicio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dad.practica.pesemu.model.Factura;

@RestController
public class Controlador {

	@PostMapping(value = "/")
	@ResponseStatus(HttpStatus.CREATED)
	public void generaFicheroFactura(@RequestBody Factura factura) {
		String nombreFactura = new String();
		try {
			String pathFacturas = System.getProperty("user.home") + "/facturas";
			new File(pathFacturas).mkdirs();
			nombreFactura = "factura" + LocalDate.now().toString() + "-" + LocalTime.now().toString() + ".txt";
			PrintWriter pw = new PrintWriter(new FileWriter(pathFacturas + "/" + nombreFactura));
			pw.print(factura);
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
