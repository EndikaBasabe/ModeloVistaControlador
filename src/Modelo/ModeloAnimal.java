package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Clases.Animal;


public class ModeloAnimal extends Conector{
	
	
	public ArrayList<Animal> select(){
		ArrayList<Animal> animales = new ArrayList<Animal>();
		
		try {
			Statement st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from animal");
			while (rs.next()) {
				animales.add(new Animal(rs.getInt("id"), rs.getString("Nombre")));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return animales;	
	}
	
	public void insert(Animal animal){
		try {
			PreparedStatement ps = this.conexion
					.prepareStatement("insert into animales (id, nombre) values(?,?)");

			ps.setInt(1, animal.getId()); 
			ps.setString(2, animal.getNombre()); 
			
			ps.execute();
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
