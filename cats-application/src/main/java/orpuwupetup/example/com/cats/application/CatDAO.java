package orpuwupetup.example.com.cats.application;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import orpuwupetup.example.com.cats.domain.Cat;

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
