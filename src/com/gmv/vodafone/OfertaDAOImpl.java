package com.gmv.vodafone;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OfertaDAOImpl implements OfertaDAO {

	private static List<Oferta> ofertas = new ArrayList<>();
	
	static {
		Oferta of1 = new Oferta();
		of1.setCodigoOferta(1);
		of1.setReferencia("LIJA553");
		of1.setFechaInicio(LocalDate.of(2017, 5, 1));
		ofertas.add(of1);
		
		Oferta of2 = new Oferta();
		of2.setCodigoOferta(2);
		of2.setReferencia("FIB300");
		of2.setFechaInicio(LocalDate.of(2017, 5, 16));
		ofertas.add(of2);
	}
	
	@Override
	public List<Oferta> getOfertas() throws OfertaException {
		return ofertas;
	}

	@Override
	public Oferta getOferta(int codigoOferta) throws OfertaException {
		for(Oferta oferta : ofertas) {
			if(oferta.getCodigoOferta()==codigoOferta) {
				return oferta;
			}
		}
		throw new IllegalArgumentException();
	}

	@Override
	public LocalDate getFechaOferta(int codigoOferta) throws OfertaException {
		for(Oferta oferta : ofertas) {
			if(oferta.getCodigoOferta()==codigoOferta) {
				return oferta.getFechaInicio();
			}
		}
		throw new IllegalArgumentException();
	}

}
