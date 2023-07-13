/**
 * 
 */
package ayush.dev.movies;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author amand
 *
 */
@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movierepository;
	public List<Movie> allMovies(){
		return movierepository.findAll(); 
	}

	public Optional<Movie>getOneMovie(ObjectId id){
		return movierepository.findById(id);
	}
	public Optional<Movie>MovieByImdb(String imdbId){
		return movierepository.findMovieByImdbId(imdbId);
	}
}
