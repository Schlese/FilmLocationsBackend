package site.thuer.FilmLocationsBackend;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class FilmLocationsBackendApplicationTests
{
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void find_allFilmLocations_OK() throws Exception
	{
		mockMvc.perform(get("/filmLocations"))
				.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk())
				.andExpect(jsonPath("filmLocations", hasSize(1000)))
				.andExpect(jsonPath("filmLocations[0].title", is("180")));
	}

	@Test
	public void find_filmLocationsByTitle_OK() throws Exception
	{
		mockMvc.perform(get("/filmLocations/search?title=18"))
				.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk())
				.andExpect(jsonPath("filmLocations", hasSize(8)))
				.andExpect(jsonPath("filmLocations[0].title", is("180")));
	}
}
