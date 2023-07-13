/**
 * 
 */
package ayush.dev.movies;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author amand
 *
 */

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/v1/movies")
//@CrossOrigin(origins = "http://localhost 3000")
public class MovieController {
	
	@Autowired
	private MovieService movieservice;
	
	@GetMapping
	public ResponseEntity<List<Movie>> getMovies() {
		return new ResponseEntity<List<Movie>>(movieservice.allMovies(), HttpStatus.OK) ;
	}

//	@GetMapping("/{id}")
//	public ResponseEntity<Optional<Movie>> getBYId(@PathVariable ObjectId id){
//		return new ResponseEntity<Optional<Movie>>(movieservice.getOneMovie(id), HttpStatus.OK);
//	}
	@GetMapping("/{imdbId}")
	public ResponseEntity<Optional<Movie>>movieByImdb(@PathVariable String imdbId){
		return new ResponseEntity<Optional<Movie>>(movieservice.MovieByImdb(imdbId),HttpStatus.OK);
	}
}
 