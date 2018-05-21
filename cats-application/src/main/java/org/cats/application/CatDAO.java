package org.cats.application;

import java.util.ArrayList;
import java.util.List;

import org.cats.domain.Cat;
import org.springframework.stereotype.Repository;

@Repository
public class CatDAO {

	private List<Cat> catsList;
	
	public CatDAO() {
		catsList = new ArrayList<Cat>();
	}
	
	public void putInCat(Cat cat) {
		
		catsList.add(cat);
		
	}
	
	public List<Cat> getCatsList() {
		return catsList;
	}
	
	public Cat getCatById(int id) {
		if(id<catsList.size()) {
			return catsList.get(id);
		}else {
			return null;
		}
	}
	
}
