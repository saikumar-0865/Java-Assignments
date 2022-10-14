package com.valtech.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

//import javax.swing.tree.RowMapper;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springsource.tcserver.serviceability.request.DataSource;
import com.valtech.Car;
import com.valtech.CarDetails;

public class CarDAOImpl implements CarDAO {
	
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void save(Car car){
		
		
		JdbcTemplate temp = new JdbcTemplate(dataSource);
		
		temp.update("insert into car (Kms, numOfOwners,validInsurance,color,make,model,price,yearmanufactured,version)"+ "values(?,?,?,?,?,?,?,?,?)"
		,car.getCardetails().getKms(),car.getCardetails().getNumofOwners(),car.getCardetails().isValidInsurance(),
		car.getColor(),car.getMake(),car.getModel(),car.getPrice(),car.getYearmanufactured(),car.getVersion(),car.getId());
		
		
		
		
	}
	
   public void update(Car car){
	   

	   JdbcTemplate temp= new JdbcTemplate(dataSource);
       temp.update("update car set kms=?, numOfOwners=?, validInsurance=?, color=?, make=?, model=?,price=?,yearManufactured=?,version=?,id=?"
               ,car.getCardetails().getKms(),car.getCardetails().getNumofOwners(),car.getCardetails().isValidInsurance(),
               car.getColor(),car.getMake(),car.getModel(),car.getPrice(),car.getYearmanufactured(),car.getVersion(),car.getId());
		
		
	}

    /* (non-Javadoc)
	 * @see com.valtech.spring.jdbc.CarDAO#delete(com.valtech.Car)
	 */
    @Override
	public void delete(Car car){
    	  JdbcTemplate temp= new JdbcTemplate(dataSource);
    	  
    	  temp.update("delete from car where id = ?",car.getId());
    	
    	
	
	
    }
    
    private static class CarRowMapper implements RowMapper<Car> {

		@Override
		public Car mapRow(ResultSet rs, int row) throws SQLException {
			
			int kms = rs.getInt(1);
			int numOfOwners = rs.getInt(2);
			boolean validinsurance = rs.getBoolean(3);
			CarDetails cd = new CarDetails(kms, validinsurance, numOfOwners);
			String color = rs.getString(4);
			String make = rs.getString(5);
			String model = rs.getString(6);
			float price = rs.getFloat(7);
			int yearmanufactured = rs.getInt(8);
			int id = rs.getInt(9);
			
			/*Car car = new Car(id,make,model,yearmanufactured,price,color,cd);*/
			Car car = new Car(make, model, yearmanufactured, price, color,cd);
			return car;
		}
    	
    	
    }

     /* (non-Javadoc)
	 * @see com.valtech.spring.jdbc.CarDAO#get(int)
	 */
    @Override
	public Car get(int id){
    	 JdbcTemplate temp= new JdbcTemplate(dataSource);
         return temp.queryForObject("select kms,numOfOwners,validInsurance,color,make,model,price,yearManufactured,version from car where id=?", new CarRowMapper(), id);
	
	
	
	
    }
     
     /* (non-Javadoc)
	 * @see com.valtech.spring.jdbc.CarDAO#getAll()
	 */
    @Override
	public List<Car> getAll(){
         JdbcTemplate temp=new JdbcTemplate(dataSource);
         return temp.query
                 ("Select kms,numOfOwners,validInsurance,color,make,model,price,yearManufactured,version from car",new CarRowMapper());
     
        
     }
	
	
	
	

}
