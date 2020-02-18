package model.entidad.dao.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import model.entidad.Accidente;
import model.entidad.Distritos;
import model.entidad.Estadisticas;
import model.entidad.Sexo;
import model.entidad.Tipos;

public interface AccidentesMapper {

	public ArrayList<Accidente> busquedaGeneral();

	public Tipos TipoPorId(@Param("id") int id);

	public Accidente getAccidente(@Param("id") int id);

	public Distritos distritoPorId(@Param("id") int id);

	public ArrayList<Estadisticas> getEstadisticas(@Param("inicio") String inicio, @Param("fin") String fin);
	
	public ArrayList<Estadisticas> getEstadisticasSexo(@Param("inicio") String inicio, @Param("fin") String fin, @Param("distrito") String distrito);


	public ArrayList<Accidente> busquedaAccidente(@Param("tipo") String tipo, @Param("fecha") String fecha);

	public ArrayList<Accidente> busquedaAccidenteDespues(@Param("tipo") String tipo, @Param("fecha") String fecha);

	public ArrayList<Distritos> busquedaGeneralDistritos();

	public ArrayList<Tipos> busquedaGeneralTipos();
	
	public ArrayList<Sexo> getSexos();

}
