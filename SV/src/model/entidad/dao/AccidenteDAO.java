package model.entidad.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import model.MyBatisUtil;
import model.entidad.Accidente;
import model.entidad.Distritos;
import model.entidad.Estadisticas;
import model.entidad.Sexo;
import model.entidad.Tipos;
import model.entidad.Usuario;
import model.entidad.Vehiculo;
import model.entidad.dao.mapper.AccidentesMapper;
import model.entidad.dao.mapper.UsuarioMapper;

public class AccidenteDAO  {
	private static final Logger logger = (Logger) LoggerFactory.getLogger(AccidenteDAO.class);

	/**
	 * Busqueda de todos los accidentes
	 * 
	 * @return ArrayList con los accidentes
	 */
	public ArrayList<Accidente> busquedaGeneral() {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			AccidentesMapper accidenteMapper = sqlSession.getMapper(AccidentesMapper.class);
			return accidenteMapper.busquedaGeneral();
		} catch (Exception e) {
			logger.error(e.getMessage());
			ArrayList<Accidente> uArr = new ArrayList<Accidente>();
			return uArr;
		} finally {
			sqlSession.close();
		}
	}

	/**
	 * Busqueda de tipo por id
	 * 
	 * @param id id del tipo de accidente
	 * @return Objeto de tipos
	 */
	public Tipos TipoPorId(int id) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			AccidentesMapper accidenteMapper = sqlSession.getMapper(AccidentesMapper.class);
			return accidenteMapper.TipoPorId(id);
		} catch (Exception e) {
			logger.error(e.getMessage());
			Tipos t = new Tipos();
			return t;
		} finally {
			sqlSession.close();
		}
	}

	/**
	 * Conseguir un accidente por id
	 * 
	 * @param id id del accidente
	 * @return objeto accidente
	 */
	public Accidente getAccidente(int id) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			AccidentesMapper accidenteMapper = sqlSession.getMapper(AccidentesMapper.class);
			return accidenteMapper.getAccidente(id);
		} catch (Exception e) {
			logger.error(e.getMessage());
			Accidente t = new Accidente();
			return t;
		} finally {
			sqlSession.close();
		}
	}

	/**
	 * Consigue un distrito por id
	 * 
	 * @param id id del distrito
	 * @return objeto distrito
	 */
	public Distritos distritoPorId(int id) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			AccidentesMapper accidenteMapper = sqlSession.getMapper(AccidentesMapper.class);
			return accidenteMapper.distritoPorId(id);
		} catch (Exception e) {
			logger.error(e.getMessage());
			Distritos t = new Distritos();
			return t;
		} finally {
			sqlSession.close();
		}
	}

	/**
	 * Devuelve todas las estadisticas
	 * 
	 * @return Arraylist con todas las estadisticas
	 */
	public ArrayList<Estadisticas> getEstadisticas(String inicio, String fin) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			AccidentesMapper accidenteMapper = sqlSession.getMapper(AccidentesMapper.class);
			return accidenteMapper.getEstadisticas(inicio, fin);
		} catch (Exception e) {
			logger.error(e.getMessage());
			ArrayList<Estadisticas> uArr = new ArrayList<Estadisticas>();
			return uArr;
		} finally {
			sqlSession.close();
		}
	}




	/**
	 * Devuelve todos los distritos
	 * 
	 * @return ArrayList de Distritos
	 */
	public ArrayList<Distritos> busquedaGeneralDistritos() {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			AccidentesMapper accidenteMapper = sqlSession.getMapper(AccidentesMapper.class);
			return accidenteMapper.busquedaGeneralDistritos();
		} catch (Exception e) {
			logger.error(e.getMessage());
			ArrayList<Distritos> uArr = new ArrayList<Distritos>();
			return uArr;
		} finally {
			sqlSession.close();
		}
	}

	/**
	 * Devuelve todos los tipos de accidentes
	 * 
	 * @return ArrayList de tipos de accidentes
	 */
	public ArrayList<Tipos> busquedaGeneralTipos() {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			AccidentesMapper accidenteMapper = sqlSession.getMapper(AccidentesMapper.class);
			return accidenteMapper.busquedaGeneralTipos();
		} catch (Exception e) {
			logger.error(e.getMessage());
			ArrayList<Tipos> uArr = new ArrayList<Tipos>();
			return uArr;
		} finally {
			sqlSession.close();
		}
	}

	/**
	 * Recupera un usuario por id
	 * 
	 * @param id id de usuario
	 * @return objeto usuario
	 */
	public Usuario usuarioPorId(Integer id) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			UsuarioMapper usuarioMapper = sqlSession.getMapper(UsuarioMapper.class);
			return usuarioMapper.usuarioPorId(id);
		} catch (Exception e) {
			logger.error(e.getMessage());
			Usuario t = new Usuario();
			return t;
		} finally {
			sqlSession.close();
		}
	}

	/**
	 * Recupera el usuario segun su pass y nombre
	 * 
	 * @param nombre nombre de usuario
	 * @param pass   pass del usuario
	 * @return objeto usuario
	 */
	public Usuario getUsuario(String nombre, String pass) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			UsuarioMapper usuarioMapper = sqlSession.getMapper(UsuarioMapper.class);
			return usuarioMapper.getUsuario(nombre, pass);
		} catch (Exception e) {
			logger.error(e.getMessage());
			Usuario t = new Usuario();
			return t;
		} finally {
			sqlSession.close();
		}
	}

	/**
	 * Devuelve estadisticas segun los datos
	 * 
	 * @param inicio   fecha de inicio
	 * @param fin      fecha fin
	 * @param distrito distrito que mirar
	 * @return arraylist de estadisticas
	 */
	public ArrayList<Estadisticas> getEstadisticasSexo(String inicio, String fin, Integer distrito) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			AccidentesMapper accidenteMapper = sqlSession.getMapper(AccidentesMapper.class);
			return accidenteMapper.getEstadisticasSexo(inicio, fin, distrito);
		} catch (Exception e) {
			logger.error(e.getMessage());
			ArrayList<Estadisticas> uArr = new ArrayList<Estadisticas>();
			return uArr;
		} finally {
			sqlSession.close();
		}
	}

	/**
	 * Recupera los sexos
	 * 
	 * @return arraylist de sexos
	 */
	public ArrayList<Sexo> getSexos() {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			AccidentesMapper accidenteMapper = sqlSession.getMapper(AccidentesMapper.class);
			return accidenteMapper.getSexos();
		} catch (Exception e) {
			logger.error(e.getMessage());
			ArrayList<Sexo> uArr = new ArrayList<Sexo>();
			return uArr;
		} finally {
			sqlSession.close();
		}
	}

	/**
	 * Recupera los vehiculos
	 * 
	 * @return arraylist de vehiculos
	 */
	public ArrayList<Vehiculo> getVehiculos() {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			AccidentesMapper accidenteMapper = sqlSession.getMapper(AccidentesMapper.class);
			return accidenteMapper.getVehiculos();
		} catch (Exception e) {
			logger.error(e.getMessage());
			ArrayList<Vehiculo> uArr = new ArrayList<Vehiculo>();
			return uArr;
		} finally {
			sqlSession.close();
		}
	}

	/**
	 * Inserta un accidente
	 * 
	 * @param a accidente a insertar
	 * @return 1 o 0 segun si funciona el insert
	 */
	public Integer insertAccidente(Accidente a) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			AccidentesMapper accidenteMapper = sqlSession.getMapper(AccidentesMapper.class);
			accidenteMapper.insertAccidente(a);
			sqlSession.commit();
			return 1;
		} catch (Exception e) {
			logger.error(e.getMessage());

			return 0;
		} finally {
			sqlSession.close();
		}
	}

	/**
	 * Actualiza un accidente
	 * 
	 * @param a accidente a actualizar
	 * @return 1 o 0 segun si funciona la actualizacion
	 */
	public Integer updateAccidente(Accidente a) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			AccidentesMapper accidenteMapper = sqlSession.getMapper(AccidentesMapper.class);
			accidenteMapper.updateAccidente(a);
			sqlSession.commit();
			return 1;
		} catch (Exception e) {
			logger.error(e.getMessage());

			return 0;
		} finally {
			sqlSession.close();
		}
	}

	/**
	 * Borra un accidente
	 * @param id id de accidente a borrar
	 */
	public void deleteAccidente(Integer id) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			AccidentesMapper accidenteMapper = sqlSession.getMapper(AccidentesMapper.class);
			accidenteMapper.deleteAccidente(id);
			;
			sqlSession.commit();
		} catch (Exception e) {
			logger.error(e.getMessage());

		} finally {
			sqlSession.close();
		}
	}

}
