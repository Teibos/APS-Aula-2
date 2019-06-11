package br.ufpb.dcx.aps.aula2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarcaService {
	
	private Map<Integer,Marca> marcas = new HashMap<Integer,Marca>();
	
	private int proximoId = 1;
	
	public int cadastrar(Marca vw) {
		this.marcas.put(proximoId,vw);
		return proximoId++;
		
	}

	public Marca get(int vwId) {
		// TODO Stub de método gerado automaticamente
		return null;
	}
	
	

}
