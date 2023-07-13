/**
 * 
 */
package ayush.dev.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author amand
 *
 */

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

     Optional<Movie>findMovieByImdbId(String imdbId);

}
